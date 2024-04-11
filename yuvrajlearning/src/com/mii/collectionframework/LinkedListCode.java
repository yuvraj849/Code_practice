package com.mii.collectionframework;
import java.util.LinkedList;
public class LinkedListCode {

	public static void main(String[] args) {
		
		LinkedList<String> Name= new LinkedList<String>();
		LinkedList<Integer> Id= new LinkedList<Integer>();
		Name.add("yuvraj");
		Name.add("sanket");
		System.out.println(Name);
		Name.add(1,"het");
		System.out.println(Name);
		Name.remove(0);
		System.out.println(Name);
		Id.add(1);
		Id.add(2);
		Id.add(3);
		System.out.println(Id);
		String element = Name.get(1);
		System.out.println(element);
		int e1 = Id.get(1);
		System.out.println(e1);
		Name.addFirst("yuvraj");
		Name.addLast("sanskar");
		System.out.println(Name);
	}

}
