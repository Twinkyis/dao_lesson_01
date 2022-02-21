package DAO_hibernate;

import entity_hibernate.Users_Hibernate;

import java.sql.SQLException;
import java.util.List;

public interface User_hibernate_DAO {

    //create
    void addUsers(Users_Hibernate users_hibernate) throws SQLException;

    //read
    List<Users_Hibernate> getAllUsers () throws SQLException;

    //select
    Users_Hibernate getByIdUsers (int iduser) throws SQLException;

    //update
    void updateUsers(Users_Hibernate users_hibernate) throws SQLException;

    //remove
    void removeUsers(Users_Hibernate users_hibernate) throws  SQLException;
}
