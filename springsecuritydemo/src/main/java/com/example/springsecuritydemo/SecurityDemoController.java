package com.example.springsecuritydemo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemoController {
	
	
	@GetMapping("/info")
	public String info() {
		return "General Bank Details are displayed";
	}
	
	
	@GetMapping("/myBalance")
	public String balance() {
		return "Balance of user is returned";
	}

	@GetMapping("/myAccount")
	public String myAccountDetails() {
		return "user account details are displayed";
	}
	
	@GetMapping("/myCards")
	public String myCreditCardDetails() {
		return "user creditCard details are displayed";
	}

}
