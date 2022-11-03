package ApiComponents.demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    Category ca = new Category(32, "TestCat");

    @Test
    public void testGetCategoryId(){
        Assertions.assertEquals(32, ca.getCategoryId(), "not getting categoryId correctly");
    }

    @Test
    public void testSetCategoryId(){
        ca.setCategoryId(33);
        Assertions.assertEquals(33, ca.getCategoryId(), "not setting categoryId correctly");
    }

    @Test
    public void testGetCategory(){
        Assertions.assertEquals("TestCat", ca.getCategory(), "not getting category correctly");
    }

    @Test
    public void testSetCategory(){
        ca.setCategory("TestCat2");
        Assertions.assertEquals("TestCat2", ca.getCategory(), "not setting category correctly");
    }
    /*
    TODO Unit tests for methods below in category class

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
     */
}
