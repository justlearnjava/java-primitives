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

public class DoubleLiteral {
  public static void main(final String[] args) {
    // Declare double variable called doubleValue and assign it literal value of 1.1234567890 x 10^150
    double doubleValue = 1.1234567890e150;
    // Use System.out.println() to print value to the console
    System.out.println("double value is " + doubleValue);

    // Assign doubleValue the literal value of -1.1234567890 x 10^150
    doubleValue = -1.1234567890e150;
    // Use System.out.println() to print value to the console
    System.out.println("double value is " + doubleValue);

    // Assign doubleValue the literal value of 1.234567890123456789 x 10^300
    doubleValue = 1.234_567_890_123_456_789e300;
    // Use System.out.println() to print value to the console
    System.out.println("double value is " + doubleValue);
  }
}
