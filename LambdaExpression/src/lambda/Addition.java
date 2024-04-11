package lambda;

public class Addition {

	public static void main(String[] args) {
		SumInter s1=( a, b)->  a+b;
		System.out.println(s1.add(2, 3));

	}

}
