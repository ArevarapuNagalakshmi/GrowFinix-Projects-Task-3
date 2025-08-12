package com.studentMgt;

import com.studentMgt.Entity.StudentManagements;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        StudentManagements student = new StudentManagements();
        //to create the data and inserting the data and update the data
//        int id = 7;
//        student.setId(id);
//        student.setName("mahi");
//        student.setBranch("BSC");
//        student.setEmail("mahi@gmail.com");
//        student.setMarks(450.0);


        SessionFactory factory = new Configuration()
                .addAnnotatedClass(StudentManagements.class)
                .configure()
                .buildSessionFactory();


        Session session = factory.openSession();
        //To create the data we can use
//        Transaction transaction = session.beginTransaction();
//
//        session.persist(student);
//        transaction.commit();

        //to get the data
//        StudentManagements sm=session.get(StudentManagements.class,5);
//        System.out.println(sm);
        //update the data
//        Transaction transaction=session.beginTransaction();
//            session.merge(student);
//            transaction.commit();
        //Delete the data
        Transaction transaction=session.beginTransaction();
        StudentManagements sm=session.find(StudentManagements.class,7);
        session.remove(sm);
        transaction.commit();
        session.close();
        factory.close();
    }
}
