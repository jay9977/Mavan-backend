package com.ts.OnetoOne_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// Configuration and setup
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.addAnnotatedClass(Aadhar.class);// make like this to add two tables

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

//begin transaction

		session.beginTransaction();

		// write logic here
		User u = new User(); // creating obj of User using setter
		u.setId(1);
		u.setName("rakesh");

		Aadhar a = new Aadhar();// creating obj of Aadhar using setter
		a.setId(101);
		a.setNumber("12345678");

		u.setAadhar(a);// for mapping set aadhar_id by passing aadhar object in user.

		session.persist(u);
		session.persist(a);

// Committing the transaction 
		session.getTransaction().commit();

		// Closing the session
		session.close();
	}
}
