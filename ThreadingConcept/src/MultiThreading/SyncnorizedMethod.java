package MultiThreading;


class Sync implements Runnable{
	int Avail=1,pass;
	Sync(int pass){
		this.pass=pass;
	}
	@Override
	public  synchronized void run() {
		String name= Thread.currentThread().getName();	
			if(Avail>=pass) {
			System.out.println(name+" seat is reseverd");
			Avail=Avail-pass;
			
		}else {
			System.out.println(name+" seat is not avaliable");
		}
		
	}
}
class SyncnorizedMethod {
	public static void main(String[] args) {
		
		Sync s = new Sync(1);
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(s);
		t1.setName("yuvraj");
		t2.setName("het");
		t3.setName("sanket");
		t1.start();
		t2.start();
		t3.start();
	}
}
