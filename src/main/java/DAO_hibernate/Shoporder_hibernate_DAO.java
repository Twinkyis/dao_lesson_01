package DAO_hibernate;

import entity_hibernate.Shoporder_Hibernate;

import java.sql.SQLException;
import java.util.List;

public interface Shoporder_hibernate_DAO {
    //create
    void addShoporder(Shoporder_Hibernate shoporder_hibernate) throws SQLException;

    //read
    List<Shoporder_Hibernate> getAllShoporder() throws SQLException;

    //select
    Shoporder_Hibernate getByIdShoporder (int idorder) throws SQLException;

    //update
    void updateShoporder (Shoporder_Hibernate shoporder_hibernate) throws SQLException;

    //remove
    void removeShoporder (Shoporder_Hibernate shoporder_hibernate) throws SQLException;
}
