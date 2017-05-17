//: holding/PetMap.java
package com.xk.sample.holding; /* Added by Eclipse.py */
import com.xk.sample.typeinfo.pets.Cat;
import com.xk.sample.typeinfo.pets.Dog;
import com.xk.sample.typeinfo.pets.Hamster;
import com.xk.sample.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

import static com.xk.sample.net.mindview.util.Print.print;

public class PetMap {
  public static void main(String[] args) {
    Map<String,Pet> petMap = new HashMap<String,Pet>();
    petMap.put("My Cat", new Cat("Molly"));
    petMap.put("My Dog", new Dog("Ginger"));
    petMap.put("My Hamster", new Hamster("Bosco"));
    print(petMap);
    Pet dog = petMap.get("My Dog");
    print(dog);
    print(petMap.containsKey("My Dog"));
    print(petMap.containsValue(dog));
  }
} /* Output:
{My Cat=Cat Molly, My Hamster=Hamster Bosco, My Dog=Dog Ginger}
Dog Ginger
true
true
*///:~
