package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}