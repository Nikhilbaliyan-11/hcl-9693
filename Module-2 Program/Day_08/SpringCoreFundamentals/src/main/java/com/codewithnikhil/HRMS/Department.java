package com.codewithnikhil.HRMS;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private String deptName = "Engineering";

    @Override
    public String toString() {
        return deptName;
    }
}
