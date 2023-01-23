package com.ssil.java.designpatterns.creation.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanFactoryTests {

    @Test
    public void testIndustrialPlan() {
        Plan plan = (new PlanFactory()).getPlan("IndustrialPlan");
        assertEquals(91, plan.calculateBill(10));
    }

    @Test
    public void testBusinessPlan() {
        Plan plan = (new PlanFactory()).getPlan("BusinessPlan");
        assertEquals(81, plan.calculateBill(10));
    }

    @Test
    public void testDomesticPlan() {
        Plan plan = (new PlanFactory()).getPlan("DomesticPlan");
        assertEquals(71, plan.calculateBill(10));
    }

    @Test
    public void testDefaultPlan() {
        Plan plan = (new PlanFactory()).getPlan("DefaultPlan");
        assertEquals(71, plan.calculateBill(10));
    }

}
