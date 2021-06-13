/**W08 Assignment: Program 8.1
 Using the example of the Circle class from section 9.2 of the textbook design a Rectangle class.
 Create a UML class diagram that shows your design. Your UML class diagram must be submitted as part of this assignment.
 The preferred format for you class diagram is a .PDF file. This week's Powerpoint slides describe how to create
 a UML class diagram. Your Rectangle class should contain the following:

 Two data fields named width and height, that specify the width and height of the rectangle. The default values
 for both width and height should be 1.
 A no-arg constructor that creates a default rectangle object.
 A parameterized constructor that creates a rectangle object with the specified height and width.
 Getter and setter methods for height and width.
 A method named getArea( ) that computes and returns the area of the rectangle.
 A method names getPerimeter( ) that computes and returns the perimeter of the rectangle.
 Your file should have the proper file prologue (comments) and each method should have the proper
 method prologue (comments).
 Then write a short Java program that implements your Rectangle class, and a main() method that does the following:

 Tells the user what the program does.
 Creates two Rectangle objects, the first with a height of 4 and a width of 40, the
 second with a height of 3.5 and a width of 5.
 Call the methods in your Rectangle class to output the width, height, area, and perimeter of each rectangle,
 with 2 digits after the decimal point.
 Output a goodbye message.
 The following example illustrates what your program should look like when it runs.

 This program creates two rectangle objects and displays their width, height, area and perimeter.

 Rectangle 1:
 height = 4.00
 width = 40.00
 area = 160.00
 perimeter = 88.00

 Rectangle 2:
 height = 3.50
 width = 5.00
 area = 17.50
 perimeter = 17.00

 goodbye ...

 * CIT 260 - 02
 * Author@ Daniel Penha*/

public class W08dot1 {
    public static void main(String[] args) {
        System.out.println("This program creates two rectangle objects and displays their width, " +
                "height, area and perimeter. \n");

        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 5);


        System.out.println("Rectangle 1:");
        System.out.printf("height: %.2f\n", rectangle1.getHeight());
        System.out.printf("width: %.2f\n", rectangle1.getPerimeter());
        System.out.printf("area: %.2f\n", rectangle1.getPerimeter());
        System.out.printf("perimeter: %.2f\n", rectangle1.getPerimeter());


        System.out.println("\nRectangle 2:");
               System.out.printf("height: %.2f\n", rectangle2.getHeight());
        System.out.printf("width: %.2f\n", rectangle2.getPerimeter());
        System.out.printf("area: %.2f\n", rectangle2.getPerimeter());
        System.out.printf("perimeter: %.2f\n", rectangle2.getPerimeter());

        System.out.println("\nGoodbye ... ");
    }
}
