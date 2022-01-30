package dao;

import entity.Shopingcart;

import java.sql.SQLException;
import java.util.List;

public interface ShopingCartDAO {

    //create
    void add(Shopingcart shopingcart) throws SQLException;

    //read
    List <Shopingcart> getAll () throws SQLException;

    //select
    Shopingcart getById (int idshopingcart) throws SQLException;

    //update
    void update (Shopingcart shopingcart) throws SQLException;

    //remove
    void remove (Shopingcart shopingcart) throws SQLException;
}
