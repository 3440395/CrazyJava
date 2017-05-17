//: annotations/Testable.java
package com.xk.sample.annotations;
import com.xk.sample.net.mindview.atunit.Test;

public class Testable {
  public void execute() {
    System.out.println("Executing..");
  }
  @Test
  void testExecute() { execute(); }
} ///:~
