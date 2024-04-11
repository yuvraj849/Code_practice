package MultiThreading;



class Table {
public synchronized void printTable(int n) {
	for(int i=1;i<=10;i++) {
		System.out.println(n*i);
	}
}
	
}

class Thread1 extends Thread{
	Table t;
	Thread1(Table t){
		this.t=t;
	}
	@Override
	public void run() {
		t.printTable(5);
	}
	
}
class Thread2 extends Thread{
	Table t;
	Thread2(Table t){
		this.t=t;
	}
	@Override
	public void run() {
		t.printTable(2);
	}
}
public class MultiplicationTable {

	public static void main(String[] args) {
		
		Table ob = new Table();
		Thread1 t1 = new Thread1(ob);
		t1.start();
		Thread2 t2 = new Thread2(ob);
		t2.start();
		
	}

}
