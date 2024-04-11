package lambda;

public class Main {

	public static void main(String[] args) {
		
		MyInter myinter = new MyInterImpl();
		
		myinter.sayhello();
		
		System.out.println("programing is running");
		
		MyInter myinter1 = new MyInter() {
		@Override
		public void sayhello() {
			
			System.out.println("ano class is running");
		}
	};
	myinter1.sayhello();
	
		MyInter i=()->{
			System.out.println("lambad is running");
		};
		i.sayhello();
		
		MyInter i1=()->System.out.println("lambad is running without curly braces");
		i1.sayhello();
	}

}
