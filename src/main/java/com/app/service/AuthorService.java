package com.app.service;

import java.util.List;

import com.app.Entity.Author;

public interface AuthorService {

	List<Author> getAllAuthors();
	
	Author getAuthorById(Long id);

    Author saveAuthor(Author author);

    void deleteAuthor(Long id);
}
