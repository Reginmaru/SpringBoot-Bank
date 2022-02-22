package com.example.firstProject.Bank;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(path = "api/v1/bank")
public class BankController {

    private final BankService bankService;
    
    @Autowired
    public BankController(BankService bankService){
        this.bankService = bankService;
    }
    @GetMapping
	public List<Bank> getTransactions(){
        return bankService.getTransactions();
	} 
    @PostMapping
    public void registerNewTransaction(@RequestBody Bank bank){
        bankService.addNewTransaction(bank);
    }
    @DeleteMapping(path = "{bankId}")
    public void deleteTransaction(@PathVariable("bankId") Long bankId ){
        bankService.deleteTransaction(bankId);
    }
}
