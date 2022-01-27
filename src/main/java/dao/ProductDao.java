package dao;

import entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {

    //create
    void add(Product product) throws SQLException;

    //read
    List<Product> getAll() throws SQLException;

    //select
    Product getById(int idproduct);

    //update
    void update(Product product);

    //remove
    void remove(Product product);
}
