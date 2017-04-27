//: access/ChocolateChip.java
package com.xk.sample.access; /* Added by Eclipse.py */
// Can't use package-access member from another package.
import com.xk.sample.access.dessert.Cookie;

public class ChocolateChip extends Cookie {
  public ChocolateChip() {
   System.out.println("ChocolateChip constructor");
  }
  public void chomp() {
    //! bite(); // Can't access bite
  }
  public static void main(String[] args) {
    ChocolateChip x = new ChocolateChip();
    x.chomp();
  }
} /* Output:
Cookie constructor
ChocolateChip constructor
*///:~
