package com.example.demo.ipi;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class PlanService {
    @Autowired

    private PlantRepo plantRepo;


    public Plan newPlan() {
        Plan object = new Plan();
        object.setId(java.util.UUID.randomUUID().toString());
        object.getPSize();
        object.setPlansType();

        return object;

    }

    public Iterable<Plan> retrieveAllPlans(){
        return plantRepo.findAll();
    }
    public void savePlan(Plan planToSave){
        plantRepo.save(planToSave);
    }

    public static Plan[] findTypesPlan() {
        Map<Plan, String> planMap =new HashMap<>();

    planMap.put(findTypesPlan()[1],"large");

        return new Plan[13];
    }
}

