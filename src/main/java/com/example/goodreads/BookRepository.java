package com.example.goodreads;

import java.util.ArrayList;

public interface BookRepository {
    ArrayList<Book> getBooks();
    Book getBookById(int bookId);
    Book addBook(Book book);
    Book updateBook(int bookId, Book book);
    public void deleteBook(int bookId);
}