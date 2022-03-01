package DAO_hibernate;

import entity_hibernate.Product_Hibernate1;

import java.util.List;

public interface Product_hibernate_DAO1 {
    //create
    void addProduct(Product_Hibernate1 product_hibernate1);

    //read
    List<Product_Hibernate1> getAllProduct();

    //select
    Product_Hibernate1 getByIdProduct(int idproduct);

    //update
    void updateProduct(Product_Hibernate1 product_hibernate1);

    //remove
    void removeProduct(Product_Hibernate1 product_hibernate1);
}
