package Service_hibernate;

import B_logic.Session_Util;
import DAO_hibernate.Product_hibernate_DAO;
import entity_hibernate.Product_Hibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;


import java.sql.SQLException;
import java.util.List;

public class ProductService_hibernate extends Session_Util implements Product_hibernate_DAO {


    @Override
    public void addProduct(Product_Hibernate product_hibernate) throws SQLException {

        openTransactionSession();

        Session session = getSession();
        session.save(product_hibernate);
        closeTransactionSession();
    }

    @Override
    public List<Product_Hibernate> getAllProduct() throws SQLException {

        openTransactionSession();

        String sql = "SELECT * FROM PROODUCT";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Product_Hibernate.class);
        List <Product_Hibernate> productHibernateList = query.list();

        closeTransactionSession();

        return productHibernateList;
    }

    @Override
    public Product_Hibernate getByIdProduct(int idproduct) throws SQLException {

        openTransactionSession();

        String sql = "SELECT * FROM PRODUCT WHERE ID = :ID";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Product_Hibernate.class);
        query.setParameter("id", idproduct);

        Product_Hibernate product_hibernate = (Product_Hibernate) query.getSingleResult();

        closeTransactionSession();

        return product_hibernate;
    }

    @Override
    public void updateProduct(Product_Hibernate product_hibernate) throws SQLException {

        openTransactionSession();

        Session session = getSession();
        session.update(product_hibernate);

        closeTransactionSession();
    }

    @Override
    public void removeProduct(Product_Hibernate product_hibernate) throws SQLException {

        openTransactionSession();

        Session session = getSession();
        session.remove(product_hibernate);

        closeTransactionSession();
    }
}
