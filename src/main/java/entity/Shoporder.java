package entity;

import javax.persistence.*;

@Entity
@Table(name = "shoporder", schema = "mydb", catalog = "")
public class Shoporder {
    private int idorder;
    private int idproduct;
    private int iduser;

    private Product productByIdproduct;

    @Id
    @Column(name = "idorder", nullable = false)
    public int getIdorder() {
        return idorder;
    }

    public void setIdorder(int idorder) {
        this.idorder = idorder;
    }

    @Id
    @Column(name = "idproduct", nullable = false)
    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    @Id
    @Column(name = "iduser", nullable = false)
    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
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
                " idorder = " + idorder + " iduser = " + iduser + " idproduct = " + idproduct +
                ", productByIdproduct = " + productByIdproduct + '}' + '\n';
    }
}
