package lt.codeacademy.entities;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    long customerID;
    double totalAmount;

    @Column(name = "status")
    private String status = "PENDING";   // ⭐ DEFAULT VALUE

    public Order() {
        this.status = "PENDING";        // ⭐ Ensures no null status
    }

    public Order(long customerID, double totalAmount) {
        this.customerID = customerID;
        this.totalAmount = totalAmount;
        this.status = "PENDING";        // ⭐ Always set when created
    }

    public Order(int id, long customerID, double totalAmount) {
        this.id = id;
        this.customerID = customerID;
        this.totalAmount = totalAmount;
        this.status = "PENDING";        // ⭐ Safe default
    }

    public Order(Order order) {
        this.id = order.id;
        this.customerID = order.customerID;
        this.totalAmount = order.totalAmount;
        this.status = order.status != null ? order.status : "PENDING"; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status != null ? status : "PENDING";   // ⭐ Never returns null
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [id=" + id 
                + ", customerID=" + customerID 
                + ", totalAmount=" + totalAmount 
                + ", status=" + status + "]";
    }
}
