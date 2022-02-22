package com.example.firstProject.Bank;

import java.time.*;
import java.util.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {

    @Bean
    CommandLineRunner commandLineRunner(BankRepository repository){
        return args -> {
            Bank test1 = new Bank(
			200.00,
			LocalDate.now(),
			"reginmaru@gmail.com"
		);
            Bank test2 = new Bank(
			-100.00,
			LocalDate.now(),
			"reginmaru@gmail.com"
		);
        repository.saveAll(
            Arrays.asList(test1,test2)
        );
        };
    }
}
