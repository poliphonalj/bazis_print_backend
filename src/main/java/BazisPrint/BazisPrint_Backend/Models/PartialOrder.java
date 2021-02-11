package BazisPrint.BazisPrint_Backend.Models;

import javax.persistence.*;

@Entity
public class PartialOrder {
    @Id
    private String id;

    @ManyToOne
    private Order order;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
