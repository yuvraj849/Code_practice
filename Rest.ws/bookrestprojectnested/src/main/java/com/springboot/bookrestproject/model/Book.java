package com.springboot.bookrestproject.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")
public class Book {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		
		//@Column(name="author_name")
		@OneToOne(cascade = CascadeType.ALL)
		private Author author;
		
		@Column(name="title_name")
		private String title;
		
		@Column(name="Book_detail")
		private String description;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public Author getAuthor() {
			return author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Book(long id, Author author, String title, String description) {
			super();
			this.id = id;
			this.author = author;
			this.title = title;
			this.description = description;
		}

		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Book [id=" + id + ", author=" + author + ", title=" + title + ", description=" + description + "]";
		}
		

	}

