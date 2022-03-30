package com.portfolio.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    public void addNewAccount(Account account) {
        Optional<Account> accountOptional =  accountRepository.findAccountByEmail(account.getEmail());
        if(accountOptional.isPresent()) {
            throw new IllegalStateException("Email already exists");
        }
        accountRepository.save(account);
    }
}
