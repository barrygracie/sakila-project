package ApiComponents.demo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

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
    @JsonIgnore
    Set<City> City;

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

    public Set<ApiComponents.demo.City> getCity() {
        return City;
    }
}
