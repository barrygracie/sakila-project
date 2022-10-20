package ApiComponents.demo;
import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
    //Attributes
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int addressId;

    @Column(name = "address")
    String address;

    @Column(name = "district")
    String district;

    @Column(name = "city_id")
    int cityId;

    //Constructors




    //Methods
}
