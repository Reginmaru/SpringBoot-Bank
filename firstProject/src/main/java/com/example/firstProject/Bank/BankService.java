package com.example.firstProject.Bank;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

	private final BankRepository bankRepository;

	@Autowired
	public BankService(BankRepository bankRepository){
		this.bankRepository = bankRepository;
	}
    public List<Bank> getTransactions(){
		return bankRepository.findAll();
	}
	public void addNewTransaction(Bank bank) {
		//Optional<Bank> bankByEmail = bankRepository.findBankByEmail(bank.getEmail());
		bankRepository.save(bank);
	}
	public void deleteTransaction(Long bankId) {
		boolean exists = bankRepository.existsById(bankId);
		if(!exists){
			throw new IllegalStateException(
				"bank with id " + bankId + " does not exist"
				);
		}
		bankRepository.deleteById(bankId);
	} 
}
