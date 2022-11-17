package ApiComponents.demo;
import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "category")
public class Category {

    //Attributes
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int categoryId;

    @Column(name = "name")
    String category;

    @ManyToMany(mappedBy = "category")
    @JsonIgnore
    List<Film> films;

    public Category(int category_id, String category){
        this.categoryId = category_id;
        this.category = category;
    }
    public Category(){}

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
