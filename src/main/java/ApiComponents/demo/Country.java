package ApiComponents.demo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
    @Fetch(FetchMode.JOIN)
    @JsonIgnoreProperties("country")
    List<City> City;

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

    public List<ApiComponents.demo.City> getCity() {
        return City;
    }
}
