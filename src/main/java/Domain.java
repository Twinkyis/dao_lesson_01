import B_logic.hibernate_Util;
import Service.*;
import Service_hibernate.ProductService_hibernate;
import entity.Product;
import entity.Shopingcart;
import entity.Shoporder;
import entity_hibernate.Product_Hibernate;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;

public class Domain {

    public static void main(String[] args) throws SQLException {

        //========================================================= Hibernate =========================================================

        ProductService_hibernate productService_hibernate = new ProductService_hibernate();
        System.out.println(productService_hibernate.getByIdProduct(1));


//===================================================== Remove ====================================================================

//        ProductService productService = new ProductService();
//
//        try {
//            productService.removeProduct(productService.getByIdProduct(547));
//            System.out.println(productService.getAllProduct());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//===================================================================================================================================

//        UsersService usersService = new UsersService();
//        ShopingCartService shopingCartService = new ShopingCartService();

//        try {
//            System.out.println(test_order.getByOrder());
//        } catch (SQLException e) {
//            e.printStackTrace();
//}

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
