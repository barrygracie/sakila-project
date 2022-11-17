package ApiComponents.demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {
    Film f = new Film(3000, "New Film", "Description of Film", 5, 3.99, 92, 18.99, "PG" );

    @Test
    public void testBlankFilmConstructor() {
        Film test = new Film();
        Assertions.assertTrue(test instanceof Film);
    }


    @Test
    public void testGetFilmId(){
        Assertions.assertEquals(3000, f.getFilmId(), "not getting film Id");
    }

    @Test
    public void testGetTitle(){
        Assertions.assertEquals("New Film", f.getTitle(), "not getting film title");
    }

    @Test
    public void testGetDescription(){
        Assertions.assertEquals("Description of Film", f.getDescription(), "not getting film description");
    }

    @Test
    public void testGetRentalDuration(){
        Assertions.assertEquals(5, f.getRentalDuration(), "not getting rental duration");
    }

    @Test
    public void testGetRentalRate(){
        Assertions.assertEquals(3.99, f.getRentalRate(), "not getting rental rate");
    }

    @Test
    public void testGetLength(){
        Assertions.assertEquals(92, f.getLength(), "not getting length");
    }

    @Test
    public void testGetCost(){
        Assertions.assertEquals(18.99, f.getCost(), "not getting cost");
    }

    @Test
    public void testGetRating(){
        Assertions.assertEquals("PG", f.getRating(), "not getting rating");
    }

    @Test
    public void testSetFilmId(){
        f.setFilmId(3001);
        Assertions.assertEquals(3001, f.getFilmId(), "not setting film id");
    }

    @Test
    public void testSetTitle(){
        f.setTitle("Metropolis");
        Assertions.assertEquals("Metropolis", f.getTitle(), "not setting film title");
    }

    @Test
    public void testSetDescription(){
        f.setDescription("Once upon a time...");
        Assertions.assertEquals("Once upon a time...", f.getDescription(), "not setting film description");
    }

    @Test
    public void testSetRentalDuration(){
        f.setRentalDuration(7);
        Assertions.assertEquals(7, f.getRentalDuration(), "not setting rental duration");
    }

    @Test
    public void testSetRentalRate(){
        f.setRentalRate(1.23);
        Assertions.assertEquals(1.23, f.getRentalRate(), "not setting rental rate");
    }

    @Test
    public void testSetLength(){
        f.setLength(100);
        Assertions.assertEquals(100, f.getLength(), "not setting length");
    }

    @Test
    public void testSetCost(){
        f.setCost(6.54);
        Assertions.assertEquals(6.54, f.getCost(), "not setting cost");
    }

    @Test
    public void testSetRating(){
        f.setRating("18");
        Assertions.assertEquals("18", f.getRating(), "not setting rating");
    }



}
