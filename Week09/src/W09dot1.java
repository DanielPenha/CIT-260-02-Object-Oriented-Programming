/**Objectives
 This assignment will give students practice in the following:

 Reading data from and writing data to the Console
 Using primitive data types and operators
 Using selection statements in a Java program
 Using Characters, Strings, and Mathematical operations
 Using Methods
 Designing and creating your own classes
 Overview
 Task: Complete the programming exercise.
 Instructor: Grades and provides feedback.
 Instructions
 Design a class named MyPoint that represents a point in 2-dimensional space. Your
 class should contain the following:

 Two data fields x and y, that represent the x-coordinate and the y-coordinate of the point.
 Getter and setter methods for x and y.
 A no-arg constructor that creates a default point at (0,0).
 A parameterized constructor that creates a point at the designated x and y coordinate.
 A member method named distance that calculates and returns the distance between this MyPoint
 object and another point that is specified by its x- and y-coordinates. The method header looks like this:
 public double distance(int xCoord, int yCoord);

 A member method named distance that calculates and returns the distance between this MyPoint object and
 another object of the MyPoint class. The method header looks like this:
 public double distance(MyPoint p)

 A static method named distance that takes two objects of the MyPoint class as parameters, and calculates
 and returns the distance between the two of them. The method header looks like this:
 public static double distance (MyPoint mp1, MyPoint mp2)

 Create a UML diagram that documents your class design Submit your class diagram with your assignment. The preferred
 format is a .PDF file.
 In a separate file, write the code for your MyPoint class and a main( ) method that does the following:

 Tells the user what the program does.
 Uses the no-arg constructor to create a MyPoint object p1 at (0,0).
 Prompts the user to enter the x and y coordinates of a point.
 Saves the users input.
 Uses the first distance method to calculate and display the distance between the MyPoint object p1 and the
 point at the x and y coordinates entered by the user. The distance is displayed with two digits after the
 decimal point.
 Uses the parameterized constructor to create a MyPoint object p2 using the x-coordinate and the y-coordinate
 entered  by the user.
 Uses the second and third distance methods to calculate and display the distance between the MyPoint object p1
 and the MyPoint object p2.  The distance is displayed with two digits after the decimal point.
 Displays a goodbye message.
 The example below show what your program should look like when it runs (user input is in green).

 This program creates a point at (0,0) and a point at the coordinates
 entered by you. It then computes and displays the distance from (0,0)
 to the point defined by you, using three different methods.
 Enter the x coordinate of a point: 3
 Enter the y coordinate of a point: 4
 Using method 1, the distance from (0,0) to (3,4) is 5.00
 Using method 2, the distance from (0,0) to (3,4) is 5.00
 Using method 3, the distance from (0,0) to (3,4) is 5.00
 Goodbye...
 Using IntelliJ, create a new Java project for the program. Compile and test your code. When
 you are satisfied that your program works correctly, place the complete project folder for the
 program into a zip file.  Add the UML file to the .zip file.

 Submit the .zip file here on Canvas by the due date.

 CIT 260 - 02
 Author@ Daniel Penha
 */
import java.util.Scanner;

public class W09dot1 {
    public static void main(String[] args) {
        //1) Tells the user what the program does.
        System.out.println("This program creates a point at (0,0) and a point at the coordinates \n" +
        "entered by you. It then computes and displays the distance from (0,0)\n" +
        "to the point defined by you, using three different methods.");

        //2) Uses the no-arg constructor to create a MyPoint object p1 at (0,0).
        Scanner input = new Scanner(System.in);

        //3) Prompts the user to enter the x and y coordinates of a point.
        System.out.println("Enter the x coordinate of a point: ");

        //4) Saves the users input.
        int xcoord = input.nextInt();

        //3) Prompts the user to enter the x and y coordinates of a point.
        System.out.println("Enter the y coordinate of a point:");

        //4 Saves the users input.
        int ycoord = input.nextInt();

        //5) Uses the first distance method to calculate and display the distance between
        // the MyPoint object p1 and the point at the x and y coordinates entered by the user.
        // The distance is displayed with two digits after the decimal point.
        MyPoint p1 = new MyPoint();

        MyPoint p2 = new MyPoint(xcoord , ycoord);

        System.out.printf("Using method 1, the distance from (%s , %s) to (%s , %s) is %.2f" , p1.getX() , p1.getY() , p2.getX() , p2.getY() , p2.distance(p1.getX() , p1.getY()));

        System.out.printf("Using method 2, the distance from (%s , %s) to (%s , %s) is %.2f" , p1.getX() , p1.getY() , p2.getX() , p2.getY() , p2.distance(p1));

        System.out.printf("Using method 3, the distance from (%s , %s) to (%s , %s) is %.2f" , p1.getX() , p1.getY() , p2.getX() , p2.getY() , MyPoint.distance(p1 , p2));

        System.out.println("Goodbye...");

    }
}
