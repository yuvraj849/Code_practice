package MultiThreading;


class AB extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("yuvraj");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
 class Test {

	public static void main(String[] args) throws InterruptedException {
		
		AB t = new AB();
		t.start();
		
		for(int i =1;i<=5;i++) {
			System.out.println("solanki");
			//Thread.sleep(1000);
		}

	}

}
