package ApiComponents.demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {

    Actor a = new Actor(3000,"Tommy", "Tester");

    @Test
    public void testGetActorFirstName(){
        Assertions.assertEquals("Tommy", a.getActorFirstName(), "not getting first name correctly");
    }

    @Test
    public void testGetActorLastName(){
        Assertions.assertEquals("Tester", a.getActorLastName(), "not getting last name correctly");
    }

    @Test
    public void testGetActorId(){
        Assertions.assertEquals(3000, a.getActorId(), "not getting id correctly");
    }

    @Test
    public void testSetActorFirstName(){
        a.setActorFirstName("Ronny");
        Assertions.assertEquals("Ronny", a.getActorFirstName(), "not setting first name");
    }

    @Test
    public void testSetActorLastName(){
        a.setActorLastName("Douglas");
        Assertions.assertEquals("Douglas", a.getActorLastName(), "not setting last name");
    }

    @Test
    public void testSetActorId(){
        a.setActorId(3001);
        Assertions.assertEquals(3001, a.getActorId(), "not setting Id");
    }


}
