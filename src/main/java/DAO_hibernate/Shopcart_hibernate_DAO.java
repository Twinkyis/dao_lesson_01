package DAO_hibernate;

import entity_hibernate.Shopingcart_Hibernate;

import java.sql.SQLException;
import java.util.List;

public interface Shopcart_hibernate_DAO {

    //create
    void addShopingcart(Shopingcart_Hibernate shopingcart_hibernate) throws SQLException;

    //read
    List<Shopingcart_Hibernate> getAllShopingcart() throws SQLException;

    //select
    Shopingcart_Hibernate getByIdShopingcart(int idshopingcart) throws SQLException;

    //update
    void updateShopingcart(Shopingcart_Hibernate shopingcart_hibernate) throws SQLException;

    //remove
    void removeShopingcart(Shopingcart_Hibernate shopingcart_hibernate) throws SQLException;
}
