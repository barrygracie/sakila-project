import ApiComponents.demo.SakilaMicroserviceApplication;
import org.springframework.boot.test.context.SpringBootTest;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = SakilaMicroserviceApplication.class)
public class CucumberSpringConfiguration {
}
