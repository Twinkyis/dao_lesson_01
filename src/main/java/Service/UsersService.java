package Service;

import B_logic.Util;
import dao.UserDAO;
import entity.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersService extends Util implements UserDAO {

    Connection connection = getConnection();

    @Override
    public void addUsers(Users users) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO USERS (IDUSER, FIRSTNAME, LASTNAME, SEX, AGE) VALUE (?, ?, ?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, users.getIduser());
            preparedStatement.setString(2, users.getFirstname());
            preparedStatement.setString(3, users.getLastname());
            preparedStatement.setString(4, users.getSex());
            preparedStatement.setInt(5, users.getAge());

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
    public List<Users> getAllUsers() throws SQLException {

        List<Users> usersList = new ArrayList<>();

        String sql = "SELECT iduser, firstname, lastname, sex, age FROM users";

        Statement statement = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Users users = new Users();
                users.setIduser(resultSet.getInt("IdUser"));
                users.setFirstname(resultSet.getString("firstname"));
                users.setLastname(resultSet.getString("lastname"));
                users.setSex(resultSet.getString("sex"));
                users.setAge(resultSet.getInt("age"));


                usersList.add(users);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
        }
        return usersList;
    }

    @Override
    public Users getByIdUsers(int iduser) throws SQLException {

        String sql = "SELECT IDUSER, FIRSTNAME, LASTNAME, AGE, SEX FROM users WHERE (iduser =?)";

        PreparedStatement preparedStatement = null;

        Users users = new Users();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, iduser);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

                users.setIduser(resultSet.getInt("iduser"));
                users.setFirstname(resultSet.getString("firstname"));
                users.setLastname(resultSet.getString("lastname"));
                users.setSex(resultSet.getString("sex"));
                users.setAge(resultSet.getInt("age"));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
        return users;
    }

    @Override
    public void updateUsers(Users users) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE USERS SET FIRSTNAME, LASTNAME, AGE, SEX WHERE IDUSER = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, users.getIduser());
            preparedStatement.setInt(2, users.getAge());
            preparedStatement.setString(3, users.getFirstname());
            preparedStatement.setString(4, users.getLastname());
            preparedStatement.setString(5, users.getSex());

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
    public void removeUsers(Users users) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM USERS WHERE IDUSER = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, users.getIduser());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    public void closeConnectionUsers () throws SQLException{

        if (connection != null) {
            connection.close();
        }
    }
}
