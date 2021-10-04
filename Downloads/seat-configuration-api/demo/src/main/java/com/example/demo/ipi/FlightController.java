package com.example.demo.ipi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/*Rest Controller Class for Flight Entity */
@RestController
public class FlightController {


    @Autowired
    private final FlightRepo flightRepo;
    private final PlaneRepo planeRepo;
    private PlaneService planeService;


    public FlightController(FlightRepo flightRepo, PlaneRepo planeRepo) {
        this.flightRepo = flightRepo;
        this.planeRepo = planeRepo;
    }


    /*This Method allows for saving the Flight body content
    * @param type: Flight
    * @return: flight/HttpStatusCode
    * */
    @PostMapping("/flight")
    public ResponseEntity<Flight> save(@RequestBody Flight flight) {
        try {
            return new ResponseEntity<>(flightRepo.save(flight), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /* This Method allows for saving the Flight body content
     * @param type: Plane
     * @return: plane/HttpStatusCode
     * */
    @PostMapping("/plane")
    public ResponseEntity<Plane> save(@RequestBody Plane plane) {
        try {
            return new ResponseEntity<>(planeRepo.save(plane), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /* This Method attempts to read Plane from DB
     * @param type: Plane
     * @return: plane/HttpStatusCode
     * */
    @GetMapping("/plan")
    public ResponseEntity<List<Plane>> Type() {
        try {
            List<Plane> list = (List<Plane>) planeRepo.findAll();
            if (list.isEmpty() || list.size() == '0') {
                return new ResponseEntity<List<Plane>>(HttpStatus.NO_CONTENT);

            }
            return new ResponseEntity<List<Plane>>(list, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<List<Plane>>((List<Plane>) null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /* This Method attempts to read smallPlane from DB
     * @param type: Plane
     * @return: plane/HttpStatusCode
     * */
    @GetMapping("/smallPlan")
    public Map<Plane,String[]> small(Plane plane){
        return PlaneService.findSmallPlanes(plane, "smallPlan");
    }

    /* This Method attempts to read bigPlane from DB
     * @param type: Plane
     * @return: plane/HttpStatusCode
     * */
    @GetMapping("/bigPlan")
    public Map<Plane,String[]> big(Plane plane){
        return PlaneService.findBigPlanes(plane, "bigPlan");
    }
}




