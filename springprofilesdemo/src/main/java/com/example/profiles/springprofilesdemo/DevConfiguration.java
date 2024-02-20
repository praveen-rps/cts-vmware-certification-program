package com.example.profiles.springprofilesdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource ("file:dev.properties")
class DevConfiguration {

}
