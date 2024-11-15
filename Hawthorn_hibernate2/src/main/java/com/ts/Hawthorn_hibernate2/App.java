package com.ts.Hawthorn_hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class App {
	public static void main(String[] args) {
		// Configuration and setup
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction();
		Teacher t1 = new Teacher("Ram", "Math");
		Teacher t2 = new Teacher("Sham", "Science");
		Teacher t3 = new Teacher("Naam", "History");
		session.persist(t1);
		session.persist(t2);
		session.persist(t3);
		// Committing the transaction
		session.getTransaction().commit();

		// Closing the session
		session.close();
	}
}
