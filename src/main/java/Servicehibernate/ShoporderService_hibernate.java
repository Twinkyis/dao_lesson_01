package Servicehibernate;

import B_logic.hibernate_Util;
import dao.ShopOrderDAO;
import entity.Shoporder;

import java.sql.SQLException;
import java.util.List;

public class ShoporderService_hibernate extends hibernate_Util implements ShopOrderDAO {
    @Override
    public void addShoporder(Shoporder shoporder) throws SQLException {

    }

    @Override
    public List<Shoporder> getAllShoporder() throws SQLException {
        return null;
    }

    @Override
    public Shoporder getByIdShoporder(int idorder) throws SQLException {
        return null;
    }

    @Override
    public void updateShoporder(Shoporder shoporder) throws SQLException {

    }

    @Override
    public void removeShoporder(Shoporder shoporder) throws SQLException {

    }
}
