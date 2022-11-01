package ApiComponents.demo;
import javax.persistence.*;

@Entity
@Table(name = "film_actor")
public class FilmActor {
    //Attributes
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorId;

    @Column(name = "film_id")
    int filmId;



    //Constructors
    public FilmActor (int filmId){
        this.filmId = filmId;
    }

    public FilmActor(){}


    //Methods
    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }
}
