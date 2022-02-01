package dao;

import entity.Shopingcart;

import java.sql.SQLException;
import java.util.List;

public interface ShopingCartDAO {

    //create
    void addShopingcart(Shopingcart shopingcart) throws SQLException;

    //read
    List <Shopingcart> getAllShopingcart() throws SQLException;

    //select
    Shopingcart getByIdShopingcart(int idshopingcart) throws SQLException;

    //update
    void updateShopingcart(Shopingcart shopingcart) throws SQLException;

    //remove
    void removeShopingcart(Shopingcart shopingcart) throws SQLException;
}
