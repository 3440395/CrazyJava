//: typeinfo/toys/ToyTest.java
// Testing class Class.
package com.xk.sample.typeinfo.toys;
import static com.xk.sample.net.mindview.util.Print.print;
interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
  // Comment out the following default constructor
  // to see NoSuchMethodError from (*1*)
  Toy() {}
  Toy(int i) {}
}

class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots {
  FancyToy() { super(1); }
}

public class ToyTest {
  static void printInfo(Class cc) {
    print("Class name: " + cc.getName() +
      " is interface? [" + cc.isInterface() + "]");
    print("Simple name: " + cc.getSimpleName());
    print("Canonical name : " + cc.getCanonicalName());
  }
  public static void main(String[] args) {
    Class c = null;
    try {
      c = Class.forName("FancyToy");
    } catch(ClassNotFoundException e) {
      print("Can't find FancyToy");
      System.exit(1);
    }
    printInfo(c);	
    for(Class face : c.getInterfaces())
      printInfo(face);
    Class up = c.getSuperclass();
    Object obj = null;
    try {
      // Requires default constructor:
      obj = up.newInstance();
    } catch(InstantiationException e) {
      print("Cannot instantiate");
      System.exit(1);
    } catch(IllegalAccessException e) {
      print("Cannot access");
      System.exit(1);
    }
    printInfo(obj.getClass());
  }
} /* Output:
Class name: FancyToy is interface? [false]
Simple name: FancyToy
Canonical name : FancyToy
Class name: HasBatteries is interface? [true]
Simple name: HasBatteries
Canonical name : HasBatteries
Class name: Waterproof is interface? [true]
Simple name: Waterproof
Canonical name : Waterproof
Class name: Shoots is interface? [true]
Simple name: Shoots
Canonical name : Shoots
Class name: Toy is interface? [false]
Simple name: Toy
Canonical name : Toy
*///:~
