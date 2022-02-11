import Service.*;
import entity.Product;
import entity.Shopingcart;
import entity.Shoporder;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Domain {

    public static void main(String[] args) {


UsersService usersService = new UsersService();
        ShopingCartService shopingCartService = new ShopingCartService();

try {
    System.out.println(shopingCartService.getByIdShopingcart(7));
} catch (SQLException e) {
    e.printStackTrace();
}

//        ProductService productService = new ProductService();
//
//        try {
//            System.out.println(productService.getAllProduct());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }





//        ProductService productService = new ProductService();
//
//        Product product1 = new Product();
//        product1.setIdproduct(443);
//        product1.setNameproduct("BMW X5");
//        product1.setPrice(654444);
//        product1.setDiscription("bla-bla");
//
//
//        Product product2 = new Product();
//        product2.setIdproduct();
//
//        try {
//            System.out.println(productService.getAll());
//            productService.add(product1);
//           List <Product> productList = productService.getAll();
//            System.out.println(productList);
//            productService.remove(productList.get(productList.size() -1));
//            System.out.println("==============================");
//            System.out.println(productService.getAll());
//            productService.remove(product1);
//            productService.closeConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


    }
}
