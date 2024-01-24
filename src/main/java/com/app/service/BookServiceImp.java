package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import com.app.Entity.Book;
import com.app.repository.BookRepository;
@Service
public class BookServiceImp implements BookService {

	private final BookRepository bookRepo ;
	
	@Autowired
	public BookServiceImp(BookRepository bookRepo) {
		this.bookRepo= bookRepo;
	}
	@Override
	public Book getBookById(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
        return optionalBook.orElse(null);
	}

	@Override
	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
		
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}
	
}
