package Service;

import entity.Shoporder;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopOrderServiceTest {

    @Test
    void addShoporder() throws SQLException {

        Shoporder shoporder = new Shoporder();

        shoporder.setIdorder(25);
        shoporder.setIduser(4);
        shoporder.setIdproduct(6);

        ShopOrderService shopOrderService = new ShopOrderService();
        shopOrderService.addShoporder(shoporder);
        System.out.println(shopOrderService.getAllShoporder());
    }
    @Test
    void getAllShoporder() throws SQLException {

        ShopOrderService shopOrderService = new ShopOrderService();
        List <Shoporder> actual = shopOrderService.getAllShoporder();

        List <Shoporder> expected = new ArrayList<>();

        Shoporder shoporder = new Shoporder();
        Shoporder shoporder1 = new Shoporder();
        Shoporder shoporder2 = new Shoporder();
        Shoporder shoporder3 = new Shoporder();
        Shoporder shoporder4 = new Shoporder();
        Shoporder shoporder5 = new Shoporder();
        Shoporder shoporder6 = new Shoporder();

        shoporder.setIdorder(17);
        shoporder.setIduser(1);
        shoporder.setIdproduct(1);

        shoporder1.setIdorder(18);
        shoporder1.setIduser(1);
        shoporder1.setIdproduct(2);

        shoporder2.setIdorder(19);
        shoporder2.setIduser(2);
        shoporder2.setIdproduct(2);

        shoporder3.setIdorder(20);
        shoporder3.setIduser(2);
        shoporder3.setIdproduct(3);

        shoporder4.setIdorder(21);
        shoporder4.setIduser(3);
        shoporder4.setIdproduct(4);

        shoporder5.setIdorder(22);
        shoporder5.setIduser(2);
        shoporder5.setIdproduct(4);

        shoporder6.setIdorder(23);
        shoporder6.setIduser(1);
        shoporder6.setIdproduct(1);

        expected.add(shoporder);
        expected.add(shoporder1);
        expected.add(shoporder2);
        expected.add(shoporder3);
        expected.add(shoporder4);
        expected.add(shoporder5);
        expected.add(shoporder6);

        assertEquals(expected, actual);
    }

    @Test
    void getByIdShoporder() throws SQLException {

        Shoporder shoporder = new Shoporder();

        shoporder.setIdorder(17);
        shoporder.setIduser(1);
        shoporder.setIdproduct(1);

        ShopOrderService shopOrderService = new ShopOrderService();
        Shoporder actual = shopOrderService.getByIdShoporder(17);
        Shoporder expected = shoporder;
        assertEquals(expected, actual);
    }

    @Test
    void updateShoporder() {
    }

    @Test
    void removeShoporder() throws SQLException {

        ShopOrderService shopOrderService = new ShopOrderService();
        shopOrderService.removeShoporder(shopOrderService.getByIdShoporder(25));
        System.out.println(shopOrderService.getAllShoporder());
    }
}