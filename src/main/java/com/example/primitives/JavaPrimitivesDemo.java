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

package com.example.primitives;

import com.example.primitives.bool.BooleanDemo;
import com.example.primitives.character.CharDemo;
import com.example.primitives.floatingpoint.FloatingPointNumbersDemo;
import com.example.primitives.integer.IntegerNumberDemo;

import java.util.Scanner;

public class JavaPrimitivesDemo {
  public static void main(final String[] args) {
    // Create a Scanner instance
    Scanner scanner = new Scanner(System.in);

    byte userChoice = -1;
    while (userChoice != 0) {
      // Prompt the user for the primitive category they want to learn about
      displayMainMenu();

      // The menu is small, so byte is used, any other input is not allowed
      if (scanner.hasNextByte()) {
        // Process the user's choice
        userChoice = scanner.nextByte();
        processUserChoice(scanner, userChoice);
      } else {
        // Invalid input, display error message
        invalidInput(scanner.next());
      }
    }
  }

  /**
   * Display the main menu
   */
  private static void displayMainMenu() {
    System.out.println("**********************************************************************************************************");
    System.out.println("Please enter the Java(TM) language primitive category you want to learn more about (1-4, enter 0 to quit):");
    System.out.println("1 - Booleans");
    System.out.println("2 - Characters");
    System.out.println("3 - Floating Point Numbers");
    System.out.println("4 - Integer Numbers");
    System.out.print("(enter 0 quit) ==> ");
  }

  /**
   * The user entered an invalid menu item, so display an error
   * message that contains the invalid input.
   *
   * @param next - the invalid input
   */
  private static void invalidInput(final String next) {
    System.out.printf("Invalid input ('%s'). Please try again (enter 0 to quit).%n", next);
  }

  /**
   * Process the user's choice or display an error if it not an allowed choice.
   * @param scanner - needed by Demo classes
   * @param userChoice - the user's choice
   */
  private static void processUserChoice(final Scanner scanner, final byte userChoice) {
    if (userChoice == 1) {
      BooleanDemo booleanDemo = new BooleanDemo();
      booleanDemo.doDemo(scanner);
    } else if (userChoice == 2) {
      CharDemo characterDemo = new CharDemo();
      characterDemo.doDemo(scanner);
    } else if (userChoice == 3) {
      FloatingPointNumbersDemo floatingPointNumbersDemo = new FloatingPointNumbersDemo();
      floatingPointNumbersDemo.doDemo(scanner);
    } else if (userChoice == 4) {
      IntegerNumberDemo integerNumberDemo = new IntegerNumberDemo();
      integerNumberDemo.doDemo(scanner);
    } else if (userChoice == 0) {
      System.out.println("Exiting " + JavaPrimitivesDemo.class.getSimpleName() + "...");
    } else {
      invalidInput(userChoice);
    }
  }

  /**
   * The user entered an invalid choice. Display an error message,
   * along with the invalid choice.
   *
   * @param next - the invalid choice.
   */
  private static void invalidInput(final byte next) {
    System.out.printf("Invalid input (%d). Please try again (enter 0 to quit).%n", next);
  }

}
