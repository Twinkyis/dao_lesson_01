package dao;

import entity.Users;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    //create
    void addUsers(Users users) throws SQLException;

    //read
    List <Users> getAllUsers () throws SQLException;

    //select
    Users getByIdUsers (int iduser) throws SQLException;

    //update
    void updateUsers(Users users) throws SQLException;

    //remove
    void removeUsers(Users users) throws  SQLException;
}
