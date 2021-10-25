// package org.fges.m1.ppc;
// import java.util.*;
// import javax.persistence.Id;
// import javax.persistence.Entity;
// import javax.persistence.JoinColumn;
// import javax.persistence.OneToMany;

// @Entity
// public class TypeBoisson{
// @Id
// private int id;
// private String name;
// private String description;

// @OneToMany
// @JoinColumn(name = "boisson_id")
// private Set<Boisson> boissonList = new HashSet<>();

// public TypeBoisson(int id, String name, String description){
//   this.id = id;
//   this.name = name;
//   this.description = description;
// }

// public int getId(){
//   return this.id;
// }

// public String getName(){
//   return this.name;
// }

// public String getDesc(){
//   return this.description;
// }

// }
