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
    public Address (String address, String district, int cityId){
        this.address = address;
        this.district = district;
        this.cityId = cityId;
    }

    public Address(){}


    //Methods

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict(){
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
