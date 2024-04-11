package com.springcore.springlifecycle;

public class Samosa {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void init() {
		System.out.println("init method is calling");
	}
	public void destroy() {
		System.out.println("destroy method is calling");
	}

}
