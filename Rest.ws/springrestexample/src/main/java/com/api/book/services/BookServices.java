package com.api.book.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

//import com.jpa.test.entities.User;

import entities.Book;
@Component
public class BookServices {
	
	private static List<Book> list=new ArrayList<>();
	static {
		
		list.add(new Book(12,"python book","dsnket"));
		list.add(new Book(13,"java book","sanket"));
		list.add(new Book(32,"c++ book","het"));
		list.add(new Book(14,"c book","sanskar"));
		
	}
	
	public List<Book> getAllBooks(){
		
		return list;
	}
	
	
	public Book getBookById(int id) {
		Book book=null;
		try {
		book= list.stream().filter(e->e.getId()==id).findFirst().get();
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
		 list.add(b);
		 return b;
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
		 
		 list= list.stream().filter(book ->book.getId()!=bid).collect(Collectors.toList());
	 }
	 
	 public void updateBook(Book book, int bookId) 
	 {
		 list.stream().map(b->{
			 if(b.getId()==bookId) {
				 b.setTitle(book.getTitle());
				 b.setAuthor(book.getAuthor());
				  
			 }
			 return b;
		 }).collect(Collectors.toList());
	 }

}
