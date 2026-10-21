package com.codewithnikhil.HRMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class employee {
    private final Address address;
    private final Department department;
    private final Salary salary;


    public employee(Address address, Department department, Salary salary) {
        this.address = address;
        this.department = department;
        this.salary = salary;
    }

    public void display() {

        System.out.println("            EMPLOYEE DETAILS             ");
        System.out.println("=========================================");
        System.out.println("Department : " + department);
        System.out.println("Address    : " + address);
        System.out.println("Salary Info: " + salary);

    }
}
