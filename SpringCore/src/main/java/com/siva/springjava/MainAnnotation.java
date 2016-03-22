package com.siva.springjava;

import com.siva.springjava.services.annotation.BankServiceA;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 *
 * @author siva
 */
public class MainAnnotation {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = 
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        ctx.registerShutdownHook();
        
        BankServiceA bankServiceA = ctx.getBean(BankServiceA.class);
        bankServiceA.deposit("123", 1200);
        
    }
}
