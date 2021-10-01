package com.example.demo;

import com.example.demo.ipi.Flight;
import com.example.demo.ipi.Plan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);}


    Flight nana = new Flight();

    Plan nana1 = new Plan();

    String PlanType() {
        Runnable runnable = () -> PlanType();
        nana.setSize("10");
        nana1.setPSize("8");
        nana1.getType();
        nana1.getPSize();
        nana.getSize();
return nana1.PlanType();

    }

}
