package com.siva.springjava.services.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author siva
 */
public class BankServiceA {

    public BankServiceA() {
    }
    
    // void no-arg signature
    @PostConstruct
    public void init(){
        System.out.println("BankService init is called");
    }
    
    // void no-arg signature
    @PreDestroy
    public void destroy(){
        System.out.println("BankService destroy is called");
    }
    
    public int deposit(String actNo, int amount){
        System.out.println("Depositing amount "+amount+" for act "+actNo);
        return amount;
    }
    
    public int withdraw(String actNo, int amount){
        System.out.println("Withdrawing amount "+amount+" for act "+actNo);
        return amount;
    }
}
