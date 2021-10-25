package org.fges.m1.ppc;


import javax.persistence.Id;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Data
public class Boisson{
  @Id
  @GeneratedValue
  private int id;
  // private TypeBoisson type;
  private String name;
  private String description;
  private int price;

  //TypeBoisson type
  public Boisson(int id, String name, String description, int price){
    this.id = id;
    // this.type = type;
    this.name = name;
    this.description = description;
    this.price = price;
  }

  public int getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }

  public String getDesc(){
    return this.description;
  }

  public int getPrice(){
    return this.price;
  }

  // public TypeBoisson getType(){
  //   return this.type;
  // }



}
