package Service;

import B_logic.Util;
import dao.ShopOrderDAO;
import entity.Shoporder;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShopOrderService extends Util implements ShopOrderDAO {

    Connection connection = getConnection();

    @Override
    public void addShoporder(Shoporder shoporder) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql ="INSERT INTO SHOPORDER (IDSHOPORDER, IDUSER, IDPRODUCT) VALUE (?, ? , ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, shoporder.getIdorder());
            preparedStatement.setLong(2, shoporder.getIduser());
            preparedStatement.setLong(3, shoporder.getIdproduct());

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
    public List<Shoporder> getAllShoporder() throws SQLException {

        List<Shoporder> OrderList = new ArrayList<>();

        String sql = "SELECT IDORDER, IDUSER, IDPRODUCT FROM SHOPORDER";

        Statement statement = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Shoporder shoporder = new Shoporder();
                shoporder.setIdorder(resultSet.getInt("IdOrder"));
                shoporder.setIduser(resultSet.getInt("IdUser"));
                shoporder.setIdproduct(resultSet.getInt("IdProduct"));

                OrderList.add(shoporder);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            return OrderList;
        }


    }

    @Override
    public Shoporder getByIdShoporder(int idorder) throws SQLException {

        String sql = "SELECT IDUSER, IDPRODUCT WHERE IDSHOPORDER = ?";

        PreparedStatement preparedStatement = null;

        Shoporder shoporder = new Shoporder();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idorder);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

                shoporder.setIdorder(resultSet.getInt("IdOrder"));
                shoporder.setIduser(resultSet.getInt("IdUser"));
                shoporder.setIdproduct(resultSet.getInt("IdProduct"));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
        return null;
    }

    @Override
    public void updateShoporder(Shoporder shoporder) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "UPDATE SHOPORDER SET IDUSER = ?, IDPRODUCT = ? WHERE IDORDER = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, shoporder.getIdorder());
            preparedStatement.setInt(2, shoporder.getIduser());
            preparedStatement.setInt(3, shoporder.getIdproduct());

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
    public void removeShoporder(Shoporder shoporder) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM SHOPORDER WHERE IDORDER = ?";

        try {
         preparedStatement = connection.prepareStatement(sql);
         preparedStatement.setLong(1, shoporder.getIdorder());

         preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }


    public void closeConnectionShoporder () throws SQLException{

        if (connection != null) {
            connection.close();
        }
    }
}
