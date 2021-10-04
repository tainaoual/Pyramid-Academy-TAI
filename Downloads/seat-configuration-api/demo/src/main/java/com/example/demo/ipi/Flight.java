package com.example.demo.ipi;
/* Title: Flight project Entity
 * @author: tai & bilal
 */
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@Table(name = "flight")
@XmlRootElement
@Data
@NoArgsConstructor
/* This is the Flight Entity class
 * Implements Serializable
 * using @Data which is from lombok reduces boilerplate code,  it can generate getters and setters
 * using @noArgsConstructor to automatically generate default empty constructor
 */
public class Flight implements Serializable {
  @Id
  private  String id ;
  private  String size;
  private  String seatNumber;
  private String flightNumber;

    }

