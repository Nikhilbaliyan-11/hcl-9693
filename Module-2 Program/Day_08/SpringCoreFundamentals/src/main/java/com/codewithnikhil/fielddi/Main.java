package com.codewithnikhil.fielddi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCon.class);
        Employee employee =  context.getBean(Employee.class);
        String res = employee.displayAddress();
        System.out.println(res);
        context.close();
    }
}
