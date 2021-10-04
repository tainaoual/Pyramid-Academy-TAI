package com.example.demo.ipi;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class PlanService  {


    @Autowired
    private PlantRepo plantRepo;



    public Plan newPlan() {
        Plan object = new Plan();
        object.setId(java.util.UUID.randomUUID().toString());
        object.getpSize();
        object.getPlanType();



        return object;

    }

    public Iterable<Plan> retrieveAllPlans(){
        return plantRepo.findAll();
    }
    public void savePlan(Plan planToSave){
        plantRepo.save(planToSave);
    }

    public static  Map<Plan, String[]> findSmallPlanes(Plan plan, String planeSize) {
        String[] cabins = {"Comfort", "Main", "Economy"};
        Map<Plan, String[]> planMap = new HashMap<>();
        plan.setId(java.util.UUID.randomUUID().toString());
        plan.setPlanType("smallPlan");
        plan.setpSize("smallPlan");
        if(plan.getpSize().equals("smallPlan")){
            planMap.put(plan, cabins);
        }

        return planMap;
    }
    public static  Map<Plan, String[]> findBigPlanes(Plan plan, String planeSize) {
        String[] cabins = {"First class", "business", "Economy","ksks","hdfhsdh"};
        Map<Plan, String[]> planMap = new HashMap<>();
        plan.setId(java.util.UUID.randomUUID().toString());
        plan.setPlanType("bigPlan");
        plan.setpSize("bigPlan");
        if(plan.getpSize().equals("bigPlan")){
            planMap.put(plan, cabins);
        }

        return planMap;
    }

}

