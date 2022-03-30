package com.portfolio.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AccountConfig {

    @Bean
    CommandLineRunner commandLineRunner(AccountRepository repository) {
        return args -> {
            Account a1 = new Account("Nithin", "nitin.prdp@gmail.com", "ABCD@123", 21, false);
            Account a2 = new Account("Another", "another.one@gmail.com", "XYA@123", 22, false);
            repository.saveAll(List.of(a1, a2));
        };
    }
}
