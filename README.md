# Goodreads Spring Boot REST API

This project is a **Spring Boot REST API** that simulates a basic Goodreads-like application.  
It allows users to **manage books** with CRUD operations. The data is stored in an **in-memory HashMap**, meaning it resets every time the application restarts.

---

## **Features**
- Get a list of all books
- Get details of a single book by ID
- Add a new book
- Update details of an existing book
- Delete a book

---

## **Tech Stack**
- **Java 21**
- **Spring Boot 3.5.6**
- **Maven**

---

## **Project Structure**
    goodreads/
    ├── src/
    │ └── main/java/com/example/goodreads/
    │ ├── Book.java
    │ ├── BookController.java
    │ ├── BookRepository.java
    │ ├── BookService.java
    │ └── GoodreadsApplication.java
    ├── pom.xml
    └── README.md


---

## **Initial Data**
When the application starts, two books are preloaded in the `HashMap`:

| Book ID | Name          | Image URL          |
|---------|---------------|--------------------|
| 1       | Harry Potter  | harry_potter.jpg   |
| 2       | Rise          | rise.jpeg          |

---

## **API Endpoints**

### **1. Get All Books**
- **URL:** `/books`
- **Method:** `GET`
- **Description:** Retrieves a list of all books.

### **Response:**
```json
[
  {
    "id": 1,
    "name": "Harry Potter",
    "imageUrl": "harry_potter.jpg"
  },
  {
    "id": 2,
    "name": "Rise",
    "imageUrl": "rise.jpeg"
  }
]
