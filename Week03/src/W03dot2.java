/*  W03 Assignment: Program 3.2
    Write a short Java program that does the following:

    Tells the user what the program does.
    Prompts the user to enter a year.
    Gets the user's input and saves it.
    Prompts the user to enter a value for the month(1 = Jan, 2 = Feb, etc).
    Gets the user's input and saves it. If the value is not between 1 and 12 inclusive, tell the user and terminate the program.
    Calculates the number of days in that month. Your program should correctly handle leap years (see listing 3.7 in the textbook).
    Displays the number of days in that month.
    Outputs a goodbye message.

    *************************************************************************
    Here are some examples of what your program should look like when it runs (user input is in green):
    -------------------------------------------------------------------------
    Given a year and a month in that year, this program will tell you
    the number of days in that month.
    Enter a year: 1953
    Enter a value for the month(1 = Jan, 2 = Feb, etc): 3

    March of 1953 has 31 days in it.
    Goodbye.
    ------------------------------------------------------------------------
    Given a year and a month in that year, this program will tell you
    the number of days in that month.
    Enter a year: 2020
    Enter a value for the month(1 = Jan, 2 = Feb, etc): 13

    13 is invalid. Month values must be between between 1 and 12, inclusive.
    Goodbye.

    CIT 260 - 02
    Author@ Daniel Penha
*/

import java.util.Scanner;

public class W03dot2 {
    public static void main(String[] args) {
        //1) Tells the user what the program does.
        System.out.println("Given a year and a month in that year, this program will tell you \n the number of days in that month.");
        //2) Prompts the user to enter a year.
        System.out.println("Enter a year:");

        //3) Gets the user's input and saves it.
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        //4) Prompts the user to enter a value for the month(1 = Jan, 2 = Feb, etc).
        System.out.println("Enter a value for the month(1 = Jan, 2 = Feb, etc):");

        //5) Gets the user's input and saves it. If the value is not between 1 and 12 inclusive, tell the user and terminate the program.
        int month = input.nextInt();
        if ( month < 1 || month > 12){
            System.out.println( month + " is invalid. Month values must be between between 1 and 12, inclusive.");
            System.exit(1);
        }
        String monthName;
        switch (month){
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid";
        }

        //6) Calculates the number of days in that month. Your program should correctly handle leap years (see listing 3.7 in the textbook).
        // DAy
        int days = 0;

        //font: https://javatutoring.com/java-number-of-days-program/
        if ( month == 1 || month ==3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12 ){
            days = 31;
        }
        else if ( month == 4 || month == 6 || month == 9 || month == 11 ){
            days = 30;
        }
        else if ( month == 2 ){
            //*********** Lamp Year -- not sure how this work
            if ( year % 400 == 0 && year % 100 == 0){
                days = 29;
            }
            //*********** Lamp Year -- understand
            else if ( year % 4 == 0 && year % 100 != 0){
                days = 29;
            }
            //*********** Not Lamp Year -- understand
            else  days = 28;
        }

        // Textbook information about Leap Years
        //boolean isLeapYear = ( year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0 );

        //7) Displays the number of days in that month.

        System.out.println( monthName + " of " + year + " has " + days + " days in it.");
        // test Leap Year
        //System.out.println( "Is a Leap Year? " +  isLeapYear);

        //8) Outputs a goodbye message.
        System.out.println("Goodbye");
    }
}
