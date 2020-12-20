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

/**
 * Demonstrates the destructive effects of narrowing conversions.
 */
public class NarrowingConversionDemo {
  // Declare logger
  private static final System.Logger logger = System.getLogger(NarrowingConversionDemo.class.getName());

  // Use constants for log level for readability
  private static final System.Logger.Level LOG_ERROR = System.Logger.Level.ERROR;

  public static void main(final String[] args) {
    NarrowingConversionDemo narrowingConversionDemo = new NarrowingConversionDemo();

    byte userChoice = -1;
    while (userChoice != 0) {
      // Show a menu: (1) destructive (2) sometimes destructive (3) enter a number
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a choice (1-3, 0 to quit):");
      System.out.println("\t1 - Demonstrate always destructive narrowing conversion");
      System.out.println("\t2 - Demonstrate sometimes destructive narrowing conversion");
      System.out.println("\t3 - Let me enter a number");
      System.out.print("(enter 0 to quit) ==> ");
      if (scanner.hasNextByte()) {
        userChoice = scanner.nextByte();
        if (userChoice == 1) {
          // Option 1 - Demonstrate when narrowing conversion is always destructive to the original number
          narrowingConversionDemo.alwaysDestructiveNarrowingConversion();
          System.out.print("Enter any value to continue ==> ");
          scanner.next();
        } else if (userChoice == 2) {
          // Option 2 - Demonstrate when narrowing conversion is sometimes destructive to the original number
          narrowingConversionDemo.sometimesDestructiveNarrowingConversion();
          System.out.print("Enter any value to continue ==> ");
          scanner.next();
        } else if (userChoice == 3) {
          // Option 3 - Let user enter a number and see what happens based on what they enter
          long userNumber = narrowingConversionDemo.scanOrExit(scanner);
          narrowingConversionDemo.logLongValueUsed(userNumber);
          narrowingConversionDemo.logLongToIntNarrowingConversionMessage(userNumber);
          narrowingConversionDemo.logLongToShortNarrowingConversionMessage(userNumber);
          narrowingConversionDemo.logLongToByteNarrowingConversionMessage(userNumber);
          System.out.print("Enter any value to continue ==> ");
          scanner.next();
        } else if (userChoice == 0) {
          System.out.println("Exiting " + NarrowingConversionDemo.class.getSimpleName() + "...");
        } else {
          logger.log(LOG_ERROR, "%d is not one of the options. Program terminated.", userChoice);
          System.exit(1);
        }
      } else {
        logger.log(LOG_ERROR, String.format("%s is not a valid choice. Program terminated.", scanner.next()));
        System.exit(1);
      }
    }
  }

  private long scanOrExit(final Scanner scanner) {
    long retVal;
    // Use the specified Scanner to read from the keyboard
    System.out.print("Please enter a number of your choice (-9223372036854775808 to 9223372036854775807) ==> ");
    // Value must be a long, or throw a RuntimeException if not a long
    if (scanner.hasNextLong()) {
      retVal = scanner.nextLong();
    } else {
      String message = String.format("%s is not a valid choice. Program terminated.", scanner.next());
      logger.log(LOG_ERROR, message);
      throw new RuntimeException(message);
    }
    return retVal;
  }

  private void alwaysDestructiveNarrowingConversion() {
    // Literal assignments, use decimal value 6,148,933,456,521,300,121.
    long longValue = 0x5555_6666_7777_8899L;
    logLongValueUsed(longValue);

    // Cast the integer value to a int - this is a narrowing conversion
    logLongToIntNarrowingConversionMessage(longValue);
    // Cast the integer value to a short - this is a narrowing conversion
    logLongToShortNarrowingConversionMessage(longValue);
    // Cast the integer value to a byte - this is a narrowing conversion
    logLongToByteNarrowingConversionMessage(longValue);
  }

  private void sometimesDestructiveNarrowingConversion() {
    // Literal assignments, use decimal value 17,900,168
    long longValue = 0x0111_2288L;
    logLongValueUsed(longValue);

    // Cast the integer value to a int - this is a narrowing conversion
    logLongToIntNarrowingConversionMessage(longValue);
    // Cast the integer value to a short - this is a narrowing conversion
    logLongToShortNarrowingConversionMessage(longValue);
    // Cast the integer value to a byte - this is a narrowing conversion
    logLongToByteNarrowingConversionMessage(longValue);
  }

  private void logLongValueUsed(final long longValue) {
    String binaryString = String.format("%64s", Long.toBinaryString(longValue)).replace(' ', '0');
    String message = String.format("long : %25s: %d\n%25s: 0x%016X\n%25s: %s",
      "Value used (decimal)", longValue, "(hexadecimal)", longValue, "(64 bit binary)", binaryString);
    System.out.println(message);
  }

  private void logLongToIntNarrowingConversionMessage(final long longValue) {
    String binaryString = String.format("%64s", Long.toBinaryString(longValue)).replace(' ', '0').substring(32);
    String message = String.format("int  : %25s: %d\n%25s: 0x%08X\n%25s: %s",
      "Value used (decimal)", (int)longValue, "(hexadecimal)", (int)longValue, "(32 bit binary)", binaryString);
    System.out.println(message);
  }

  private void logLongToShortNarrowingConversionMessage(final long longValue) {
    String binaryString = String.format("%64s", Long.toBinaryString(longValue)).replace(' ', '0').substring(48);
    String message = String.format("short: %25s: %d\n%25s: 0x%04X\n%25s: %s",
      "Value used (decimal)", (short)longValue, "(hexadecimal)", (short)longValue, "(16 bit binary)", binaryString);
    System.out.println(message);
  }

  private void logLongToByteNarrowingConversionMessage(final long longValue) {
    String binaryString = String.format("%64s", Long.toBinaryString(longValue)).replace(' ', '0').substring(56);
    String message = String.format("byte : %25s: %d\n%25s: 0x%02X\n%25s: %s",
      "Value used (decimal)", (byte)longValue, "(hexadecimal)", (byte)longValue, "(8 bit binary)", binaryString);
    System.out.println(message);
  }
}
