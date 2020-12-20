/*
 *    Copyright 2020 Just Learn Java
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.example.primitives.floatingpoint;

import java.util.Scanner;

public class FloatingPointNumbersDemo {
  // Class-level variables for demonstrating default values
  float floatValue;
  double doubleValue;

  private static void invalidInput(byte next) {
    System.out.printf("Invalid input (%d). Please try again (enter 0 to quit).%n", next);
  }

  private static void invalidInput(String next) {
    System.out.printf("Invalid input (%s). Please try again (enter 0 to quit).%n", next);
  }

  public void doDemo(final Scanner scanner) {
    byte userChoice = -1;
    while (userChoice != 0) {
      // Choose an floatint point number to learn about
      System.out.println("****************************************************************************");
      System.out.println("Please choose a floating point number to learn about (1-4, enter 0 to quit):");
      System.out.println("1: float");
      System.out.println("2: double");
      System.out.print("(enter 0 to quit) ==> ");
      if (scanner.hasNextByte()) {
        userChoice = scanner.nextByte();
        if (userChoice == 1) {
          demonstrateFloat(scanner);
        } else if (userChoice == 2) {
          demonstrateDouble(scanner);
        } else if (userChoice == 0) {
          System.out.println("Exiting " + FloatingPointNumbersDemo.class.getSimpleName() + "...");
        } else {
          invalidInput(userChoice);
        }
      } else {
        String next = scanner.next();
        invalidInput(next);
      }
    }
  }

  private void demonstrateFloat(final Scanner scanner) {
    System.out.println("*********** FLOAT DEMO ***********");
    System.out.println("A float is 32 bits in length.");
    System.out.printf("Default value of class member: %f%n", floatValue);
    System.out.printf("Minimum value: %g%n", Float.MIN_VALUE);
    System.out.printf("Maximum value: %g%n", Float.MAX_VALUE);
    System.out.print("Enter any value to return to the previous menu ==> ");
    scanner.next();
  }

  private void demonstrateDouble(final Scanner scanner) {
    System.out.println("*********** DOUBLE DEMO ***********");
    System.out.println("A double is 64 bits in length.");
    System.out.printf("Default value of class member: %f%n", doubleValue);
    System.out.printf("Minimum value: %g%n", Double.MIN_VALUE);
    System.out.printf("Maximum value: %g%n", Double.MAX_VALUE);
    System.out.print("Enter any value to return to the previous menu ==> ");
    scanner.next();
  }

}
