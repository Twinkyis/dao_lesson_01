package Service;

import entity.Shopingcart;
import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopingCartServiceTest {

    @Test
    void addShopingcart() throws SQLException {
        Shopingcart shopingcart = new Shopingcart();

        shopingcart.setIdshopingcart(15);
        shopingcart.setIduser(1);
        shopingcart.setIdorder(17);

        ShopingCartService shopingCartService = new ShopingCartService();
        shopingCartService.addShopingcart(shopingcart);
        System.out.println(shopingCartService.getAllShopingcart());

    }

    @Test
    void getAllShopingcart() throws SQLException {

        ShopingCartService shopingCartService = new ShopingCartService();
        List <Shopingcart> actual = shopingCartService.getAllShopingcart();

        List <Shopingcart> expected = new ArrayList<>();

        Shopingcart shopingcart = new Shopingcart();
        Shopingcart shopingcart1 = new Shopingcart();
        Shopingcart shopingcart2 = new Shopingcart();
        Shopingcart shopingcart3 = new Shopingcart();
        Shopingcart shopingcart4 = new Shopingcart();
        Shopingcart shopingcart5 = new Shopingcart();

        shopingcart.setIdshopingcart(7);
        shopingcart.setIdorder(1);
        shopingcart.setIduser(17);

        shopingcart1.setIdshopingcart(8);
        shopingcart1.setIdorder(1);
        shopingcart1.setIduser(18);

        shopingcart2.setIdshopingcart(9);
        shopingcart2.setIdorder(2);
        shopingcart2.setIduser(19);

        shopingcart3.setIdshopingcart(10);
        shopingcart3.setIdorder(2);
        shopingcart3.setIduser(20);

        shopingcart4.setIdshopingcart(11);
        shopingcart4.setIdorder(3);
        shopingcart4.setIduser(21);

        shopingcart5.setIdshopingcart(12);
        shopingcart5.setIdorder(2);
        shopingcart5.setIduser(22);

       expected.add(shopingcart);
       expected.add(shopingcart1);
       expected.add(shopingcart2);
       expected.add(shopingcart3);
       expected.add(shopingcart4);
       expected.add(shopingcart5);

       assertEquals(expected, actual);

    }

    @Test
    void getByIdShopingcart() throws SQLException {

        Shopingcart shopingcart = new Shopingcart();
        shopingcart.setIdshopingcart(7);
        shopingcart.setIduser(1);
        shopingcart.setIdorder(17);

        ShopingCartService shopingCartService = new ShopingCartService();
        Shopingcart actual = shopingCartService.getByIdShopingcart(7);
        Shopingcart expected = shopingcart;
        assertEquals(expected, actual);
    }

    @Test
    void updateShopingcart() {

    }

    @Test
    void removeShopingcart() throws SQLException {

        ShopingCartService shopingCartService = new ShopingCartService();
        shopingCartService.removeShopingcart(shopingCartService.getByIdShopingcart(15));
        System.out.println(shopingCartService.getAllShopingcart());
    }
}