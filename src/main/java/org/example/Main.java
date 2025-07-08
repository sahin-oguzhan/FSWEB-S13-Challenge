package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Company company = new Company(1, "Oğuzhan AŞ", 500.000, new String[]{"Oğuzhan, Elif"});
        Employee employee = new Employee(2, "Oğuzhan Şahin", "oguzsahiinn@gmail.com", "123456789", new String[]{"BASIC", "PREMIUM", "VIP"});
        HealthPlan healthPlan = new HealthPlan(1, "PREMIUM", Plan.PREMIUM);
        System.out.println(company.toString());
        System.out.println(employee.toString());
        System.out.println(healthPlan.toString());

    }
}