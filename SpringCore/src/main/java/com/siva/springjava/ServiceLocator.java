package com.siva.springjava;

import com.siva.springjava.services.DepartmentService;
import com.siva.springjava.services.DepartmentServiceImpl;
import com.siva.springjava.services.EmployeeService;
import com.siva.springjava.services.EmployeeServiceImpl;

/**
 *
 * @author siva
 */
public class ServiceLocator {
    private static EmployeeService employeeService = new EmployeeServiceImpl();
    private static DepartmentService departmentService = new DepartmentServiceImpl();

    public ServiceLocator() {
    }
    
    public EmployeeService createEmployeeService(){
        return employeeService;
    }
    
    public DepartmentService createDepartmentService(){
        return departmentService;
    }
    
}
