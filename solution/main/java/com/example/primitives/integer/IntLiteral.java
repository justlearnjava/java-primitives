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

public class IntLiteral {
  public static void main(final String[] args) {
    // Declare int variable called intValue and assign it literal value of 200,000
    int intValue = 200_000;
    // Use System.out.println() to print value to the console
    System.out.println("int value is " + intValue);

    // Assign intValue the literal value of -200,000
    intValue = -200_000;
    // Use System.out.println() to print value to the console
    System.out.println("int value is " + intValue);

    // Assign intValue the literal value of 20,000,000,000 (BAD IDEA)
    intValue = (int)20_000_000_000L;
    // Use System.out.println() to print value to the console
    System.out.println("int value is " + intValue);
  }
}
