package entity_hibernate;


import entity.Shopingcart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shopingcart", schema = "mydb", catalog = "")
public class Shopingcart_Hibernate {
    private int idshopingcart;
    private int idorder;
    private int iduser;

    @Id
    @Column(name = "idshopingcart", nullable = false)
    public int getIdshopingcart() {
        return idshopingcart;
    }

    public void setIdshopingcart(int idshopingcart) {
        this.idshopingcart = idshopingcart;
    }

    @Id
    @Column(name = "idorder", nullable = false)
    public int getIdorder() {
        return idorder;
    }

    public void setIdorder(int idorder) {
        this.idorder = idorder;
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

        Shopingcart_Hibernate that = (Shopingcart_Hibernate) o;

        if (idshopingcart != that.idshopingcart) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idshopingcart;
    }

    @Override
    public String toString() {
        return "ShopingcartEntity{" +
                " idshopingcart = " + idshopingcart + " iduser = " + iduser + " idorder = " + idorder +
                '}' + '\n';
    }
}
