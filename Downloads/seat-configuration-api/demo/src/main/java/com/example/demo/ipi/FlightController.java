package com.example.demo.ipi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//controler class
@RestController
public class FlightController {
//    @Autowired
//    private FlightService flightService;
//    @RequestMapping(method= RequestMethod.GET, value="/flights", produces={"application/xml"})
//    public Flight getFlight() {
//        return flightService.newFlight();
//    }

    private final FlightRepo flightRepo;
    private final PlantRepo plantRepo;
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
        public ResponseEntity<Plan> save (@RequestBody Plan plan){
            try {
                return new ResponseEntity<>(plantRepo.save(plan), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
