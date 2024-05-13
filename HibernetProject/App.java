package com.HibernetProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        System.out.println(factory);
        
       Student s1=new Student("sona","kadhane","Sona@gmail.com");
       
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
       session.save(s1);
       tx.commit();
       session.close();
 
 
    }
}
