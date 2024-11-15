package com.ts.OnetoMany_Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		// Configuration and setup
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.addAnnotatedClass(Documents.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		session.beginTransaction();
		                                 //logic
		// creating user1 objects
		User u1 = new User();
		u1.setId(1);
		u1.setName("Sanket");

		// adding user1's doc1 
		Documents doc1 = new Documents();
		doc1.setId(101);
		doc1.setType("Pancerd");
		doc1.setNumber("123rufndj");

		// adding user1's doc2
		Documents doc2 = new Documents();
		doc2.setId(102);
		doc2.setType("Aadhar");
		doc2.setNumber("3827828783782");
		
	 // adding documents object in list
		List<Documents> docs = new ArrayList<>();
		docs.add(doc1);
		docs.add(doc2);

		// creating third table of user_id & documents_id by passing docs List in user
		u1.setDocuments(docs);

		// save
		session.persist(u1);
		session.persist(doc1);
		session.persist(doc2);
		// Committing the transaction
		session.getTransaction().commit();

		// Closing the session
		session.close();

	}
}




/*
 * here one user can use multiple documents but not repeated documents.
 * means if user1 is using documents has 101 and 102 id then the user2 can't use 101 and
 * 102 is's documents.
 **/
