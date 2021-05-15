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
CIT 260 - 02
Author@ Daniel Penha

*/

import java.util.Scanner;

public class W04dot1 {
    public static void main(String[] args) {
        //1) Tells the user what the program does.
        System.out.println("This program converts a hexadecimal digit into a four digit binary number.");
        //2) Prompts the user to enter a single hexadecimal digit.
        System.out.println("Enter a hexadecimal number:");

        //3) Gets the user's input and saves it. If the value is not a valid hexadecimal digit tell the user and terminate the program.
        Scanner input = new Scanner(System.in);
        //Verify the correct value
        int valueHexadecimal = input.nextInt();
        // Condition
        //-- if ( valueHexadecimal != ?){???
        // System.exit(1);
        // }


        //4) Converts the hexadecimal digit into a four digit binary number. You may not use any of the conversion methods built into Java, such as toBinaryString( ), to do this.
        // Conversion

        //5) Outputs the four digit binary number, including any leading zeros.
        // Condition Print
        // -- if (valueHexadecimal){}

        //6) Outputs a goodbye message.
        System.out.println("Goodbye");
    }
}
