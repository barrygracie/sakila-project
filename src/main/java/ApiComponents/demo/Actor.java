package ApiComponents.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="actor")
public class Actor {
    //Attributes
    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorId;

    @Column(name = "first_name")
    String actorFirstName;

    @Column(name = "last_name")
    String actorLastName;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "film_actor", joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    @JsonIgnoreProperties("actors")
    List<Film> films;


    //Constructors
    public Actor(String actorFirstName, String actorLastName){
        this.actorFirstName = actorFirstName;
        this.actorLastName = actorLastName;
    }

    public Actor(int actorId, String actorFirstName, String actorLastName){
        this.actorId = actorId;
        this.actorFirstName = actorFirstName;
        this.actorLastName = actorLastName;
    }

    public Actor(){}

    //Methods

    public String getActorFirstName(){
        return actorFirstName;
    }

    public void setActorFirstName(String actorFirstName) {
        this.actorFirstName = actorFirstName;
    }

    public String getActorLastName(){
        return actorLastName;
    }

    public void setActorLastName(String actorLastName) {
        this.actorLastName = actorLastName;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }


}
