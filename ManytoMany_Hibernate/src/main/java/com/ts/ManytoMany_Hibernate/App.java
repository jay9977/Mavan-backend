package com.ts.ManytoMany_Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {// Configuration and setup
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(Batch.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction();

		Student s1 = new Student();
		s1.setRollNo(1);
		s1.setName("Ramu");

		Student s2 = new Student();
		s2.setRollNo(2);
		s2.setName("Shamu");

		Batch b1 = new Batch();
		b1.setId(101);
		b1.setTuitor("Avinash");
		b1.setSub("Automation");

		Batch b2 = new Batch();
		b2.setId(102);
		b2.setTuitor("Siddhart");
		b2.setSub("FullStack");

		Batch b3 = new Batch();
		b3.setId(103);
		b3.setTuitor("Lakshman");
		b3.setSub("English");

		List<Batch> auto = new ArrayList<>();
		auto.add(b1);
		auto.add(b3);

		List<Batch> full = new ArrayList<>();
		full.add(b2);
		full.add(b3);

		s1.setList(auto);
		s2.setList(full);

		session.persist(s1);
		session.persist(s2);
		session.persist(b1);
		session.persist(b2);
		session.persist(b3);

		// Committing the transaction
		session.getTransaction().commit();

		// Closing the session
		session.close();

	}
}
