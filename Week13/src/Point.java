public class Point {
    //Attributes
    private double x;
    private double y;


    //2) Getter and setter methods for x and y.
    // GETTERS & SETTERS

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //3) A no-arg constructor that creates a default point at (0,0).
    // Constructor
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    //4) A parameterized constructor that creates a point at the designated x and y coordinate.
    public Point( double x , double y){
        this.x = x;
        this.y = y;
    }
}
