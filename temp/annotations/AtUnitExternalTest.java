//: annotations/AtUnitExternalTest.java
// Creating non-embedded tests.
package com.xk.sample.annotations;
import com.xk.sample.net.mindview.atunit.Test;
import com.xk.sample.net.mindview.util.OSExecute;

public class AtUnitExternalTest extends AtUnitExample1 {
  @Test
  boolean _methodOne() {
    return methodOne().equals("This is methodOne");
  }
  @Test boolean _methodTwo() { return methodTwo() == 2; }
  public static void main(String[] args) throws Exception {
    OSExecute.command(
     "java AtUnit AtUnitExternalTest");
  }
} /* Output:
AtUnitExternalTest
  . _methodOne
  . _methodTwo This is methodTwo

OK (2 tests)
*///:~
