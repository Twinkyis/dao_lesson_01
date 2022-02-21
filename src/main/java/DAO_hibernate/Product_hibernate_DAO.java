package DAO_hibernate;

import entity_hibernate.Product_Hibernate;

import java.sql.SQLException;
import java.util.List;

public interface Product_hibernate_DAO {
    //create
    void addProduct(Product_Hibernate product_hibernate) throws SQLException;

    //read
    List<Product_Hibernate> getAllProduct() throws SQLException;

    //select
    Product_Hibernate getByIdProduct(int idproduct) throws SQLException;

    //update
    void updateProduct(Product_Hibernate product_hibernate) throws SQLException;

    //remove
    void removeProduct(Product_Hibernate product_hibernate) throws SQLException;
}
