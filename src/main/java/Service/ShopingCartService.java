package Service;

import B_logic.Util;
import dao.ShopingCartDAO;
import entity.Shopingcart;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShopingCartService extends Util implements ShopingCartDAO {

    Connection connection = getConnection();

    @Override
    public void addShopingcart(Shopingcart shopingcart) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO shopingcart (idshopingcart, iduser, idorder) VALUE (?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, shopingcart.getIdshopingcart());
            preparedStatement.setLong(2, shopingcart.getIduser());
            preparedStatement.setLong(3, shopingcart.getIdorder());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    @Override
    public List<Shopingcart> getAllShopingcart() throws SQLException {

        List <Shopingcart> ShopingCartList = new ArrayList<>();

        String sql = "SELECT IDSHOPINGCART, IDUSER, IDORDER FROM shopingcart";

        Statement statement = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Shopingcart shopingcart = new Shopingcart();
                shopingcart.setIdshopingcart(resultSet.getInt("IdShopingCart"));
                shopingcart.setIduser(resultSet.getInt("IdUser"));
                shopingcart.setIdorder(resultSet.getInt("IdOrder"));

                ShopingCartList.add(shopingcart);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
        }
        return ShopingCartList;
    }

    @Override
    public Shopingcart getByIdShopingcart(int idshopingcart) throws SQLException {

        String sql = "SELECT idshopingcart, iduser, idorder FROM shopingcart WHERE (idshopingcart = ?)";

        PreparedStatement preparedStatement = null;

        Shopingcart shopingcart = new Shopingcart();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idshopingcart);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

                shopingcart.setIdshopingcart(resultSet.getInt("idshopingcart"));
                shopingcart.setIduser(resultSet.getInt("iduser"));
                shopingcart.setIdorder(resultSet.getInt("idorder"));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
        return shopingcart;
    }

    @Override
    public void updateShopingcart(Shopingcart shopingcart) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "UPDATE SHOPINGCART SET IDUSER = ?, IDORDER = ?, WHERE IDSHOPINGCART = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, shopingcart.getIdshopingcart());
            preparedStatement.setInt(2, shopingcart.getIduser());
            preparedStatement.setInt(3, shopingcart.getIdorder());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    @Override
    public void removeShopingcart(Shopingcart shopingcart) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM SHOPINGCART WHERE IDSHOPINGCART = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, shopingcart.getIdshopingcart());

            preparedStatement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }
    public void closeConnectionShopingcart() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
