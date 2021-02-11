package BazisPrint.BazisPrint_Backend.Models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Order {

    @Id
    private String id;

    private int quantity;

    @OneToMany
    private List<PartialOrder> partialOrderList;

    private LocalDateTime EstimatedDelivery;
    private LocalDateTime   ConfirmedDelivery;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<PartialOrder> getPartialOrderList() {
        return partialOrderList;
    }

    public void setPartialOrderList(List<PartialOrder> partialOrderList) {
        this.partialOrderList = partialOrderList;
    }

    public LocalDateTime getEstimatedDelivery() {
        return EstimatedDelivery;
    }

    public void setEstimatedDelivery(LocalDateTime estimatedDelivery) {
        EstimatedDelivery = estimatedDelivery;
    }

    public LocalDateTime getConfirmedDelivery() {
        return ConfirmedDelivery;
    }

    public void setConfirmedDelivery(LocalDateTime confirmedDelivery) {
        ConfirmedDelivery = confirmedDelivery;
    }
}
