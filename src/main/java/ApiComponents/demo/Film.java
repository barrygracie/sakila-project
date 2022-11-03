package ApiComponents.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name="film")
public class Film {
    //Attributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmId;


    @ManyToMany(mappedBy = "films", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JsonIgnore
    Set<Actor> actors;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "film_category", joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    @JsonIgnore
    Set<Category> category;



    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "rental_duration")
    int rentalDuration;

    @Column(name = "rental_rate")
    double rentalRate;

    @Column(name = "length")
    int length;

    @Column(name = "replacement_cost")
    double cost;

    @Column(name = "rating")
    String rating;


    //Constructors

    public Film(int filmId, String title, String description, int rentalDuration, double rentalRate, int length, double cost, String rating) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.cost = cost;
        this.rating = rating;
    }

    public Film() {
    }

    //Methods

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Set<Category> getCategory() {
        return category;
    }

    public void setCategory(Set<Category> category) {
        this.category = category;
    }


    public Set<Actor> getActors() {
        return actors;
    }


}
