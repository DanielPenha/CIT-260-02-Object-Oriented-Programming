public class RightTriangle extends ShapeObject{
    //Attribute
    private double base;
    private double height;

    //Constructor
    //A no-arg constructor that initializes
    public RightTriangle(){
        super();
        this.base = 0;
        this.height = 0;
    }

    //A parameterized constructor that initializes Triangle using arguments
    // passed to the constructor.
    public RightTriangle( int id, double base, double height, Point point){
        super();
        this.setId(id);
        this.base = base;
        this.height = height;
        this.setPoint(point);
    }

    //GETTERS & SETTERS
    // Base
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method
    /*A triangle is one of the most basic shapes in geometry.
    The best known and the simplest formula, which almost everybody
    remembers from school is:

    area = 0.5 * b * h, | or area = 1/2 * b * h | or area = b * h / 2

    where b is the length of the base of the triangle, and h is the
    height/altitude of the triangle.

    https://www.omnicalculator.com/math/triangle-area
    */
    @Override
    public double getArea(){
        return ( this.base * this.height ) / 2;
    }

}
