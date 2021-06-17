/**Design a class named MyPoint that represents a point in 2-dimensional space. Your
 * class should contain the following:

 Two data fields x and y, that represent the x-coordinate and the y-coordinate of the point.
 Getter and setter methods for x and y.
 A no-arg constructor that creates a default point at (0,0).
 A parameterized constructor that creates a point at the designated x and y coordinate.
 A member method named distance that calculates and returns the distance between this
 MyPoint object and another
 point that is specified by its x- and y-coordinates. The method header looks like this:
 public double distance(int xCoord, int yCoord);

 A member method named distance that calculates and returns the distance between this
 MyPoint object and another object of the MyPoint class. The method header looks like this:
 public double distance(MyPoint p)

 A static method named distance that takes two objects of the MyPoint class as parameters,
 and calculates and returns the distance between the two of them. The method header looks like this:
 public static double distance (MyPoint mp1, MyPoint mp2)

 Create a UML diagram that documents your class design Submit your class diagram with
 your assignment.
 The preferred format is a .PDF file.

 CIT 260 - 02
 Author@ Daniel Penha
 */

public class MyPoint {
    //1) Two data fields x and y, that represent the x-coordinate and
    // the y-coordinate of the point.

    //Attributes
    private double x;
    private double y;


    //2) Getter and setter methods for x and y.
    // GETTERS & SETTERS

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //3) A no-arg constructor that creates a default point at (0,0).
    // Constructor
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    //4) A parameterized constructor that creates a point at the designated x and y coordinate.
    public MyPoint( double x , double y){
        this.x = x;
        this.y = y;
    }
    //5) A member method named distance that calculates and returns the distance
    // between this MyPoint object and another point that is specified
    // by its x- and y-coordinates. The method header looks like this:
    // Methods
    /**
     * Returns the distance between this MyPoint object and another point
     * @return distance
     */
    public double distance(int xCoord, int yCoord){
        return y - x;
    }

    //6) A member method named distance that calculates and returns the distance
    // between this MyPoint object and another object of the MyPoint class.
    // The method header looks like this:
    /**
     * Returns the distance between this MyPoint object and another point
     * @return distance
     */
    public double distance(MyPoint p){
        return y - x;
    }

    //7) A static method named distance that takes two objects of the MyPoint class
    // as parameters, and calculates and returns the distance between the two of them.
    // The method header looks like this:
    /**
     * Returns the distance between the two of them
     * @return distance
     */
    public static double distance (MyPoint mp1, MyPoint mp2){
        return mp2 - mp1;
    }
}
