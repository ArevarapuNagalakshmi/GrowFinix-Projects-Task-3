package com.schoolMgt;

import com.schoolMgt.Entity.StudentManagements;

import javax.net.ssl.SSLSession;
import java.lang.module.Configuration;

public class Main {
    public static void main(String[] args) {
        StudentManagements studentManagements=new StudentManagements();
        studentManagements.setId(1);
        studentManagements.setName("Jyothi");
        studentManagements.setBranch("B.Com");
        studentManagements.setEmail("jyothi@gmail.com");
        studentManagements.setMarks(400.0);

        Configuration config=new Configuration();

       SessionFactory factory=config.buildSessionFactory();
        Session session=factory.openSession();

        session.persist(studentManagements);

    }
}