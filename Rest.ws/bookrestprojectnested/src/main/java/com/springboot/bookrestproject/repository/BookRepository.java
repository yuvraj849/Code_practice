package com.springboot.bookrestproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bookrestproject.model.Book;


public interface BookRepository extends JpaRepository<Book, Long>  {

}
