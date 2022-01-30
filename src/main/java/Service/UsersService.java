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
    public void add(Users users) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO USERS (IDUSER, FIRSTNAME, LASTNAME, SEX, AGE) VALUE (?, ?, ?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, users.getIduser());
            preparedStatement.setString(2, users.getFirstname());
            preparedStatement.setString(2, users.getLastname());
            preparedStatement.setInt(3, users.getAge());
            preparedStatement.setString(4, users.getSex());

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
    public List<Users> getAll() throws SQLException {

        List<Users> usersList = new ArrayList<>();

        String sql = "SELECT IDUSER, FIRSTNAME, AGE, SEX, LASTNAME FROM USERS";

        Statement statement = null;

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Users users = new Users();
                users.setIduser(resultSet.getInt("IdUser"));
                users.setFirstname(resultSet.getString("FirstNameUser"));
                users.setLastname(resultSet.getString("LastNameUser"));
                users.setAge(resultSet.getInt("AgeUser"));
                users.setSex(resultSet.getString("SexUser"));

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
    public Users getById(int iduser) throws SQLException {

        String sql = "SELECT IDUSER, FIRSTNAME, LASTNAME, AGE, SEX";
        PreparedStatement preparedStatement = null;
        Users users = new Users();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, iduser);

            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();

                users.setIduser(resultSet.getInt("idUser"));
                users.setFirstname(resultSet.getString("FirstNameUser"));
                users.setLastname(resultSet.getString("LastNameUser"));
                users.setAge(resultSet.getInt("AgeUser"));
                users.setSex(resultSet.getString("AgeUser"));

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
    public void update(Users users) throws SQLException {
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
    public void remove(Users users) throws SQLException {

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

    public void closeConnection () throws SQLException{

        if (connection != null) {
            connection.close();
        }
    }
}
