/*Instructions
        Design a class named Triangle that extends the GeometricObject class given
        in Listing 11.1 in the textbook.

        Your Triangle class should contain the following:

        Three data fields side1, side2, and side3 that represent sides of a triangle.
        Getter and setter methods for side1, side2, and side3.
        A no-arg constructor that creates a default triangle with each side equal to 1.
        A parameterized constructor that creates a triangle with specified values for side1,
        side2, and side3, a color, and a filled attribute.
        A member method named getArea( ) that calculates and returns the area of the triangle.
        The formula to compute the area of a Triangle, given three sides is called Heron's formula.
        Heron's formula is described in problem 2.19 in the textbook.
        A member method named toString( ) that generates a String representation of the triangle
        object. This toString()  method must call GeometricObject's  toString() method to correctly
        display the String representation of the Triangle object.
        Create a UML diagram that documents your class design. Show both the GeometricObject class
        and the Triangle class in your diagram. Include your diagram when you submit your assignment.
        The preferred format is a .PDF file.
        Create a new project in IntelliJ and add the code for the GeometricObject class,
        your Triangle class and a driver class that contains your main( ) method. Your main( )
        method should...

        Tells the user what the program does.
        Prompts the user to enter the values for the sides, color, and filled attribute for a triangle
        object.
        Saves the users input.
        Using the values entered by the user, creates the Triangle object.
        Displays the string representation of the Triangle object by calling its toString( ) method.
        Look at the output example below to see what this output should look like.
        Displays a goodbye message.
        The example below show what your program should look like when it runs (user input is in green).

        CIT 260 - 02
        Author@ Daniel Penha

        */

public class Triangle extends GeometricObject{
    //1) Three data fields side1, side2, and side3 that represent sides of a triangle.

    //Attributes
    private double side1;
    private double side2;
    private double side3;

    //2) Getter and setter methods for side1, side2, and side3.

    //GETTERS & SETTERS
    //side1
    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    //side2
    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    //side3
    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    //3) A no-arg constructor that creates a default triangle with each side equal to 1.
    //Constructor
    public Triangle(){
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    //4) A parameterized constructor that creates a triangle with specified values
    // for side1, side2, and side3, a color, and a filled attribute.
    public Triangle(double side1 , double side2 , double side3 , String color , boolean filled ){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    //Methods

    //5) A member method named getArea( ) that calculates and returns the area of the triangle.
    // The formula to compute the area of a Triangle, given three sides is called Heron's formula.
    // Heron's formula is described in problem 2.19 in the textbook.
    public double getArea (){
        double s = ( side1 + side2 + side3 ) / 2;
        return Math.pow ( s * ( s - side1 ) * ( s - side2 ) * ( s - side3 ), 0.5);
    }

    //6) A member method named toString( ) that generates a String representation of
    // the triangle object.
    // This toString()  method must call GeometricObject's  toString() method to correctly display the
    // String representation of the Triangle object.
    public String toString(){
        return "Triangle Output: \n" +
                "side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + "\n"+
                "Created on " + getDateCreated() + "\n"+
                "color: " + super.getColor() + " and filled = " + super.isFilled() + "\n"+
                "Area = " + this.getArea() ;
    }

}
