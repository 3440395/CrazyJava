//: generics/SelfBoundingMethods.java
package com.xk.sample.generics; /* Added by Eclipse.py */

public class SelfBoundingMethods {
  static <T extends SelfBounded<T>> T f(T arg) {
    return arg.set(arg).get();
  }
  public static void main(String[] args) {
    A a = f(new A());
  }
} ///:~
