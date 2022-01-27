package Service;

import B_logic.Util;
import dao.ProductDao;
import entity.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductService extends Util implements ProductDao {

            Connection connection = getConnection();

    @Override
    public void add(Product product) throws SQLException {
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
            if (connection != null) {
                connection.close();
            }
        }
    }

    @Override
    public List<Product> getAll() throws SQLException {
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
            if (connection != null){
                connection.close();
            }
        }
        return productList;
    }

    @Override
    public Product getById(int idproduct) {
        return null;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void remove(Product product) {

    }
}
