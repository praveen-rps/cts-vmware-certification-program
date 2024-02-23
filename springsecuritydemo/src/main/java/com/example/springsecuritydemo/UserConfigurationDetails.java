package com.example.springsecuritydemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class UserConfigurationDetails {
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		
		http.authorizeHttpRequests((authz) -> authz
				    .requestMatchers("/info").permitAll()
					.requestMatchers(HttpMethod.GET, "/myAccount","/myBalance").hasRole("user")
					.requestMatchers("/myCards").hasAnyRole("admin")
					.anyRequest().authenticated());
				    return http.build();

		/*
		http.authorizeHttpRequests(
				request -> 
				request.requestMatchers("/myBalance","/myCards").hasAuthority("admin")
					   .requestMatchers("/myAccount").hasAuthority("user")
					   .requestMatchers("/info").permitAll())
		       .formLogin(Customizer.withDefaults())
		       .httpBasic(Customizer.withDefaults());
		
		return http.build();
		
		
		
		
		
		http.authorizeHttpRequests(
				request -> 
				request.requestMatchers("/myBalance","/myAccount","myCards").authenticated()
						.requestMatchers("/info").permitAll())
		.formLogin(Customizer.withDefaults())
		.httpBasic(Customizer.withDefaults());
		
		
		
	
		// below code is the default code for security filter chain 
		
		http.authorizeHttpRequests(request -> request.anyRequest().authenticated())
		.formLogin(Customizer.withDefaults())
		.httpBasic(Customizer.withDefaults());
		return http.build();
		
		
		// below code overrides the default behaviour to permit all without any
		//authentication 
				
				http.authorizeHttpRequests(request -> request.anyRequest().permitAll())
				.formLogin(Customizer.withDefaults())
				.httpBasic(Customizer.withDefaults());
				return http.build();
				
		

		// below code overrides the default behaviour to deny all with authentication also
				
				http.authorizeHttpRequests(request -> request.anyRequest().denyAll())
				.formLogin(Customizer.withDefaults())
				.httpBasic(Customizer.withDefaults());
				return http.build();
			*/	
		
		
	}
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		
		UserDetails admin1 = User.withUsername("satish")
							     .password(passwordEncoder().encode("admin"))
							     .authorities("admin").build();
		
		UserDetails admin2 = User.withUsername("kiran")
			     .password(passwordEncoder().encode("admin"))
			     .authorities("admin").build();
							  
		UserDetails user = User.withUsername("praveen")
			     .password(passwordEncoder().encode("12345"))
			     .authorities("admin").build();

		
		return new InMemoryUserDetailsManager(admin1,admin2,user);
							    
							   
	}
	
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
	        return (web) -> web.ignoring().requestMatchers("/myBalance", "/myAccount");
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
