package MultiThreading;

class Table1  
{      
 void printTable(int n){    
   synchronized(this){//synchronized block    
     for(int i=1;i<=5;i++){    
      System.out.println(n*i);    
      try{    
       Thread.sleep(400);    
      }catch(Exception e){System.out.println(e);}    
     }    
   }    
 }//end of the method    
}    
    
class MyThread1 extends Thread{    
Table1 t;    
MyThread1(Table1 t){    
this.t=t;    
}    
@Override
public void run(){    
t.printTable(5);    
}    
    
}    
class MyThread2 extends Thread{    
Table1 t;    
MyThread2(Table1 t){    
this.t=t;    
}    
@Override
public void run(){    
t.printTable(100);    
}    
}    
    
public class Prac{    
public static void main(String args[]){    
Table1 obj = new Table1();//only one object    
MyThread1 t1=new MyThread1(obj);    
MyThread2 t2=new MyThread2(obj);    
t1.start();    
t2.start();    
}    
}    