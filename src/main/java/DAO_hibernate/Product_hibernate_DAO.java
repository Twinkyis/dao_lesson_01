package DAO_hibernate;

import entity_hibernate.ProductHibernate;

import java.sql.SQLException;
import java.util.List;

public interface Product_hibernate_DAO {
    //create
    void addProduct(ProductHibernate product_hibernate) throws SQLException;

    //read
    List<ProductHibernate> getAllProduct() throws SQLException;

    //select
    ProductHibernate getByIdProduct(int idproduct) throws SQLException;

    //update
    void updateProduct(ProductHibernate product_hibernate) throws SQLException;

    //remove
    void removeProduct(ProductHibernate product_hibernate) throws SQLException;
}
