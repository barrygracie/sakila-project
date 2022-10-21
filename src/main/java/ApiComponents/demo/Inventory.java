package ApiComponents.demo;
import javax.persistence.*;

@Entity
@Table(name="inventory")
public class Inventory {
    //Attributes
    @Id
    @Column(name = "inventory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int inventoryId;

    @Column(name = "film_id")
    int filmId;

    //Constructors
    public Inventory (int filmId){
        this.filmId = filmId;
    }

    public Inventory(){}

    //Methods


    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }
}
