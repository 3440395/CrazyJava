//: exceptions/Switch.java
package com.xk.sample.exceptions; /* Added by Eclipse.py */
import static com.xk.sample.net.mindview.util.Print.print;

public class Switch {
  private boolean state = false;
  public boolean read() { return state; }
  public void on() { state = true; print(this); }
  public void off() { state = false; print(this); }
  public String toString() { return state ? "on" : "off"; }
} ///:~
