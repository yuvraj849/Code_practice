package MultiThreading;


class B implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("yuvraj");
		}
		
	}
	
	
}
class RunabbleMethod {
	public static void main(String[] args) {
	
		B t =new B();
		
		Thread thread = new Thread(t);
		
		thread.start();
		for(int i=0;i<=5;i++) {
			System.out.println("solanki");
		}
		
	}
}
