package com.promineotech.model;

public class Animal {
  
  private String name;
  private String species;

  public Animal(String name, String species) {
    super();
    this.name = name;
    this.species = species;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public String getSpecies() {
    return species;
  }
  public void setSpecies(String species) {
    this.species = species;
  }
  
  public static int compare(Animal a1, Animal a2) {
    return a1.getName().compareTo(a2.getName());
  }

  @Override
  public String toString() {
    return "Animal [name=" + name + ", species=" + species + "]";
  }
  
}