import java.util.Scanner;

/*Objectives
        This assignment will give students practice in the following:

        Reading data from and writing data to the Console
        Using primitive data types and operators
        Using selection statements in a Java program
        Using Characters, Strings, and Mathematical operations
        Using Methods
        Designing and creating your own classes that use inheritance
        Overview
        Task: Complete the programming exercise.
        Instructor: Grades and provides feedback.
        Instructions
        Design a class named Triangle that extends the GeometricObject class given in Listing 11.1 in the textbook.

        Your Triangle class should contain the following:

        Three data fields side1, side2, and side3 that represent sides of a triangle.
        Getter and setter methods for side1, side2, and side3.
        A no-arg constructor that creates a default triangle with each side equal to 1.
        A parameterized constructor that creates a triangle with specified values for side1, side2, and side3, a color, and a filled attribute.
        A member method named getArea( ) that calculates and returns the area of the triangle. The formula to compute the area of a Triangle, given three sides is called Heron's formula. Heron's formula is described in problem 2.19 in the textbook.
        A member method named toString( ) that generates a String representation of the triangle object. This toString()  method must call GeometricObject's  toString() method to correctly display the String representation of the Triangle object.
        Create a UML diagram that documents your class design. Show both the GeometricObject class and the Triangle class in your diagram. Include your diagram when you submit your assignment. The preferred format is a .PDF file.
        Create a new project in IntelliJ and add the code for the GeometricObject class, your Triangle class and a driver class that contains your main( ) method. Your main( ) method should

        Tells the user what the program does.
        Prompts the user to enter the values for the sides, color, and filled attribute for a triangle object.
        Saves the users input.
        Using the values entered by the user, creates the Triangle object.
        Displays the string representation of the Triangle object by calling its toString( ) method. Look at the output example below to see what this output should look like.
        Displays a goodbye message.
        The example below show what your program should look like when it runs (user input is in green).

        This program gets input for a triangle from the user.
        It then creates a Triangle object and displays its description.

        Enter the color of the triangle (e.g. "red"):
        red
        Is the triangle filled (y or n):
        y
        Enter the non-zero, positive lengths of the three sides of the triangle:
        3 4 5

        Triangle Output:
        side1 = 3.0, side2 = 4.0, side 3 = 5.0
        created on Wed May 22 07:34:11 MDT 2019
        color: red and filled = true
        Area = 6.00


        Compile and test your code. When you are satisfied that your program works correctly, place the complete project folder for the
        program into a zip file.  Add the UML file to the .zip file.

        Submit the .zip file here on Canvas by the due date.

        CIT 260 - 02
        Author@ Daniel Penha
        */
public class W10dot1 {
    public static void main(String[] args) {
        //1) Tells the user what the program does.
        System.out.println("This program gets input for a triangle from the user.\n" +
                "It then creates a Triangle object and displays its description.\n");

        Scanner input = new Scanner(System.in);
        //2) Prompts the user to enter the values for the sides,
        // color, and filled attribute for a triangle object.

        System.out.println("Enter the color of the triangle (e.g. \"red\"):");

        //3) Saves the users input.
        String color = input.nextLine();

        System.out.println("Is the triangle filled (y or n):");

        //3) Saves the users input.
        String filled = input.nextLine();


        System.out.println("Enter the non-zero, positive lengths of the three sides of the triangle: ");

        //3) Saves the users input.
        double length = input.nextDouble();


        //4) Using the values entered by the user, creates the Triangle object.

        //5) Displays the string representation of the Triangle object by calling its
        // toString( ) method.
        // Look at the output example below to see what this output should look like.


        //6) Displays a goodbye message.
        System.out.println("Goodbye...");

    }
}
