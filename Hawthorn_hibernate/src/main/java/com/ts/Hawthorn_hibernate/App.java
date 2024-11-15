package com.ts.Hawthorn_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Configuration and setup
        Configuration cfg = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
  
        
          //all operation perform here CURD
  /*
   //CREAT OPERATION    
        // Inserting the first student
        Student student1 = new Student();//inserting Student object using setter.
        student1.setId(1);
        student1.setName("Jaydeep");
        student1.setMarks("84.60");
        session.persist(student1);  // Persist first student
        
        // Inserting the second student
        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Rahul");
        student2.setMarks("77");
        session.persist(student2);  // Persist second student
        
        //Inserting the third students
        Student student3= new Student(3,"Ram","89");//inserting Student object using Constructor.
        session.persist(student3);   */
        
        
  /*      
        
  //READ OR FATCH  OR GET OPERATION   
        
        //Using session.get method
       Student std= session.get(Student.class, 2);
       System.out.println(std.getName());  */
  /*
        
   //UPDATE
        
        Student student=session.get(Student.class, 2);
        student.setName("Rakesh"); 
   */
        
    //DELETE
        
        Student del=session.get(Student.class, 3);
        session.remove(del);
        
        // Committing the transaction 
        session.getTransaction().commit(); 
        
        // Closing the session
        session.close();
    }
}
