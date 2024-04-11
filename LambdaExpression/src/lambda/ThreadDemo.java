package lambda;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Runnable thread1=()->{
			
			for(int i=0; i<=10;i++) {
				
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable thread2=()->{
			
			for(int i=0; i<=10;i++) {
				
				System.out.println("solanki yuvraj" +i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread1.run();
		thread2.run();
		Thread  t1 = new Thread(thread1);
		t1.start();


	}

}
