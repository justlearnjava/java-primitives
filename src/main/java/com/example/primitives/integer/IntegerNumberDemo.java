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

package com.example.primitives.integer;

import java.util.Scanner;

public class IntegerNumberDemo {

  // Class-level variables for demonstrating default values
  byte byteValue;
  short shortValue;
  int intValue;
  long longValue;

  public void doDemo(final Scanner scanner) {
    byte userChoice = -1;
    while (userChoice != 0) {
      // Choose an integer to learn about
      System.out.println("***************************************************************");
      System.out.println("Please choose an integer to learn about (1-4, enter 0 to quit):");
      System.out.println("1: byte");
      System.out.println("2: short");
      System.out.println("3: int");
      System.out.println("4: long");
      System.out.print("(enter 0 to quit) ==> ");
      if (scanner.hasNextByte()) {
        userChoice = scanner.nextByte();
        if (userChoice == 1) {
          demonstrateByte(scanner);
        } else if (userChoice == 2) {
          demonstrateShort(scanner);
        } else if (userChoice == 3) {
          demonstrateInt(scanner);
        } else if (userChoice == 4) {
          demonstrateLong(scanner);
        } else if (userChoice == 0) {
          System.out.println("Exiting " + IntegerNumberDemo.class.getSimpleName() + "...");
        } else {
          invalidInput(userChoice);
        }
      } else {
        String next = scanner.next();
        invalidInput(next);
      }
    }
  }

  private static void invalidInput(byte next) {
    System.out.printf("Invalid input (%d). Please try again (enter 0 to quit).%n", next);
  }

  private static void invalidInput(String next) {
    System.out.printf("Invalid input (%s). Please try again (enter 0 to quit).%n", next);
  }

  private void demonstrateByte(final Scanner scanner) {
    System.out.println("*********** BYTE DEMO ***********");
    System.out.println("A byte is 8 bits in length.");
    System.out.printf("Default value of class member: %d%n", byteValue);
    System.out.println("Minimum value:");
    System.out.printf("\t(decimal)    : %d%n", Byte.MIN_VALUE);
    System.out.printf("\t(hexadecimal): 0x%2X%n", Byte.MIN_VALUE);
    System.out.printf("\t(binary)     : %s%n", formatBinaryString(Byte.MIN_VALUE));
    System.out.println("Maximum value:");
    System.out.printf("\t(decimal)    : %d%n", Byte.MAX_VALUE);
    System.out.printf("\t(hexadecimal): 0x%2X%n", Byte.MAX_VALUE);
    System.out.printf("\t(binary)     : %s%n", formatBinaryString(Byte.MAX_VALUE));
    System.out.print("Enter any value to return to the previous menu ==> ");
    scanner.next();
  }

  private void demonstrateShort(final Scanner scanner) {
    System.out.println("*********** SHORT DEMO ***********");
    System.out.println("A short is 16 bits in length.");
    System.out.printf("Default value of class member: %d%n", shortValue);
    System.out.println("Minimum value:");
    System.out.printf("\t(decimal)    : %d%n", Short.MIN_VALUE);
    System.out.printf("\t(hexadecimal): 0x%2X%n", Short.MIN_VALUE);
    System.out.printf("\t(binary)     : %s%n", formatBinaryString(Short.MIN_VALUE));
    System.out.println("Maximum value:");
    System.out.printf("\t(decimal)    : %d%n", Short.MAX_VALUE);
    System.out.printf("\t(hexadecimal): 0x%2X%n", Short.MAX_VALUE);
    System.out.printf("\t(binary)     : %s%n", formatBinaryString(Short.MAX_VALUE));
    System.out.print("Enter any value to return to the previous menu ==> ");
    scanner.next();
  }

  private void demonstrateInt(final Scanner scanner) {
    System.out.println("*********** INT DEMO ***********");
    System.out.println("An int is 32 bits in length.");
    System.out.printf("Default value of class member: %d%n", intValue);
    System.out.println("Minimum value:");
    System.out.printf("\t(decimal)    : %d%n", Integer.MIN_VALUE);
    System.out.printf("\t(hexadecimal): 0x%2X%n", Integer.MIN_VALUE);
    System.out.printf("\t(binary)     : %s%n", formatBinaryString(Integer.MIN_VALUE));
    System.out.println("Maximum value:");
    System.out.printf("\t(decimal)    : %d%n", Integer.MAX_VALUE);
    System.out.printf("\t(hexadecimal): 0x%2X%n", Integer.MAX_VALUE);
    System.out.printf("\t(binary)     : %s%n", formatBinaryString(Integer.MAX_VALUE));
    System.out.print("Enter any value to return to the previous menu ==> ");
    scanner.next();
  }

  private void demonstrateLong(final Scanner scanner) {
    System.out.println("*********** LONG DEMO ***********");
    System.out.println("A long is 64 bits in length.");
    System.out.printf("Default value of class member: %d%n", longValue);
    System.out.println("Minimum value:");
    System.out.printf("\t(decimal)    : %d%n", Long.MIN_VALUE);
    System.out.printf("\t(hexadecimal): 0x%2X%n", Long.MIN_VALUE);
    System.out.printf("\t(binary)     : %s%n", formatBinaryString(Long.MIN_VALUE, 0));
    System.out.println("Maximum value:");
    System.out.printf("\t(decimal)    : %d%n", Long.MAX_VALUE);
    System.out.printf("\t(hexadecimal): 0x%2X%n", Long.MAX_VALUE);
    System.out.printf("\t(binary)     : %s%n", formatBinaryString(Long.MAX_VALUE, 0));
    System.out.print("Enter any value to return to the previous menu ==> ");
    scanner.next();
  }

  private String formatBinaryString(byte value) {
    return formatBinaryString(value, 56);
  }

  private String formatBinaryString(short value) {
    return formatBinaryString(value, 48);
  }

  private String formatBinaryString(int value) {
    return formatBinaryString(value, 32);
  }

  private String formatBinaryString(long value, int beginSubstringIndex) {
    return String.format("%64s", Long.toBinaryString(value)).replace(' ', '0').substring(beginSubstringIndex);
  }
}
