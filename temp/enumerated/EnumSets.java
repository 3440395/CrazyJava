//: enumerated/EnumSets.java
// Operations on EnumSets
package com.xk.sample.enumerated;
import java.util.EnumSet;

import static com.xk.sample.enumerated.AlarmPoints.BATHROOM;
import static com.xk.sample.enumerated.AlarmPoints.KITCHEN;
import static com.xk.sample.enumerated.AlarmPoints.OFFICE1;
import static com.xk.sample.enumerated.AlarmPoints.OFFICE4;
import static com.xk.sample.enumerated.AlarmPoints.STAIR1;
import static com.xk.sample.enumerated.AlarmPoints.STAIR2;
import static com.xk.sample.net.mindview.util.Print.print;

public class EnumSets {
  public static void main(String[] args) {
    EnumSet<AlarmPoints> points =
      EnumSet.noneOf(AlarmPoints.class); // Empty set
    points.add(BATHROOM);
    print(points);
    points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
    print(points);
    points = EnumSet.allOf(AlarmPoints.class);
    points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
    print(points);
    points.removeAll(EnumSet.range(OFFICE1, OFFICE4));
    print(points);
    points = EnumSet.complementOf(points);
    print(points);
  }
} /* Output:
[BATHROOM]
[STAIR1, STAIR2, BATHROOM, KITCHEN]
[LOBBY, OFFICE1, OFFICE2, OFFICE3, OFFICE4, BATHROOM, UTILITY]
[LOBBY, BATHROOM, UTILITY]
[STAIR1, STAIR2, OFFICE1, OFFICE2, OFFICE3, OFFICE4, KITCHEN]
*///:~
