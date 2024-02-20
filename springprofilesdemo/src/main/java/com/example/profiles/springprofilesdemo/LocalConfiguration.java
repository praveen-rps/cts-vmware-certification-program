package com.example.profiles.springprofilesdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("local")
@PropertySource ("file:local.properties")
public class LocalConfiguration {

}
