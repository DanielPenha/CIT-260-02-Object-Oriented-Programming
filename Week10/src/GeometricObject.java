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

public class GeometricObject {

    //Attributes
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;


    //Constructor
    /** Construct a default geometric object */
    public GeometricObject(){
        dateCreated = new  java.util.Date();
    }
    /** Construct a geometric object with the specified color and filled value */
    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    //GETTERS & SETTERS
    /**Return color*/
    public String getColor(){
        return color;
    }
    /**Set a new color*/
    public void setColor(String color){
        this.color = color;
    }

    /** Return filled. Since filled is boolean, its getter method is named isFilled */
    public boolean isFilled(){
        return filled;
    }

    /**Set a new filled*/
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    //Methods
    /** Return a string representation of this object */
    public String toString(){
        return "created on" + dateCreated + "\ncolor: " + " and filled: " + filled;
    }


}
