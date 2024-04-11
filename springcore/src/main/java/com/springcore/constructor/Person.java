package com.springcore.constructor;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List <String> address;
	public Person(String name, int personId, Certi certi, List<String> address) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.address=address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" : "+this.personId+"{"+this.certi+"}"+"{"+this.address+"}";
	}
	
	
}
