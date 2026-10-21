package com.codewithnikhil.HRMS;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city = "New York";
    private String state = "NY";

    @Override
    public String toString() {
        return city + ", " + state;
    }
}
