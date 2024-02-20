package springcoreexample.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource("file:configs/application-prod.properties")
public class ProdConfiguration {
    // No beans defined here, just loading properties
}

