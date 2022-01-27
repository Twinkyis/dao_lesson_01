package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shopingcart", schema = "mydb", catalog = "")
public class Shopingcart {
    private int idshopingcart;

    @Id
    @Column(name = "idshopingcart", nullable = false)
    public int getIdshopingcart() {
        return idshopingcart;
    }

    public void setIdshopingcart(int idshopingcart) {
        this.idshopingcart = idshopingcart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shopingcart that = (Shopingcart) o;

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
                "idshopingcart=" + idshopingcart +
                '}';
    }
}
