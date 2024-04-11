package com.mii.collectionframework;

/*
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMapCode {

	public static void main(String[] args) {
		HashMap<String,Integer> map= new HashMap();
		
		map.put("india", 120);
		map.put("china",180);
		System.out.println(map);
		if(map.containsKey("china")) {
			System.out.println("key is present "+ map.get("china"));
			
		}
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		Set<String> keys = map.keySet(); // another method for travising
		for(String key : keys) {
			System.out.println(key+" "+ map.get(key));
		}
		map.remove("china");
	}

}*/
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
public class HashMapCode {    
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,Book> map=new HashMap<Integer,Book>();    
    //Creating Books    
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
    //Adding Books to map   
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3);  
      
    //Traversing map  
    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
        int key=entry.getKey();  
        Book b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
    }    
}    
}    */
