package Service;

import B_logic.Util;
import dao.ProductDAO;
import entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService extends Util implements ProductDAO {

    Connection connection = getConnection();

    @Override
    public void addProduct(Product product) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO PRODUCT (IDPRODUCT, NAMEPRODUCT, PRICE, DISCRIPTION) VALUE (?, ?, ?, ?)";

        try {
           preparedStatement = connection.prepareStatement(sql);

           preparedStatement.setLong(1, product.getIdproduct());
           preparedStatement.setString(2, product.getNameproduct());
           preparedStatement.setInt(3, product.getPrice());
           preparedStatement.setString(4, product.getDiscription());

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
    public List<Product> getAllProduct() throws SQLException {

        List <Product> productList = new ArrayList<>();

        String sql = "SELECT IDPRODUCT, NAMEPRODUCT, PRICE, DISCRIPTION FROM PRODUCT";

        Statement statement = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Product product = new Product();

                product.setIdproduct(resultSet.getInt("idproduct"));
                product.setNameproduct(resultSet.getString("nameproduct"));
                product.setPrice(resultSet.getInt("price"));
                product.setDiscription(resultSet.getString("discription"));

                productList.add(product);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
        }
        return productList;
    }

    @Override
    public Product getByIdProduct(int idproduct) throws SQLException {

        String sql = "SELECT IDPRODUCT, NAMEPRODUCT, PRICE, DISCRIPTION FROM PRODUCT WHERE (IDPRODUCT=?)";

        PreparedStatement preparedStatement = null;

        Product product = new Product();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idproduct);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

                product.setIdproduct(resultSet.getInt("idproduct"));
                product.setNameproduct(resultSet.getString("nameproduct"));
                product.setPrice(resultSet.getInt("price"));
                product.setDiscription(resultSet.getString("discription"));

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
            return product;
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE PRODUCT SET  NAMEPRODUCT = ?, PRICE = ?, DISCRIPTION = ? where IDPRODUCT = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, product.getIdproduct());
            preparedStatement.setString(2, product.getNameproduct());
            preparedStatement.setInt(3, product.getPrice());
            preparedStatement.setString(4, product.getDiscription());

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
    public void removeProduct(Product product) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM PRODUCT WHERE IDPRODUCT = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, product.getIdproduct());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }

        }
    }

    public void closeConnectionProduct () throws SQLException{

        if (connection != null) {
            connection.close();
        }
    }


}
