# Library-Book-Catalog-REST-API
Tech Stack: Java 8+  Spring Boot  REST API (using Spring MVC)  In-memory data store (ConcurrentHashMap)  Input validation via Java Bean Validation

 Project Structure:
 src/
├── main/
│   ├── java/
│   │   └── com.example.library/
│   │       ├── controller/
│   │       │   └── BookController.java
│   │       ├── model/
│   │       │   └── Book.java
│   │       ├── service/
│   │       │   └── BookService.java
│   │       └── LibraryApplication.java
│   └── resources/
│       └── application.properties

Sample API Usage (via Postman):
POST /api/books
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884"
}

# Library Book Catalog API

A simple REST API for managing a library's book catalog using Spring Boot.

## How to Run

```bash
git clone https://github.com/yourusername/library-api.git
cd library-api
mvn spring-boot:run


The app runs on http://localhost:8080


Sample Requests
POST /api/books – Add book

GET /api/books – Get all books

GET /api/books/{id} – Get book by ID

DELETE /api/books/{id} – Delete a book

PATCH /api/books/{id}/availability?available=false – Update availability
