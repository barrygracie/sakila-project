package ApiComponents.demo;
import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country {
    //Attributes
    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int countryId;

    @Column(name = "country")
    String country;

    //Constructors
    public Country (String country){
        this.country = country;
    }

    public Country(){}

    //Methods


    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
