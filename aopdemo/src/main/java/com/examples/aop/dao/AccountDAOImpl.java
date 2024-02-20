package com.examples.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements AccountDAO {

    @Override
    public void addAccount() {

        System.out.println(getClass() + "is called from Bussiness class");

    }

	@Override
	public List<Account> findAccounts() throws Exception {
		// TODO Auto-generated method stub
		List<Account> accounts = new ArrayList<>();
		Account a1 = new Account("John","Silver");
		Account a2 = new Account("Kumar","Gold");
		accounts.add(a1);accounts.add(a2);
		throw new Exception("New Excepton is raised");
		//return accounts;
	}
}
