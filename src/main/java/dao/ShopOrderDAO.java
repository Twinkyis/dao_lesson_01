package dao;

import entity.Shoporder;

import java.sql.SQLException;
import java.util.List;

public interface ShopOrderDAO {

    //create
    void addShoporder(Shoporder shoporder) throws SQLException;

    //read
    List <Shoporder> getAllShoporder() throws SQLException;

    //select
    Shoporder getByIdShoporder (int idorder) throws SQLException;

    //update
    void updateShoporder (Shoporder shoporder) throws SQLException;

    //remove
    void removeShoporder (Shoporder shoporder) throws SQLException;
}
