package entity_hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "mydb", catalog = "")
public class Product_Hibernate1 {

    private int idproduct;
    private String nameproduct;
    private int price;
    private String discription;

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return " ProductEntity{" +
                "idproduct=" + idproduct +
                ", nameproduct='" + nameproduct + '\'' +
                ", price=" + price +
                ", discription='" + discription + '\'' +
                '}' + '\n';
    }

}
