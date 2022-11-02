package ApiComponents.demo;
import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {
    //Attributes
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cityId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    Country c;

    @Column(name = "city")
    String city;

    @Column(name = "country_id")
    int countryId;

    //Constructors
    public City (String city, int countryId){
        this.city = city;
        this.countryId = countryId;
    }

    public City(){}

    //Methods


    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }
}
