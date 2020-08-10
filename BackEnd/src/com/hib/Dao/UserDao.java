package com.hib.Dao;

import com.hib.entities.User;
import com.hib.init.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {

    public void registerUser(User user) {
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}
