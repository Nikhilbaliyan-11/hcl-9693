package com.codewithnikhil.HRMS;

import org.springframework.stereotype.Component;

@Component
public class Salary {
    private double basic = 50000.0;
    private double da = 15000.0;
    private double hr = 12000.0;

    public double getTotalSalary() {
        return basic + da + hr;
    }

    @Override
    public String toString() {
        return "Basic: " + basic + ", DA: " + da + ", HR: " + hr + " (Total: " + getTotalSalary() + ")";
    }
}
