package Service;

import entity.Users;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersServiceTest {

    @Test
    void addUsers() throws SQLException {

        Users users = new Users();

        users.setIduser(40);
        users.setFirstname("test_first_name_user");
        users.setLastname("test_last_name_user");
        users.setSex("test_sex");
        users.setAge(543);


        UsersService usersService = new UsersService();
        usersService.addUsers(users);
        System.out.println(usersService.getAllUsers());
    }

    @Test
    void getAllUsers() throws SQLException {

        UsersService usersService = new UsersService();
        List <Users> actual = usersService.getAllUsers();


        List <Users> usersList = new ArrayList<>();

        Users  users = new Users();
        Users  users1 = new Users();
        Users  users2 = new Users();
        Users  users3 = new Users();
        Users  users4 = new Users();

        users.setIduser(1);
        users.setFirstname("Tom");
        users.setLastname("Tolla");
        users.setAge(43);
        users.setSex("Man");

        users1.setIduser(2);
        users1.setFirstname("Ann");
        users1.setLastname("Martia");
        users1.setAge(32);
        users1.setSex("Woman");

        users2.setIduser(3);
        users2.setFirstname("Piter");
        users2.setLastname("Wull");
        users2.setAge(23);
        users2.setSex("Man");

        users3.setIduser(4);
        users3.setFirstname("Maria");
        users3.setLastname("Rainw");
        users3.setAge(27);
        users3.setSex("Woman");

        users4.setIduser(5);
        users4.setFirstname("Tomas");
        users4.setLastname("Glarsy");
        users4.setAge(36);
        users4.setSex("Man");

        usersList.add(users);
        usersList.add(users1);
        usersList.add(users2);
        usersList.add(users3);
        usersList.add(users4);

        assertEquals(usersList, actual);

    }

    @Test
    void getByIdUsers() throws SQLException {

        Users users = new Users();

        users.setIduser(1);
        users.setFirstname("Tom");
        users.setLastname("Tolla");
        users.setSex("Man");
        users.setAge(43);

        UsersService usersService = new UsersService();
        Users actual = usersService.getByIdUsers(1);
        Users expected = users;

        assertEquals(expected, actual);

    }

    @Test
    void updateUsers() {
    }

    @Test
    void removeUsers() throws SQLException {

        UsersService usersService = new UsersService();
        usersService.removeUsers(usersService.getByIdUsers(40));
        System.out.println(usersService.getAllUsers());
    }
}