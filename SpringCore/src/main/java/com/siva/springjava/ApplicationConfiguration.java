/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siva.springjava;

import com.siva.springjava.services.annotation.BankServiceA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author siva
 */
@Configuration
public class ApplicationConfiguration {
    
    @Bean
    public BankServiceA getBankServiceA(){
        return new BankServiceA();
    }
}
