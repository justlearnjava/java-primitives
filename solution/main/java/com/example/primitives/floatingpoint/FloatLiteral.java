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

public class FloatLiteral {
  public static void main(final String[] args) {
    // Declare float variable called floatValue and assign it literal value of 234,567
    float floatValue = 2.34567e5f;
    // Use System.out.println() to print value to the console
    System.out.println("float value is " + floatValue);

    // Assign floatValue the literal value of -234,567
    floatValue = -2.34567e5f;
    // Use System.out.println() to print value to the console
    System.out.println("float value is " + floatValue);

    // Assign floatValue the literal value of 2.34567 x 10^40 (BAD IDEA)
    floatValue = (float)2.34567e40;
    // Use System.out.println() to print value to the console
    System.out.println("float value is " + floatValue);
  }
}
