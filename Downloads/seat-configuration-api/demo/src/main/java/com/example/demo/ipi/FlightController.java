package com.example.demo.ipi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//controler class
@RestController
public class FlightController {
//    @Autowired
//    private FlightService flightService;
//    @RequestMapping(method= RequestMethod.GET, value="/flights", produces={"application/xml"})
//    public Flight getFlight() {
//        return flightService.newFlight();
//    }
    @Autowired
    private final FlightRepo flightRepo;
    private final PlantRepo plantRepo;
    private PlanService planService;


    public FlightController(FlightRepo flightRepo, PlantRepo plantRepo) {
        this.flightRepo = flightRepo;
        this.plantRepo = plantRepo;
    }



    @PostMapping("/flight")
    public ResponseEntity<Flight> save(@RequestBody Flight flight) {
        try {
            return new ResponseEntity<>(flightRepo.save(flight), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/plan")
    public ResponseEntity<Plan> save(@RequestBody Plan plan) {
        try {
            return new ResponseEntity<>(plantRepo.save(plan), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //            @GetMapping("/plan")
////            @RequestMapping(method=RequestMethod.GET, value="/findTypesPlan", produces={"application/json"})
//            public Plan[] findTypesPlan() {
//                return PlanService.findTypesPlan();
//            }
    @GetMapping("/plan")
    public ResponseEntity<List<Plan>> Type() {
        try {
            List<Plan> list = (List<Plan>) plantRepo.findAll();
            if (list.isEmpty() || list.size() == '0') {
                return new ResponseEntity<List<Plan>>(HttpStatus.NO_CONTENT);

            }
            return new ResponseEntity<List<Plan>>(list, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<List<Plan>>((List<Plan>) null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/smallPlan")
    public Map<Plan,String[]> small(Plan plan){
        return PlanService.findSmallPlanes(plan, "smallPlan");
    }
    @GetMapping("/bigPlan")
    public Map<Plan,String[]> big(Plan plan){
        return PlanService.findBigPlanes(plan, "bigPlan");
    }
}




