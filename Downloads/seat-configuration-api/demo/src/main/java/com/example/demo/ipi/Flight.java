package com.example.demo.ipi;
// Aoutors: tai & bilala
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "flight")
@XmlRootElement
@Data
@ToString
//flight antity to find plans
public class Flight implements Serializable {
    @Id
  private  String id ;

  private  String size;
  private  String seatNumber;

  private String flightNumber;

    public void setSize() {
    }
//  @OneToMany(mappedBy="flight",orphanRemoval = true)
//  private List<Plan>plans=Collections.EMPTY_LIST;
//
//    public void setSize() {
//
//    }
//  public  String getSeatNumber(){
//    if("A1"seatNumber >"A10")

    }

