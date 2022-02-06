package Service;

import B_logic.Util;
import entity.Product;
import entity.Shoporder;
import entity.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test_Order extends Util {

    Connection connection = getConnection();

    public HashMap<Object, Object> getByOrder() throws SQLException {

        Statement statement = null;
//        HashMap <Object, Object> sum1 = new HashMap<Object, Object>();

        HashMap <Object, Object> sum2 = new HashMap<Object, Object>();
//        HashMap<Object, Object> sumAll = new HashMap<>();

        Users users3 = new Users();
        Product product3 = new Product();

//        Shoporder shoporder3 = new Shoporder();


        String sql2 = "SELECT users.firstname, product.nameproduct, product.price, shoporder.iduser, shoporder.idproduct " +
                "FROM shoporder " +
                "JOIN product " +
                "ON shoporder.idproduct = product.idproduct " +
                "JOIN users " +
                "ON shoporder.iduser = users.iduser ";

            try {

            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql2);
            resultSet.next();

            while (resultSet.next()) {

                users3.setFirstname(resultSet.getString("firstname"));

                product3.setNameproduct(resultSet.getString("nameproduct"));
                product3.setPrice(resultSet.getInt("price"));

                users3.setIduser(resultSet.getInt("iduser"));
                product3.setIdproduct(resultSet.getInt("idproduct"));


                sum2.put(users3, product3);

            }
        }


            catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
        }
        return sum2;
    }
    public void closeConnection () throws SQLException{

        if (connection != null) {
            connection.close();
        }
    }
}