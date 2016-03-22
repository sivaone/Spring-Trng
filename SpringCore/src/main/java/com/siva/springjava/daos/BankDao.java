/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siva.springjava.daos;

/**
 *
 * @author siva
 */

public class BankDao {
    
    public int deposit(String actNo, int amount){
        System.out.println("In bankdao deposit ");
        return amount;
    }
    
    public int withdraw(String actNo, int amount){
        System.out.println("In bankdao withdraw ");
        return amount;
    }
    
}
