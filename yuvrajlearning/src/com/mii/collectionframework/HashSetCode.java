package com.mii.collectionframework;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetCode {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<>();
		
		name.add("yuvraj 1"); // 1
		name.add("yuvraj 2"); // 2
		name.add("yuvraj 3"); // 3
		name.add("yuvraj 4"); // 4
		name.add("yuvraj 5"); // 5
		name.add("yuvraj 6"); // 6
		name.add("yuvraj 7"); // 7
		name.add("yuvraj 8"); // 8
		name.add("yuvraj 9"); // 9
		name.add("yuvraj 10"); // 10
		name.add("yuvraj 11"); // 11
		name.add("yuvraj 12"); // 12
		name.add("yuvraj 13"); // 13
		name.add("yuvraj 14"); // 14
		name.add("yuvraj 15"); // 15
		name.add("yuvraj 16"); // 16
		name.add("yuvraj 17"); // 17
		//System.out.println(name);
		
		//search- contain
		/*
		if(name.contains("yuvraj")) {
			System.out.println("set contain");
		}
		if(!name.contains("het")) {
			System.out.println("does not contain");
		}
		*/
		Iterator<String> it= name.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	

}
/*
import java.util.*;  
class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class HashSetCode {  
public static void main(String[] args) {  
    HashSet<Book> set=new HashSet<Book>();  
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to HashSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing HashSet  
    for(Book b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
} 
*/