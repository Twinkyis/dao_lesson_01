package entity;

import javax.persistence.*;

@Entity
@Table(name = "shoporder", schema = "mydb", catalog = "")
public class Shoporder {
    private int idorder;
    private Product productByIdproduct;

    @Id
    @Column(name = "idorder", nullable = false)
    public int getIdorder() {
        return idorder;
    }

    public void setIdorder(int idorder) {
        this.idorder = idorder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shoporder that = (Shoporder) o;

        if (idorder != that.idorder) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idorder;
    }

    @ManyToOne
    @JoinColumn(name = "idproduct", referencedColumnName = "idproduct", nullable = false)
    public Product getProductByIdproduct() {
        return productByIdproduct;
    }

    public void setProductByIdproduct(Product productByIdproduct) {
        this.productByIdproduct = productByIdproduct;
    }

    @Override
    public String toString() {
        return "ShoporderEntity{" +
                "idorder=" + idorder +
                ", productByIdproduct=" + productByIdproduct +
                '}';
    }
}
