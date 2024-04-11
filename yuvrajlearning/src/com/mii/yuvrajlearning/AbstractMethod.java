package com.mii.yuvrajlearning;




abstract class bike{
	abstract void run();
}
public class AbstractMethod extends bike {
	void run() {System.out.println("yuvraj solaki");}

	public static void main(String[] args) {
		
		bike bk = new AbstractMethod();
	}

}
