package ApiComponents.demo;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    //Attributes
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerId;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "address_id")
    int addressId;


    //Constructors
    public Customer (String firstName, String lastName, int addressId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressId = addressId;
    }

    public Customer(){}

    //Methods


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
}
