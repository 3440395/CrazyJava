//: generics/SimplerPets.java
package com.xk.sample.generics; /* Added by Eclipse.py */
import com.xk.sample.net.mindview.util.New;
import com.xk.sample.typeinfo.pets.Person;
import com.xk.sample.typeinfo.pets.Pet;

import java.util.*;

public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Rest of the code is the same...
  }
} ///:~
