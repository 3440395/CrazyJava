//: innerclasses/DotNew.java
package com.xk.sample.innerclasses; /* Added by Eclipse.py */
// Creating an inner class directly using the .new syntax.

public class DotNew {
  public class Inner {}
  public static void main(String[] args) {
    DotNew dn = new DotNew();
    Inner dni = dn.new Inner();
  }
} ///:~
