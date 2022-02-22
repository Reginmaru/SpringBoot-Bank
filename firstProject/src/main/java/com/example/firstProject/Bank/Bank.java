package com.example.firstProject.Bank;
import java.time.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Bank {
    @Id
    @SequenceGenerator(
        name= "bank_sequence",
        sequenceName = "bank_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "bank_sequence"
    )
    private Long id;
    private Double transaction;
    private LocalDate time;
    private String email;
    
    
    public Bank(){
    }
    public Bank(Double transaction, 
                LocalDate time, 
                String email, 
                Long id){
        this.transaction = transaction;
        this.time = time;
        this.email = email;
        this.id = id;
    }
    public Bank(Double transaction, 
                LocalDate time, 
                String email){
        this.transaction = transaction;
        this.time = time;
        this.email = email;
    }
    public Double getTransaction() {
        return transaction;
    }
    public void setTransaction(Double transaction) {
        this.transaction = transaction;
    }
    public LocalDate getTime() {
        return time;
    }
    public void setTime(LocalDate time) {
        this.time = time;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    

}
