package ApiComponents.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountryTest {

    Country co = new Country("Madeupistan");

    @Test
    public void testGetCountryId(){
        Assertions.assertEquals(0, co.getCountryId(), "not getting countryId correctly");
    }

    @Test
    public void testSetCountryId(){
        co.setCountryId(3000);
        Assertions.assertEquals(3000, co.getCountryId(), "not setting countryId correctly");
    }

    @Test
    public void testGetCountry(){
        Assertions.assertEquals("Madeupistan", co.getCountry(), "not getting countryId correctly");
    }

    @Test
    public void testSetCountry(){
        co.setCountry("Hyrule");
        Assertions.assertEquals("Hyrule", co.getCountry(), "not setting country correctly");
    }


}
