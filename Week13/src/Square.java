public class Square extends ShapeObject{
    //Attribute
    private double side;

    //Constructor
    //A no-arg constructor that initializes
    public Square(){
        super();
        this.side = side;
    }

    //A parameterized constructor that initializes Square using arguments
    // passed to the constructor.
    public Square( int id , double side){
        super(id);
        this.side = side;
    }

    //GETTERS & SETTERS

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Method
    /*The area of a square is the product of the length of its sides:
    area = a * a = a², where a is a square side
    https://www.omnicalculator.com/math/square
    */

    @Override
    public double getArea(){
        //return this.getSide() * this.getSide();
        return Math.pow( this.getSide() , 2 );
    }

}
