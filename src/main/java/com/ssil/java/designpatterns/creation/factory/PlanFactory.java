package com.ssil.java.designpatterns.creation.factory;

public class PlanFactory {

    public Plan getPlan(String planName) {
        return switch (planName) {
            case "IndustrialPlan" -> new IndustrialPlan();
            case "BusinessPlan" -> new BusinessPlan();
            default -> new DomesticPlan();
        };
    }

}
