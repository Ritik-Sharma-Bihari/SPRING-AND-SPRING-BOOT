package com.Hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hiberante.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        // creating object for class
        Student st = new Student();
        // setting value for class properties
        st.setId(1001);
        st.setName("Ankush sharma");
        st.setCity("bombay");
        // display values
        System.out.println(st);
        // getting session 
      Session session = factory.openSession();
      // to start the transaction
      Transaction beginTransaction = session.beginTransaction();
      // to save the transcation(changed)
      session.save(st);
      // to commit the database changed
      beginTransaction.commit();
      // close the connection
      session.close();      
    }
}