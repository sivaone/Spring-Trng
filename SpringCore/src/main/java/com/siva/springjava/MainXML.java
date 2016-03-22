package com.siva.springjava;

import com.siva.springjava.services.BankService;
import com.siva.springjava.services.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author siva
 */
public class MainXML {
    public static void main(String[] args) {
        MainXML main = new MainXML();
        main.method4();
        
    }
    
    public void method1(){
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext context =
//    new ClassPathXmlApplicationContext(new String[] {"services.xml", "daos.xml"});
        BankService bankService = (BankService) appContext.getBean("bankService");
        bankService.deposit("123", 1500);
        ((AbstractApplicationContext)appContext).registerShutdownHook();
    }
    
    public void method2(){
//        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext appContext = new FileSystemXmlApplicationContext("classpath:conf/applicationContext.xml");
        BankService bankService = appContext.getBean("bankService", BankService.class);
        bankService.deposit("123", 1500);
    }
    
    public void method3(){
        AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BankService bankService = appContext.getBean(BankService.class);
        bankService.deposit("123", 1500);
        appContext.registerShutdownHook();
    }
    
    public void method4(){
        AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService = appContext.getBean(EmployeeService.class);
        employeeService.saveEmployee("siva");
        appContext.registerShutdownHook();
    }
}
