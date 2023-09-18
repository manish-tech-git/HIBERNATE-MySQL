package com.example.manish.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataFetch {

	public static void main(String[] args) {
		
		
		Student stud = null;
        
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        
        //org.hibernate.Transaction tx = session.beginTransaction();
        
        //eager
        stud = session.get(Student.class, 101);
       
        //lazy 
        //stud = session.load(Student.class, 101);
        //  tx.commit();
        
        System.out.println(stud);


	}

}
