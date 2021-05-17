/*W04 Assignment: Program 4.1
Write a short Java program that does the following:

Tells the user what the program does.
Prompts the user to enter a single hexadecimal digit.
Gets the user's input and saves it. If the value is not a valid hexadecimal digit tell the user and terminate the program.
Converts the hexadecimal digit into a four digit binary number. You may not use any of the conversion methods built into Java, such as toBinaryString( ), to do this.
Outputs the four digit binary number, including any leading zeros.
Outputs a goodbye message.

***********
Here are some examples of what your program should look like when it runs (user input is in green):
***********
   This program converts a hexadecimal digit into a four digit binary number.
   Enter a hexadecimal number: B

   The binary value is 1011.
   Goodbye.
------------
 This program converts a hexadecimal digit into a four digit binary number.
   Enter a hexadecimal number: G

   G is not a valid hexadecimal digit.
   Goodbye.
-------------
    Research  material font:
    On step 3) https://www.youtube.com/watch?v=wjcP_iTXyuY & textbook
    Example: https://www.w3resource.com/java-exercises/basic/java-basic-exercise-29.php

CIT 260 - 02
Author@ Daniel Penha

*/

import java.util.Scanner;

public class W04dot1 {
    public static void main(String[] args) {
        // String bass to get the decimal
        String chars = "0123456789ABCDEF";

        //1) Tells the user what the program does.
        System.out.println("This program converts a hexadecimal digit into a four digit binary number.");
        //2) Prompts the user to enter a single hexadecimal digit.
        System.out.println("Enter a hexadecimal number:");

        //3) Gets the user's input and saves it. If the value is not a valid hexadecimal digit tell the user and terminate the program.
        Scanner input = new Scanner(System.in);
        //Verify the correct value

        // --> All value is Upper Case
        String value = input.next().toUpperCase();

        // Condition
        char valueHexadecimal = value.charAt(0);

        if (value.length()==1){

            boolean valid = false;
            if (valueHexadecimal >= 'A' && valueHexadecimal <= 'F')
                valid = true;

            if (valueHexadecimal >= '0' && valueHexadecimal <= '9')
                valid = true;

            if (valid == true) {
                // Transformar HexaDecimal em Decimal
                int hexToDecimal = chars.indexOf(valueHexadecimal);

                //4) Converts the hexadecimal digit into a four digit binary number. You may not use any of the conversion methods built into Java, such as toBinaryString( ), to do this.

                // Conversion -> //https://stackoverflow.com/questions/14784630/converting-decimal-to-binary-java
                String binaryToString = Integer.toString(hexToDecimal, 2);

                //5) Outputs the four digit binary number, including any leading zeros.
                // Condition Print
                binaryToString = String.format("%4s", binaryToString).replace(" ", "0");
                System.out.println("The binary value is: " + binaryToString);

            } else {
                System.out.println( valueHexadecimal + " Is not a valid hexadecimal digit.");
                System.out.println("Goodbye");
                System.exit(1);
            }

        } else {
            System.out.println( value + " Is not a valid hexadecimal digit.");
            System.out.println("Goodbye");
            System.exit(1);
        }
        //6) Outputs a goodbye message.
        System.out.println("Goodbye");
    }
}
