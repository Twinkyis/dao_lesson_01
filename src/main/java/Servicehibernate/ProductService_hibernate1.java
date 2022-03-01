package Servicehibernate;

import B_logic.Session_Util;
import DAO_hibernate.Product_hibernate_DAO1;
import entity_hibernate.ProductHibernate;
import entity_hibernate.Product_Hibernate1;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ProductService_hibernate1 extends Session_Util implements Product_hibernate_DAO1 {


    @Override
    public void addProduct(Product_Hibernate1 product_hibernate1){

        openTransactionSession();

        Session session = getSession();
        session.save(product_hibernate1);
        closeTransactionSession();
    }

    @Override
    public List<Product_Hibernate1> getAllProduct() {

        openTransactionSession();

        String sql = "SELECT * FROM PROODUCT";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Product_Hibernate1.class);
        List <Product_Hibernate1> productHibernateList = query.list();

        closeTransactionSession();

        return productHibernateList;
    }

    @Override
    public Product_Hibernate1 getByIdProduct(int idproduct) {

        openTransactionSession();

        String sql = "SELECT idproduct, nameproduct, price, discription FROM product WHERE idproduct = :idproduct";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(ProductHibernate.class);
        query.setParameter("idproduct", idproduct);

        Product_Hibernate1 product_hibernate1 = (Product_Hibernate1) query.getSingleResult();

        closeTransactionSession();

        return product_hibernate1;
    }

    @Override
    public void updateProduct(Product_Hibernate1 product_hibernate1){

        openTransactionSession();

        Session session = getSession();
        session.update(product_hibernate1);

        closeTransactionSession();
    }

    @Override
    public void removeProduct(Product_Hibernate1 product_hibernate1) {

        openTransactionSession();

        Session session = getSession();
        session.remove(product_hibernate1);

        closeTransactionSession();
    }
}
