package Servicehibernate;

import B_logic.Session_Util;
import dao.ProductDAO;
import entity.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;


import java.sql.SQLException;
import java.util.List;

public class ProductService_hibernate extends Session_Util implements ProductDAO {
    @Override
    public void addProduct(Product product) throws SQLException {
        openTransactionSession();

        Session session = getSession();
        session.save(product);
        closeTransactionSession();
    }

    @Override
    public List<Product> getAllProduct() throws SQLException {
        openTransactionSession();

        String sql = "select idproduct, nameproduct, price, discription from product";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Product.class);
        List<Product> productList = query.list();

        closeTransactionSession();

        return productList;
    }

    @Override
    public Product getByIdProduct(int idproduct) throws SQLException {

        openTransactionSession();

        String sql = "SELECT idproduct, nameproduct, price, discription FROM product WHERE idproduct = :idproduct";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Product.class);
        query.setParameter("idproduct", idproduct);

        Product product = (Product) query.getSingleResult();

        closeTransactionSession();

        return product;
    }

    @Override
    public void updateProduct(Product product) throws SQLException {

        openTransactionSession();

        Session session = getSession();
        session.update(product);

        closeTransactionSession();
    }

    @Override
    public void removeProduct(Product product) throws SQLException {

        openTransactionSession();

        Session session = getSession();
        session.remove(product);

        closeTransactionSession();
    }
}