//: enumerated/EnumMaps.java
// Basics of EnumMaps.
package com.xk.sample.enumerated;

import java.util.*;

import static com.xk.sample.enumerated.AlarmPoints.*;
import static com.xk.sample.net.mindview.util.Print.print;
import static com.xk.sample.net.mindview.util.Print.printnb;

interface Command {
    void action();
}

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em =
                new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        em.put(KITCHEN, () -> print("Kitchen fire!"));
        em.put(BATHROOM, () -> print("Bathroom alert!"));
        for (Map.Entry<AlarmPoints, Command> e : em.entrySet()) {
            printnb(e.getKey() + ": ");
            e.getValue().action();
        }
        try { // If there's no value for a particular key:
            em.get(UTILITY).action();
        } catch (Exception e) {
            print(e);
        }
    }
} /* Output:
BATHROOM: Bathroom alert!
KITCHEN: Kitchen fire!
java.lang.NullPointerException
*///:~
