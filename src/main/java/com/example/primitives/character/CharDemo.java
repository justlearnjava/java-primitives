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

package com.example.primitives.character;

import java.util.Scanner;

public class CharDemo {
  // Class-level variables for demonstrating default values
  char charValue;

  public void doDemo(final Scanner scanner) {
    demonstrate();
    System.out.print("Enter any value to return to the previous menu ==> ");
    scanner.next();
  }

  private void demonstrate() {
    System.out.println("*********** CHARACTER DEMO ***********");
    System.out.printf("\tDefault value of class member: '%c' (0x%04X) %n", charValue, (short)charValue);
    System.out.println("\tA char is 16 bits in length.");
    System.out.println("\tMinimum value:");
    System.out.printf("\t\t(character)  : '%c'%n", Character.MIN_VALUE);
    System.out.printf("\t\t(decimal)    : %d%n", (short)Character.MIN_VALUE);
    System.out.printf("\t\t(hexadecimal): 0x%04X%n", (short)Character.MIN_VALUE);
    System.out.printf("\t\t(binary)     : %s%n", formatBinaryString((short)Character.MIN_VALUE));
    System.out.println("\tMaximum value:");
    System.out.printf("\t\t(character)  : '%c'%n", Character.MAX_VALUE);
    System.out.printf("\t\t(decimal)    : %d%n", (short)Character.MAX_VALUE);
    System.out.printf("\t\t(hexadecimal): 0x%04X%n", (short)Character.MAX_VALUE);
    System.out.printf("\t\t(binary)     : %s%n", formatBinaryString((short)Character.MAX_VALUE));
  }

  private String formatBinaryString(long value) {
    return String.format("%64s", Long.toBinaryString(value)).replace(' ', '0').substring(48);
  }

}
