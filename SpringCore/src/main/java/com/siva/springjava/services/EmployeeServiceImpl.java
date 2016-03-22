/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siva.springjava.services;

/**
 *
 * @author siva
 */
public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeServiceImpl() {
    }
    
    @Override
    public void saveEmployee(String empName) {
        System.out.println("saving employee "+empName);
    }
    
}
