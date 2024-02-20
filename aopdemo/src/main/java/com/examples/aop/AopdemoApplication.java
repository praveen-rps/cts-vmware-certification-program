package com.examples.aop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examples.aop.dao.Account;
import com.examples.aop.dao.AccountDAO;

@SpringBootApplication
public class AopdemoApplication implements CommandLineRunner{
	
	@Autowired
	AccountDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO) {

		// call the business method again
		theAccountDAO.addAccount();
		//theAccountDAO.addAccount();
	}
	
	
	private void demoAfterReturningAdvice(AccountDAO theAccountDAO) throws Throwable {

		// call the business method again
		List<Account> accounts = theAccountDAO.findAccounts();
		//theAccountDAO.addAccount();
		System.out.println("The accounts caputred from dao class");
		System.out.println(accounts);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//demoTheBeforeAdvice(dao);
		try {
			demoAfterReturningAdvice(dao);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}








