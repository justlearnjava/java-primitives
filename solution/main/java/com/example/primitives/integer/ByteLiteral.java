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

public class ByteLiteral {
  public static void main(final String[] args) {
    // Declare byte variable called byteValue and assign it literal value of 100
    byte byteValue = 100;
    // Use System.out.println() to print value to the console
    System.out.println("byte value is " + byteValue);

    // Assign byteValue the literal value of -100
    byteValue = -100;
    // Use System.out.println() to print value to the console
    System.out.println("byte value is " + byteValue);

    // Assign byteValue the literal value of 200 (BAD IDEA)
    byteValue = (byte)200;
    // Use System.out.println() to print value to the console
    System.out.println("byte value is " + byteValue);
  }
}
