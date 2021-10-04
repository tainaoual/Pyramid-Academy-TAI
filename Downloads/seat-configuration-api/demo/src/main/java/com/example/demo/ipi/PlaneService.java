package com.example.demo.ipi;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class PlaneService {

    @Autowired
    private PlaneRepo planeRepo;



    public Plane newPlane() {
        Plane object = new Plane();
        object.setId(java.util.UUID.randomUUID().toString());
        object.getpSize();
        object.getPlanType();
        return object;

    }
    /*This method Iterates to retrieve All Planes*/
    public Iterable<Plane> retrieveAllPlans(){
        return planeRepo.findAll();
    }
    /*This Method saves a plane*/
    public void savePlan(Plane planeToSave){
        planeRepo.save(planeToSave);
    }
    /*
     * This */
    public static  Map<Plane, String[]> findSmallPlanes(Plane plane, String planeSize) {
        String[] cabins = {"Comfort", "Main", "Economy"};
        Map<Plane, String[]> planeMap = new HashMap<>();
        plane.setId(java.util.UUID.randomUUID().toString());
        plane.setPlanType("smallPlan");
        plane.setpSize("smallPlan");
        if(plane.getpSize().equals("smallPlan")){
            planeMap.put(plane, cabins);
        }

        return planeMap;
    }


    public static  Map<Plane, String[]> findBigPlanes(Plane plane, String planeSize) {
        String[] cabins = {"First class", "business", "Economy","ksks","hdfhsdh"};
        Map<Plane, String[]> planeMap = new HashMap<>();
        plane.setId(java.util.UUID.randomUUID().toString());
        plane.setPlanType("bigPlan");
        plane.setpSize("bigPlan");
        if(plane.getpSize().equals("bigPlan")){
            planeMap.put(plane, cabins);
        }

        return planeMap;
    }

}

