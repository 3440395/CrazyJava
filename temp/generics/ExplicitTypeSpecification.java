//: generics/ExplicitTypeSpecification.java
package com.xk.sample.generics; /* Added by Eclipse.py */
import com.xk.sample.net.mindview.util.New;
import com.xk.sample.typeinfo.pets.Person;
import com.xk.sample.typeinfo.pets.Pet;

import java.util.*;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
