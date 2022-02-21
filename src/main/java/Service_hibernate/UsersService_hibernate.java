package Service_hibernate;

import B_logic.Session_Util;
import DAO_hibernate.User_hibernate_DAO;
import entity_hibernate.Users_Hibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;


import java.sql.SQLException;
import java.util.List;

public class UsersService_hibernate extends Session_Util implements User_hibernate_DAO {

    @Override
    public void addUsers(Users_Hibernate users_hibernate) throws SQLException {

        openTransactionSession();
        Session session = getSession();
        session.save(users_hibernate);
        closeSession();
    }

    @Override
    public List<Users_Hibernate> getAllUsers() throws SQLException {

        openTransactionSession();

        String sql = "select * from users";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Users_Hibernate.class);
        List <Users_Hibernate> usersHibernateList = query.list();

        closeTransactionSession();

        return usersHibernateList;
    }

    @Override
    public Users_Hibernate getByIdUsers(int iduser) throws SQLException {

        openTransactionSession();

        String sql = "select * from users where id = :id";

        Session session = getSession();
        Query query = session.createNativeQuery(sql).addEntity(Users_Hibernate.class);
        query.setParameter("id", iduser);

        Users_Hibernate users_hibernate = (Users_Hibernate) query.getSingleResult();

        closeTransactionSession();

        return users_hibernate;
    }

    @Override
    public void updateUsers(Users_Hibernate users_hibernate) throws SQLException {

        openTransactionSession();

        Session session = getSession();
        session.update(users_hibernate);

        closeTransactionSession();
    }

    @Override
    public void removeUsers(Users_Hibernate users_hibernate) throws SQLException {

        openTransactionSession();

        Session session = getSession();
        session.remove(users_hibernate);

        closeTransactionSession();
    }
}
