/*  W03 Assignment: Program 3.1
    Write a short Java program that does the following:

    Tells the user what the program does.
    Prompts the user to enter a value for today's day of the week (0 for Sunday, 1, for Monday, etc. ).
    Gets the user's input and saves it. If the value is less than 0 or greater than 6, tell the user the input is invalid, and terminate the program.
    Prompts the user to enter some number of days in the future. This can be any positive value.
    Gets the user's input and saves it. If the value is negative, tell the user the input is invalid and terminate the program.
    Calculates the day of the week for the future day.
    Displays the day of the week for today and the day of the week for the future day.
    Outputs a goodbye message.
    ******************************************************************
    Here are some examples of what your program should look like when it runs (user input is in green):
    -------------------------------------------------------------------
    Given today's day of the week and some number of days in the future
    this program will tell you the day of the week for the future day.
    Enter today's day of the week (0 for Sunday, 1 for Monday, etc): 1
    Enter the number of days in the future: 15

    Today is Monday and the future day is Tuesday.
    Goodbye.
    -------------------------------------------------------------------
    Given today's day of the week and some number of days in the future
    this program will tell you the day of the week for the future day.
    Enter today's day of the week (0 for Sunday, 1 for Monday, etc): 1
    Enter the number of days in the future: -5

    -5 is invalid. You must enter a positive number.
    Goodbye.

    CIT 260 - 02
    Author@ Daniel Penha
 */

import java.util.Scanner;

public class W03dot1 {
    public static void main(String[] args) {
        //1) Tells the user what the program does.
        System.out.println("Given today's day of the week and some number of days in the future \n this program will tell you the day of the week for the future day. " +
                "\n Example: Day of the week 0 for Sunday, 1, for Monday, etc.");

        //2) Prompts the user to enter a value for today's day of the week (0 for Sunday, 1, for Monday, etc. ).
        System.out.println("Enter today's day of the week (0 for Sunday, 1 for Monday, etc):");

        //3) Gets the user's input and saves it. If the value is less than 0 or greater than 6, tell the user the input is invalid, and terminate the program.
        Scanner input = new Scanner(System.in);
        int dayOfTheWeek = input.nextInt();

        //**************Condition
        if (dayOfTheWeek < 0 || dayOfTheWeek > 6){
            System.out.println( dayOfTheWeek + " You must enter a number between 0 and 6, \n where 0 is Sunday and 6 is Saturday");
            System.exit(1);
        }

        //4) Prompts the user to enter some number of days in the future. This can be any positive value.
        System.out.println("Enter the number of days in the future:");

        //5) Gets the user's input and saves it. If the value is negative, tell the user the input is invalid and terminate the program.
        int daysInTheFuture = input.nextInt();

        //**************Condition
        if (daysInTheFuture < 0){
            System.out.println( daysInTheFuture + " is invalid. You must enter a positive number.");
            System.exit(1);
        }

        //6) Calculates the day of the week for the future day.
        int futureDay;

        //*************Condition
        if ( daysInTheFuture + dayOfTheWeek < 7 ){
            futureDay = daysInTheFuture + dayOfTheWeek;
        }
        else {
            futureDay = (daysInTheFuture + dayOfTheWeek) % 7;
        }

        //************ Day of the Week for the week and for the future
        String today, dayOfFuture;
        switch (dayOfTheWeek){
            case 0:
                today = "Sunday";
                break;
            case 1:
                today= "Monday";
                break;
            case 2:
                today= "Tuesday";
                break;
            case 3:
                today= "Wednesday";
                break;
            case 4:
                today= "Thursday";
                break;
            case 5:
                today= "Friday";
                break;
            case 6:
                today= "Saturday";
                break;
            default:
                today = "Invalid!";

        }
        switch (futureDay){
            case 0:
                dayOfFuture = "Sunday";
                break;
            case 1:
                dayOfFuture  = "Monday";
                break;
            case 2:
                dayOfFuture = "Tuesday";
                break;
            case 3:
                dayOfFuture= "Wednesday";
                break;
            case 4:
                dayOfFuture= "Thursday";
                break;
            case 5:
                dayOfFuture= "Friday";
                break;
            case 6:
                dayOfFuture= "Saturday";
                break;
            default:
                dayOfFuture = "Invalid!";
        }

        //7) Displays the day of the week for today and the day of the week for the future day.
        //-- test 1 : System.out.println("Today is " + dayOfTheWeek + " and the future day is " + daysInTheFuture);
        //-- test 2: System.out.printf("Today is %s and %s days into the future is %s." , today, daysInTheFuture, dayOfFuture  );
        System.out.println("Today is " + today +" and " + daysInTheFuture + " days into the future  is " + dayOfFuture );

        //8) Outputs a goodbye message.
        System.out.println("Goodbye");
    }
}
