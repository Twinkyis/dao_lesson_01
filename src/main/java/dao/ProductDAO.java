package dao;

import entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDAO {

    //create
    void addProduct(Product product) throws SQLException;

    //read
    List<Product> getAllProduct() throws SQLException;

    //select
    Product getByIdProduct(int idproduct) throws SQLException;

    //update
    void updateProduct(Product product) throws SQLException;

    //remove
    void removeProduct(Product product) throws SQLException;
}
