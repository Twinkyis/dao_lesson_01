package dao;

import entity.Users;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    //create
    void add(Users users) throws SQLException;

    //read
    List <Users> getAll () throws SQLException;

    //select
    Users getById (int iduser) throws SQLException;

    //update
    void update(Users users) throws SQLException;

    //remove
    void remove(Users users) throws  SQLException;
}
