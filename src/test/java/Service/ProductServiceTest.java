package Service;

import entity.Product;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void addProduct() throws SQLException {

        Product product = new Product();

        product.setIdproduct(22);
        product.setNameproduct("Product_Test_01");
        product.setPrice(244222);
        product.setDiscription("Discription");

        ProductService productService = new ProductService();
        productService.addProduct(product);
        System.out.println(productService.getAllProduct());
    }


    @Test
    void getAllProduct() throws SQLException {


// ========================= СОЗДАНИЕ СЕРВИС ЗАПРОСА ===============================

        ProductService productService = new ProductService();
        List<Product> actual = productService.getAllProduct();

// =================================================================================

        List <Product> productList = new ArrayList<>();


// ========================= СОЗДАНИЕ ТЕСТОВОГО ЗАПРОСА ============================

        Product product = new Product();
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        Product product6 = new Product();
        Product product7 = new Product();
        Product product8 = new Product();
        Product product9 = new Product();
        Product product10 = new Product();
        Product product11 = new Product();
        Product product12 = new Product();
        Product product13 = new Product();

        product.setIdproduct(1);
        product.setNameproduct("ferrari");
        product.setPrice(200000);
        product.setDiscription("great car");

        product1.setIdproduct(2);
        product1.setNameproduct("porshe");
        product1.setPrice(435000);
        product1.setDiscription("legendary car");

        product2.setIdproduct(3);
        product2.setNameproduct("ВАЗ");
        product2.setPrice(21000);
        product2.setDiscription("just car");

        product3.setIdproduct(4);
        product3.setNameproduct("Pejo");
        product3.setPrice(43000);
        product3.setDiscription("car");

        product4.setIdproduct(5);
        product4.setNameproduct("formula_1");
        product4.setPrice(5444000);
        product4.setDiscription("ultra car");

        product5.setIdproduct(6);
        product5.setNameproduct("ford");
        product5.setPrice(45006);
        product5.setDiscription("-=-----");

        product6.setIdproduct(7);
        product6.setNameproduct("audi");
        product6.setPrice(655000);
        product6.setDiscription("something");

        product7.setIdproduct(8);
        product7.setNameproduct("acura");
        product7.setPrice(43000);
        product7.setDiscription("wow");

        product8.setIdproduct(9);
        product8.setNameproduct("astom_martin");
        product8.setPrice(544000);
        product8.setDiscription("yep");

        product9.setIdproduct(10);
        product9.setNameproduct("bmw");
        product9.setPrice(600000);
        product9.setDiscription("yeah");

        product10.setIdproduct(11);
        product10.setNameproduct("bentley");
        product10.setPrice(87600);
        product10.setDiscription("-------");

        product11.setIdproduct(12);
        product11.setNameproduct("frod mustang");
        product11.setPrice(540000);
        product11.setDiscription("cool");

        product12.setIdproduct(56);
        product12.setNameproduct("ferri");
        product12.setPrice(3453422);
        product12.setDiscription("ddddd");

        product13.setIdproduct(435);
        product13.setNameproduct("BMW X5");
        product13.setPrice(654444);
        product13.setDiscription("bla-bla");



        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        productList.add(product9);
        productList.add(product10);
        productList.add(product11);
        productList.add(product12);
        productList.add(product13);

// =========================== СРАВНЕНИЕ ТЕСТОВОГО И СЕРВИС ЗАПРОСОВ ==================


        assertEquals(productList, actual);
    }

    @Test
    void getByIdProduct() throws SQLException {

    Product product = new Product();
    product.setIdproduct(2);
    product.setNameproduct("porshe");
    product.setPrice(435000);
    product.setDiscription("legendary car");

        ProductService productService = new ProductService();
        Product actual = productService.getByIdProduct(2);
        Product expected = product;
        assertEquals(expected, actual);

    }
// "ProductEntity{idproduct=1, nameproduct='ferrari', price=200000, discription='great car'}, ProductEntity{idproduct=2, nameproduct='porshe', price=435000, discription='legendary car'},  ProductEntity{idproduct=3, nameproduct='ВАЗ', price=21000, discription='just car'},   ProductEntity{idproduct=4, nameproduct='Pejo', price=43000, discription='car'},  ProductEntity{idproduct=5, nameproduct='formula_1', price=5444000, discription='ultra car'},  ProductEntity{idproduct=6, nameproduct='ford', price=45006, discription='-=-----'},  ProductEntity{idproduct=7, nameproduct='audi', price=655000, discription='something'},  ProductEntity{idproduct=8, nameproduct='acura', price=43000, discription='wow'},  ProductEntity{idproduct=9, nameproduct='astom_martin', price=544000, discription='yep'},  ProductEntity{idproduct=10, nameproduct='bmw', price=600000, discription='yeah'},  ProductEntity{idproduct=11, nameproduct='bentley', price=87600, discription='-------'},  ProductEntity{idproduct=12, nameproduct='frod mustang', price=540000, discription='cool'},  ProductEntity{idproduct=56, nameproduct='ferri', price=3453422, discription='ddddd'},  ProductEntity{idproduct=435, nameproduct='BMW X5', price=654444, discription='bla-bla'}"
    @Test
    void updateProduct() throws SQLException {

        Product product1 = new Product();

        product1.setIdproduct(6);
        product1.setNameproduct("New_Name_Product");
        product1.setPrice(777888);
        product1.setDiscription("String");

        ProductService productService = new ProductService();
        productService.updateProduct(product1);
        System.out.println(productService.getAllProduct());
    }

    @Test
    void removeProduct() throws SQLException {

        ProductService productService = new ProductService();
        productService.removeProduct(productService.getByIdProduct(22));
        System.out.println(productService.getAllProduct());
    }
}