package com.codewithnikhil;

import com.codewithnikhil.setterdi.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        employe employee = context.getBean(employe.class);
        employee.display();

        employe employee2 = context.getBean(employe.class);
        employee2.display();

    }
}