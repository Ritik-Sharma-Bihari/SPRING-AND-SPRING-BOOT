package com.Hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		 Configuration cfg = new Configuration();
	        cfg.configure("hiberante.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        System.out.println(factory);
// --------- creating first object-------------------------------	        
	        Question q = new Question();
	        q.setQuestionid(10);
	        q.setQuestion("what is full stack developer");
	        
	        Answer ans = new Answer();
	        ans.setAnswerid(101);
	        ans.setAnswer("to developer front-end and bac-kend part of application");
	        
	        q.setAnswer(ans);
	     // --------- creating second object-------------------------------
	        Question q2 = new Question();
	        q2.setQuestionid(11);
	        q2.setQuestion("what is java");
	        
	        Answer ans2 = new Answer();
	        ans2.setAnswerid(102);
	        ans2.setAnswer("A Programming Language");
	        
	        q2.setAnswer(ans2);
	        
	        
	     // getting session
	        Session session = factory.openSession();
	        // to start the transaction
	        Transaction beginTransaction = session.beginTransaction();
	        // to save the transaction(changed)
	        session.save(q);
	        session.save(q2);
	        System.out.println("-----------question data stored in DB--------------");
	        session.save(ans);
	        session.save(ans2);
	        System.out.println("-----------answer data stored in DB--------------");
	        // to commit the database changed
	        beginTransaction.commit();
	 //printing some question and answer
	        Question question = session.get(Question.class, 11);
	        System.out.println(question.getQuestion());
	        System.out.println(question.getAnswer().getAnswer());
	        // close the connection
	        session.close(); 
	        System.out.println("Done");

	}

}