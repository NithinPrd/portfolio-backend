package com.portfolio.account;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    public List<Account> getAccounts() {
        return List.of(
                new Account(1L, "Nithin", "nitin.prdp@gmail.com", "ABCD@123", 21, false)
        );
    }
}
