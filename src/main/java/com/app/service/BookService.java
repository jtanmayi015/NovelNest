package com.app.service;

import java.util.ArrayList;
import java.util.List;

import com.app.Entity.Book;

public interface BookService {
	List<Book> allBooks = new ArrayList<>();

    List<Book> getAllBooks();
	Book getBookById(Long id);
	
	Book saveBook(Book book);
	
	void deleteBook(Long id);
	
}
