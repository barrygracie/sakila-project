package ApiComponents.demo;
import javax.persistence.*;

@Entity
@Table(name="rental")
public class Rental {
    //Attributes

    @Id
    @Column(name = "rental_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int rentalId;

    @Column(name = "inventory_id")
    int inventoryId;

    @Column(name = "customer_id")
    int customerId;


    //Constructors
    public Rental(int inventoryId, int customerId){
        this.inventoryId = inventoryId;
        this.customerId = customerId;
    }

    public Rental(){}


    //Methods
    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

}
