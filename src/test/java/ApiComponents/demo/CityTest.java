package ApiComponents.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CityTest {

    City c = new City("Elgin", 102);

    @Test
    public void testBlankCityConstructor() {
        City d = new City();
        Assertions.assertTrue(d instanceof City);
    }

    @Test
    public void testGetCityId(){
        Assertions.assertEquals(0, c.getCityId(), "not getting cityId correctly");
    }

    @Test
    public void testSetCityId(){
        c.setCityId(3000);
        Assertions.assertEquals(3000, c.getCityId(), "not setting cityId correctly");
    }

    @Test
    public void testGetCity(){
        Assertions.assertEquals("Elgin", c.getCity(), "not getting city correctly");
    }

    @Test
    public void testSetCity(){
        c.setCity("Forres");
        Assertions.assertEquals("Forres", c.getCity(), "not setting city correctly");
    }

    @Test
    public void testGetCountryId(){
        Assertions.assertEquals(102, c.getCountryId(), "not getting countryId correctly");
    }

    @Test
    public void testSetCountryId(){
        c.setCountryId(105);
        Assertions.assertEquals(105, c.getCountryId(), "not setting countryId correctly");
    }
    /*

    TODO unit tests for methods below in city class

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
     */


}
