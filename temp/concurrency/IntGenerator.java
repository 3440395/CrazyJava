//: concurrency/IntGenerator.java
package com.xk.sample.concurrency; /* Added by Eclipse.py */

public abstract class IntGenerator {
  private volatile boolean canceled = false;
  public abstract int next();
  // Allow this to be canceled:
  public void cancel() { canceled = true; }
  public boolean isCanceled() { return canceled; }
} ///:~
