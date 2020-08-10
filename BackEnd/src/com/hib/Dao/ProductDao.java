package com.hib.Dao;

import com.hib.entities.Product;
import com.hib.init.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDao {

//    public void getProduct(int ProductID){
//        Transaction transaction = null;
//
//        try(Session session = HibernateUtil.getSessionFactory().openSession()){
//            transaction = session.beginTransaction();
//
//            session.byId(String.valueOf(ProductID));
//        } catch (Exception e){
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
//    }

    public Product getProductById(int id) {
        Transaction transaction = null;
        Product p = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            p = session.load(Product.class, id);
            System.out.println(p.getProductID() + " - " + p.getProductName());

            transaction.commit();

        } catch (Exception e){
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        return p;
    }

    public List<Product> getAllProducts() {
        Transaction transaction = null;
        List<Product> productList = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            productList = session.createQuery("from Product", Product.class).list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return productList;
    }


}
