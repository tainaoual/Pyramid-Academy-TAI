package com.example.demo.ipi;
// Aoutors: tai & bilala
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import lombok.Data;

import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


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

    }

