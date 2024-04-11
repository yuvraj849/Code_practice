package MultiThreading;



class yuv extends Thread{
	

	@Override
	public void run() {
		String n=Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(n);
		}
	}
}
public class ThreadScheduler {

	public static void main(String[] args) {
		
		yuv t1 = new yuv();
		yuv t2 = new yuv();
		yuv t3 = new yuv();
		t1.setName("yuvraj");
		t2.setName("sanket");
		t3.setName("solanki");
		t1.start();
		t2.start();
		t3.start();
		//t2.suspend();
		//t2.resume();

	}

}
