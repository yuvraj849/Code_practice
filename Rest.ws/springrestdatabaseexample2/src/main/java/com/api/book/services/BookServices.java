package com.api.book.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.BookRepositoty;

//import com.jpa.test.entities.User;

import entities.Book;
@Component
public class BookServices {
	
	@Autowired
	private BookRepositoty br;	
	public List<Book> getAllBooks(){
		
		List<Book> list=(List<Book>)this.br.findAll();
		return list;
	}
	
	
	public Book getBookById(int id) {
		Book book=null;
		try {
		book= this.br.findById(id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	/*
	 public Book getBookById(int id) {
	        for (Book book : list) {
	            if (book.getId() == id) {
	                return book;
	            }
	        }
	        return null; // Return null if book with given id is not found
	    }
	 */
	 //create 
	 public Book addBook(Book b) {
		Book result=br.save(b);
		 return result;
	 }
	 
	 //delete
	 /*
	 public void deleteBook(int bId) {
		    Book bookToRemove = null;
		    for (Book book : list) {
		        if (book.getId() == bId) {
		            bookToRemove = book;
		            break;
		        }
		    }
		    if (bookToRemove != null) {
		        list.remove(bookToRemove);
		    }
		}*/
	 public void deleteBook(int bid) {
		 
		 br.deleteById(bid);
	 }
	 
	 public void updateBook(Book b, int bookId) 
	 {
		 b.setId(bookId);
		 br.save(b);
	 }

}
