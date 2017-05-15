//: annotations/HashSetTest.java
package com.xk.sample.annotations;
import com.xk.sample.net.mindview.atunit.Test;
import com.xk.sample.net.mindview.util.OSExecute;

import java.util.*;

public class HashSetTest {
  HashSet<String> testObject = new HashSet<String>();
  @Test
  void initialization() {
    assert testObject.isEmpty();
  }
  @Test void _contains() {
    testObject.add("one");
    assert testObject.contains("one");
  }
  @Test void _remove() {
    testObject.add("one");
    testObject.remove("one");
    assert testObject.isEmpty();
  }
  public static void main(String[] args) throws Exception {
    OSExecute.command(
      "java AtUnit HashSetTest");
  }
} /* Output:
HashSetTest
  . initialization
  . _remove
  . _contains
OK (3 tests)
*///:~
