
package com.example.library.service;

import com.example.library.model.Book;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class BookService {
    private final Map<Integer, Book> bookMap = new ConcurrentHashMap<>();
    private final AtomicInteger idCounter = new AtomicInteger(1);

    public Book addBook(Book book) {
        int id = idCounter.getAndIncrement();
        book.setId(id);
        bookMap.put(id, book);
        return book;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookMap.values());
    }

    public Book getBookById(int id) {
        return bookMap.get(id);
    }

    public boolean deleteBook(int id) {
        return bookMap.remove(id) != null;
    }

    public Book updateAvailability(int id, boolean availability) {
        Book book = bookMap.get(id);
        if (book != null) {
            book.setAvailable(availability);
        }
        return book;
    }
}
