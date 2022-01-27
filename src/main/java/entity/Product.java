package entity;

import javax.persistence.*;

@Entity
@Table(name = "product", schema = "mydb", catalog = "")
public class Product {
    private int idproduct;
    private String nameproduct;
    private int price;
    private String discription;

    @Id
    @Column(name = "idproduct", nullable = false)
    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    @Basic
    @Column(name = "nameproduct", nullable = false, length = 45)
    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    @Basic
    @Column(name = "price", nullable = false)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "discription", nullable = true, length = 270)
    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product that = (Product) o;

        if (idproduct != that.idproduct) return false;
        if (price != that.price) return false;
        if (nameproduct != null ? !nameproduct.equals(that.nameproduct) : that.nameproduct != null) return false;
        if (discription != null ? !discription.equals(that.discription) : that.discription != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idproduct;
        result = 31 * result + (nameproduct != null ? nameproduct.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (discription != null ? discription.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "idproduct=" + idproduct +
                ", nameproduct='" + nameproduct + '\'' +
                ", price=" + price +
                ", discription='" + discription + '\'' +
                '}';
    }
}
