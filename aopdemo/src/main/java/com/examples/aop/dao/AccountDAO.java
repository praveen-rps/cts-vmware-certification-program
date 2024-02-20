package com.examples.aop.dao;

import java.util.List;

public interface AccountDAO {

    void addAccount();
    List<Account> findAccounts() throws Exception;
}
