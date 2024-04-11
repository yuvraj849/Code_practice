package com.api.book.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.book.entities.Book;



public interface BookRepositoty extends CrudRepository<Book, Integer> {
	public Book findById(int id);
}
