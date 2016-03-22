package com.siva.springjava.services;

/**
 *
 * @author siva
 */
public class DepartmentServiceImpl implements DepartmentService{

    @Override
    public void saveDepartment(String deptName) {
        System.out.println("Saving department "+deptName);
    }
    
}
