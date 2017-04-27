//: generics/LimitsOfInference.java
package com.xk.sample.generics; /* Added by Eclipse.py */
import com.xk.sample.typeinfo.pets.Person;
import com.xk.sample.typeinfo.pets.Pet;

import java.util.*;

public class LimitsOfInference {
  static void
  f(Map<Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
    // f(New.map()); // Does not compile
  }
} ///:~
