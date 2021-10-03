package com.example.demo.ipi;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class PlanService  {

//    List<String> type = new ArrayList<String>();
//            type.add("large");
//        type.add("small");
//        type.add("medium");
//        Collections.addAll(type);

    @Autowired
    private PlantRepo plantRepo;


//
//    public Plan newPlan() {
//        Plan object = new Plan();
//        object.setId(java.util.UUID.randomUUID().toString());
//        object.getpSize();
//        object.getPlanType();
//
//
//
//        return object;
//
//    }

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
        plan.setPlanType("small");
        plan.setpSize("small");
        if(plan.getpSize().equals("small")){
            planMap.put(plan, cabins);
        }

        return planMap;
    }
    public static  Map<Plan, String[]> findBigPlanes(Plan plan, String planeSize) {
        String[] cabins = {"First class", "business", "Economy"};
        Map<Plan, String[]> planMap = new HashMap<>();
        plan.setId(java.util.UUID.randomUUID().toString());
        plan.setPlanType("big");
        plan.setpSize("big");
        if(plan.getpSize().equals("big")){
            planMap.put(plan, cabins);
        }

        return planMap;
    }

}

