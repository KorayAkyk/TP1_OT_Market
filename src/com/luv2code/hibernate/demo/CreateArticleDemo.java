package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import classe.Article;

public class CreateArticleDemo {

	public static void main(String[] args) {
	
		// Create session factory 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Article.class)
								.buildSessionFactory();
		// Create session
		Session session = factory.getCurrentSession();
		
		try {
			//use the session object to save Java object 
			
			//create a student object
			System.out.println("Creating new Article object...");
			Article tempArticle = new Article("REF69", "Cassoulet", 5, 100);
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving article...");
			session.save(tempArticle);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Ok !");
		}
		finally {
			factory.close();
		}
		
	}

}
