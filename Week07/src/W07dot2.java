import java.util.Arrays;

/**W07 Assignment: Program 7.2
 Consider the following table of timecard data for a set of hourly workers:

 Name	Sun	Mon	Tue	Wed	Thu	Fri	Sat
 Tara Teamlead	0.0	8.0	8.0	8.5	8.0	9.0	0.0
 Harry Hacker	0.0	9.0	9.0	8.5	8.0	7.5	0.0
 Carl Coder	0.0	8.5	8.0	8.6	8.6	9.5	2.0
 Paula Programmer	0.0	4.75	6.0	6.25	6.5	0.0	0.0
 Darrin Debugger	0.0	0.0	0.0	0.0	5.25	5.25	6.0
 Write a short Java program that does the following:

 Tells the user what the program does. Note that no user input is required for this program.
 Creates a one-dimensional array of Strings and stores the employee names from the above table in that array.
 Creates a two-dimensional array and stores the hourly data from the table above in that array.
 Adds up the number of hours for each employee and stores the results in a one-dimensional array.
 Displays the names and hours worked for that week as shown in the example below.
 Displays a goodbye message.
 Your output should look like the following:

 This Program computes the number of hours worked for a set of hourly employees.

 Employee Name        Total Hours
 Tara Teamlead        41.50
 Harry Hacker         42.00
 Carl Coder           45.20
 Paula Programmer     23.50
 Darrin Debugger      16.50

 Goodbye
 Extra Credit (5 points)

 Sort the array that contains the total hours for each employee from the highest number of hours to the lowest. You must use a selection sort to do this (see listing 7.8 in the textbook).  Then display the output so that it looks like the following (hint: you have to sort the names as you sort the number of hours):

 This Program computes the number of hours worked for a set of hourly employees.

 Employee Name       Total Hours
 Carl Coder          45.20
 Harry Hacker        42.00
 Tara Teamlead       41.50
 Paula Programmer    23.50
 Darrin Debugger     16.50

 Goodbye

 CIT 260 - 02
 Author@ Daniel Penha

 */

public class W07dot2 {
    public static void main(String[] args) {
        //1) Tells the user what the program does. Note that no user input is required for this program.
        System.out.println("This Program computes the number of hours worked for a set of hourly employees.\n");
        //2) Creates a one-dimensional array of Strings and stores the employee names from the above table in that array.
       String[] employeeNames = { "Tara Teamlead" , "Harry Hacker" , "Carl Coder" , "Paula Programmer" , "Darrin Debugger"};

        //3) Creates a two-dimensional array and stores the hourly data from the table above in that array.
        double[][] hourly  = {
                {0.0 , 8.0 , 8.0 , 8.5 , 8.0 , 9.0 , 0.0},
                {0.0 , 9.0 , 9.0 , 8.5 , 8.0 , 7.5 , 0.0},
                {0.0 , 8.5 , 8.0 , 8.6 , 8.6 , 9.5 , 2.0},
                {0.0 , 4.75 , 6.0 , 6.25 , 6.5 , 0.0 , 0.0},
                {0.0 , 0.0 , 0.0 , 0.0 , 5.25 , 5.25 , 6.0},
        };
        //4) Adds up the number of hours for each employee and stores the results in a one-dimensional array.
        //https://stackoverflow.com/questions/67799104/how-do-i-get-the-sums-of-the-rows-of-a-2d-array-relative-to-the-elements-of-a-1d
        //5) Displays the names and hours worked for that week as shown in the example below.
        System.out.printf("%-18s      %10s\n", "Employee Name", "Total Hours");
        for (int i = 0 ; i < employeeNames.length ; i++){
            //System.out.println(employeeNames[i]);
            System.out.printf("%-18s      %-10.2f",employeeNames[i], Arrays.stream(hourly[i]).sum());
            System.out.println();
        }

        //6) Displays a goodbye message.
        System.out.println("\nGoodbye");
    }
}
