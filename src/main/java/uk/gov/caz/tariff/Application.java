package uk.gov.caz.tariff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import uk.gov.caz.tariff.configuration.RequestMappingConfiguration;
import uk.gov.caz.tariff.configuration.SwaggerConfiguration;
import uk.gov.caz.tariff.controller.ExampleController;

@SpringBootConfiguration
@EnableAutoConfiguration
@Import({
    RequestMappingConfiguration.class,
    SwaggerConfiguration.class,
    ExampleController.class
})
public class Application extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
