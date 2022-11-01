package ApiComponents.demo;

import org.hibernate.mapping.Set;

import javax.persistence.*;

@Entity
@Table(name="film")
public class Film {
    //Attributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmId;


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
}
