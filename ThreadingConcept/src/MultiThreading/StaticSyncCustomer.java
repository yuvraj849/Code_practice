package MultiThreading;

class Bank implements Runnable{
	static int bal=5000;
	static int withdraw;
	Bank(int withdraw){
		this.withdraw=withdraw;
	}
	public static synchronized void withdraw() {
		String name= Thread.currentThread().getName();
		if(withdraw<=bal) {
			System.out.println(name+" transtion is successful");
			bal=bal-withdraw;
		}else {
			System.out.println(name+" insuffent balance");
		}
	}
	
	@Override
	public  void run() {
		withdraw();
	}
}
public class StaticSyncCustomer {
	
	public static void main(String[] Args) {
		
		Bank bank= new Bank(5000);
		
		Thread t1 = new Thread(bank);
		Thread t2 = new Thread(bank);
		t1.setName("yuvraj");
		t2.setName("sanket");
		t1.start();
		t2.start();
	}

}
