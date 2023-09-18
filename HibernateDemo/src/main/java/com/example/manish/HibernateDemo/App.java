package com.example.manish.HibernateDemo;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Student stud = new Student();
        stud.setRollno(103);
        stud.setName("Praveen");
        stud.setMarks(100);
        
//        Student stud2 = new Student();
//        stud2.setRollno(102);
//        stud2.setName("Ratnesh");
//        stud2.setMarks(100);
//
//        
//        Student stud3 = new Student();
//        stud3.setRollno(103);
//        stud3.setName("Praveen");
//        stud3.setMarks(100);

        
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        
        org.hibernate.Transaction tx = session.beginTransaction();
        
        
        session.save(stud);
       
        
        tx.commit();
        
        System.out.println(stud);
    }
}
