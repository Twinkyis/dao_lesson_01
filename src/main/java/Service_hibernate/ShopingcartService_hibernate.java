package Service_hibernate;

import B_logic.hibernate_Util;
import dao.ShopingCartDAO;
import entity.Shopingcart;

import java.sql.SQLException;
import java.util.List;

public class ShopingcartService_hibernate extends hibernate_Util implements ShopingCartDAO {
    @Override
    public void addShopingcart(Shopingcart shopingcart) throws SQLException {

    }

    @Override
    public List<Shopingcart> getAllShopingcart() throws SQLException {
        return null;
    }

    @Override
    public Shopingcart getByIdShopingcart(int idshopingcart) throws SQLException {
        return null;
    }

    @Override
    public void updateShopingcart(Shopingcart shopingcart) throws SQLException {

    }

    @Override
    public void removeShopingcart(Shopingcart shopingcart) throws SQLException {

    }
}
