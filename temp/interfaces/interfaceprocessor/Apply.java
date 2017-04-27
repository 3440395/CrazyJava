//: interfaces/interfaceprocessor/Apply.java
package com.xk.sample.interfaces.interfaceprocessor;
import static com.xk.sample.net.mindview.util.Print.print;

public class Apply {
  public static void process(Processor p, Object s) {
    print("Using Processor " + p.name());
    print(p.process(s));
  }
} ///:~
