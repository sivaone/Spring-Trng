package com.siva.springjava.services;

import com.siva.springjava.daos.BankDao;

/**
 *
 * @author siva
 */
public class BankService {
    
    private String bankName;
    private BankDao bankDao;

    public BankService() {
    }

    public BankService(String bankName) {
        System.out.println("Setting values in constructor");
        this.bankName = bankName;
    }
    
    // void no-arg signature
    public void init(){
        System.out.println("BankService init is called");
    }
    
    // void no-arg signature
    public void destroy(){
        System.out.println("BankService destroy is called");
    }
    
    public int deposit(String actNo, int amount){
        System.out.println("Depositing amount "+amount+" for act "+actNo);
        bankDao.deposit(actNo, amount);
        return amount;
    }
    
    public int withdraw(String actNo, int amount){
        System.out.println("Withdrawing amount "+amount+" for act "+actNo);
        bankDao.withdraw(actNo, amount);
        return amount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        System.out.println("Setting properties");
        this.bankName = bankName;
    }

    public BankDao getBankDao() {
        return bankDao;
    }

    public void setBankDao(BankDao bankDao) {
        this.bankDao = bankDao;
    }
    
}
