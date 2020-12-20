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

package com.example.primitives.bool;

import java.util.Scanner;

public class BooleanDemo {
  // Class-level variables for demonstrating default values
  boolean booleanValue;

  public void doDemo(final Scanner scanner) {
    demonstrate();
    System.out.print("Enter any value to return to the previous menu ==> ");
    scanner.next();
  }

  private void demonstrate() {
    System.out.println("*********** BOOLEAN DEMO ***********");
    System.out.printf("* \tDefault value of class member: %b%n", booleanValue);
    System.out.printf("* \tAllowable values: %b, %b%n", false, true);
  }
}
