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

//    public HashMap<Object, Object> getByOrder() throws SQLException {
//
//            HashMap <Object, Object> sum1 = new HashMap<Object, Object>();
//
//        String sql1 = "SELECT shoporder.idproduct, product.nameproduct, iduser FROM shoporder JOIN product ON shoporder.idproduct = product.idproduct ";
//
//        Statement statement = null;
//
//        try {
//            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql1);
//            resultSet.next();
//                while (resultSet.next()) {
//
//                    Product product1 = new Product();
//                    Users users1 = new Users();
//
//                        users1.setIduser(resultSet.getInt("IdUser"));
//                        product1.setIdproduct(resultSet.getInt("IdProduct"));
//                        product1.setNameproduct(resultSet.getString("NameProduct"));
//
//                        sum1.put(users1, product1);
//                }
//            } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (statement != null) {
//                statement.close();
//            }
//        }
//        return sum1;
//    }

    public HashMap<Object, Object> getByOrder() throws SQLException {

        Statement statement = null;
//        HashMap <Object, Object> sum1 = new HashMap<Object, Object>();
        HashMap <Object, Object> sum2 = new HashMap<Object, Object>();
        Users users3 = new Users();
        Product product3 = new Product();
        Shoporder shoporder3 = new Shoporder();


        String sql2 = "SELECT users.firstname, product.nameproduct, product.price, shoporder.iduser, shoporder.idproduct " +
                "FROM shoporder " +
                "JOIN product " +
                "ON shoporder.idproduct = product.idproduct " +
                "JOIN users " +
                "ON shoporder.iduser = users.iduser ";


//        String sql1 = "SELECT shoporder.idproduct, product.nameproduct, iduser FROM shoporder JOIN product ON shoporder.idproduct = product.idproduct ";
//        try {
//            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sql1);
//            resultSet.next();
//            while (resultSet.next()) {
//
//                Product product1 = new Product();
//                Users users1 = new Users();
//
//                users1.setIduser(resultSet.getInt("IdUser"));
//                product1.setIdproduct(resultSet.getInt("IdProduct"));
//                product1.setNameproduct(resultSet.getString("NameProduct"));
//
//                sum1.put(users1, product1);
//            }

            try {
                statement = connection.createStatement();
                ResultSet resultSet1 = statement.executeQuery(sql2);
                resultSet1.next();

                while (resultSet1.next()) {


                    users3.setFirstname(resultSet1.getString("UserName"));
                    product3.setPrice(resultSet1.getInt("Price"));
                    product3.setNameproduct(resultSet1.getString("NameProduct"));
//                    shoporder3.setIdorder(resultSet1.getInt("IdOrder"));
                    shoporder3.setIduser(resultSet1.getInt("IdUser"));
                    shoporder3.setIdproduct(resultSet1.getInt("IdProduct"));


                    sum2.put(users3, product3);
                }
        } catch (SQLException e) {
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

//        String sql = "SELECT users.firstname, product.nameproduct, product.price, shoporder.iduser, shoporder.idproduct " +
//                "FROM shoporder " +
//                "JOIN product " +
//                "ON shoporder.idproduct = product.idproduct " +
//                "JOIN users " +
//                "ON shoporder.iduser = users.iduser ";