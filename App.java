package com.promineotech.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.promineotech.model.Animal;

public class App {
  
  public static void main(String[] args) {
    
    List<Animal> animals = new ArrayList<Animal>();
      animals.add(new Animal("Chimpanzee", "Primate"));
      animals.add(new Animal("Sparrow", "Bird"));
      animals.add(new Animal("Coyote", "Canine"));
      animals.add(new Animal("Ostrich", "Bird"));
      animals.add(new Animal("Bobcat", "Feline"));
      animals.add(new Animal("Cougar", "Feline"));
      animals.add(new Animal("Fox", "Canine"));
      animals.add(new Animal("Tiger", "Feline"));
      animals.add(new Animal("Gopher", "Rodent"));
      animals.add(new Animal("Jackrabbit", "Rodent"));
      animals.add(new Animal("Jaguar", "Feline"));
      animals.add(new Animal("Eagle", "Bird"));
      animals.add(new Animal("Wolf", "Canine"));
      animals.add(new Animal("Lion", "Feline"));
      
      
      Collections.sort(animals, new Comparator<Animal>(){
        
        @Override
        public int compare(Animal a1, Animal a2) {
          return (int) (a1.getName().compareTo(a2.getName()));
        }
      });
      
      Collections.sort(animals,(a1, a2) -> Animal.compare(a1, a2));
      System.out.println(animals);
      
      Collections.sort(animals, Animal::compare);
      System.out.println(animals);
      
  }
  
}
