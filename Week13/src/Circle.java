public class Circle extends ShapeObject{
    //Attribute
    private double radius;

    //Constructor
    //A no-arg constructor that initializes
    public Circle(){
        super();
        this.radius = 0;

    }
    //A parameterized constructor that initializes circle using arguments
    // passed to the constructor.
    public Circle( int id , double radius , Point point) {
        super();
        this.setId(id);
        this.radius = radius;
        this.setPoint(point);
    }

    //GETTERS & SETTERS

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method

    //A similarly simple formula determines the relationship
    // between the area of a circle and its radius:
    //A = π * R²
    //https://www.omnicalculator.com/math/circumference

    // Area of a Circle
    @Override
    public double getArea(){
        //return Math.PI * (this.getRadius() * this.getRadius());
        return Math.PI * Math.pow(this.getRadius(),2);
    }

}
