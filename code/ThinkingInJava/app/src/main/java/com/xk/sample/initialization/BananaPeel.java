//: initialization/BananaPeel.java
package com.xk.sample.initialization; /* Added by Eclipse.py */

class Banana { void peel(int i) { /* ... */ } }

public class BananaPeel {
  public static void main(String[] args) {
    Banana a = new Banana(),
           b = new Banana();
    a.peel(1);
    b.peel(2);
  }
} ///:~
