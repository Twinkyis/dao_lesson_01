package dao;

import entity.Shoporder;

import java.sql.SQLException;
import java.util.List;

public interface ShopOrderDAO {

    //create
    void add(Shoporder shoporder) throws SQLException;

    //read
    List <Shoporder> getAll() throws SQLException;

    //select
    Shoporder getById (int idorder) throws SQLException;

    //update
    void update (Shoporder shoporder) throws SQLException;

    //remove
    void remove (Shoporder shoporder) throws SQLException;
}
