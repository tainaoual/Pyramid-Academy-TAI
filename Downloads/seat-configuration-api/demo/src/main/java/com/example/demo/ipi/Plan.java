package com.example.demo.ipi;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Entity
@Table(name = "plan")
@XmlRootElement
@Data
@ToString
public class Plan implements Serializable {

//flight antity to find plans

    @Id
    private String id;

    private String pSize;
    private String type;




    public String PlanType() {
        List<String> type= new ArrayList<String>();
        type.add("1");
        type.add("2");
        type.add("3");
        Collections.addAll(type);
        if (type.add("10")){



        return "first class";

    }return "economy";

    }}