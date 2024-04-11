package com.tut;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "projected started" );
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
      //creating student
       
       Student st= new Student();
       st.setId(3);
       st.setName("sanket");
       st.setCity("por");
       // creating student
       Address ad = new Address();
       ad.setStreet("kayavarohan road");
       ad.setCity("por");
       ad.setOpen(true);
       ad.setAddedDate(new Date());
       ad.setX(1234);
       
       FileInputStream fis = new FileInputStream("src/main/java/flag-india.jpg");
       byte[] data=new byte[fis.available()];
       fis.read();
       ad.setImage(data);
       
       Session session= factory.openSession();
       
       session.beginTransaction();
       session.save(st);
       session.save(ad);
       session.getTransaction().commit();
       session.close();
      // System.out.println(st.getId()+st.getName()+st.getCity());
       System.out.println("Done.....");
    }
}
