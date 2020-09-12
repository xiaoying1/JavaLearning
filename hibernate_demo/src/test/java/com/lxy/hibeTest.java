package com.lxy;

import com.lxy.domain.StudentsEntity;
import com.sun.deploy.security.WSeedGenerator;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class hibeTest {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction =  session.beginTransaction();

        StudentsEntity user = new StudentsEntity();
        user.setGender((byte) 0);
        user.setName("ffff33");

        session.save(user);

        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
