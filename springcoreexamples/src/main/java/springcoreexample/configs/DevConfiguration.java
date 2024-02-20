package springcoreexample.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource("file:configs/application-dev.properties")
public class DevConfiguration {
    // No beans defined here, just loading properties
}
