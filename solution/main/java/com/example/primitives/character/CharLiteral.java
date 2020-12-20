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

public class CharLiteral {
  private static final System.Logger logger = System.getLogger(CharLiteral.class.getName());

  public static void main(final String[] args) {
    // Demonstrate literal assignment using Latin literals
    latinDemo();

    // Demonstrate literal assignement using Devanagari literals
    devanagariDemo();
  }

  private static void latinDemo() {
    // Declare char variable charValue and assign it the latin literal value 'a'
    char charValue = 'a';
    // Use logger to print value to the console
    logger.log(System.Logger.Level.INFO, "char value is " + charValue);

    // Assign charValue the unicode value for latin literal value 'J'
    char charJ = 'J';
    // Assign charValue the unicode value for latin literal value 'A'
    char charA = 'A';
    // Assign charValue the unicode value for latin literal value 'V'
    char charV = 'V';
    // http://www.unicode.org/charts/PDF/U0000.pdf - Refer to this document for the unicode values
    // Use logger to print value to the console
    logger.log(System.Logger.Level.INFO, "char values: " + charJ + charA + charV + charA);
  }

  private static void devanagariDemo() {
    // Declare char variable charValue and assign it the literal value 'अ'
    char charValue = 'अ';
    // Use logger to print value to the console
    logger.log(System.Logger.Level.INFO, "char value is " + charValue);

    // Assign charValue the unicode value for Devanagari 'ज'
    char charJ = '\u091c';
    // Assign charValue the unicode value for Devanagari 'आ'
    char charAa = '\u0906';
    // Assign charValue the unicode value for Devanagari 'व'
    char charV = '\u0935';
    // Assign charValue the unicode value for Devanagari 'अ'
    char charA = '\u0905';
      // http://www.unicode.org/charts/PDF/U0900.pdf - Refer to this document for the unicode values
    // Use logger to print value to the console
    logger.log(System.Logger.Level.INFO, "char values: " + charJ + charAa + charV + charA);
  }
}
