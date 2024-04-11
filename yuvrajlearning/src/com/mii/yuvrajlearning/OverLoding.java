package com.mii.yuvrajlearning;



 class bank{
	int GetRateOfIntrest() {
		return 0;
	}
}

 class sbi extends bank{
	 int GetRateofIntrest() {return 8;}
}
 class bob extends bank{
	 int GetRateofIntrest() {return 9;}
}
 class icic extends bank{
	 int GetRateofIntrest() {return 0;}
}
public class OverLoding {

	public static void main(String[] args) {
		sbi s = new sbi();
		bob b = new bob();
		icic i = new icic();
		
		System.out.println(s.GetRateofIntrest());

	}

}
