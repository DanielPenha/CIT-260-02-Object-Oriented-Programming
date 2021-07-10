public class Circle extends Shape {
    //Attribute
    private double radius;

    //Constructor
    public Circle( int id , double radius){
        super(id);
        this.radius = radius;
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
    public double getArea(){
        //return Math.PI * (this.getRadius() * this.getRadius());
        return Math.PI * Math.pow(this.getRadius(),2);
    }

}
