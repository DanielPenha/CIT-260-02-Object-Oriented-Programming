public abstract class ShapeObject {
    //Attribute
    private int id;
    private Point point;

    //Constructor
    //A no-arg constructor that initializes the Shape
    public ShapeObject(){
        this.id = 0;
    }

    //A parameterized constructor that initializes id using arguments
    //passed to the constructor.
    public ShapeObject(int id , Point point){
        this.id = id;
        this.point = point;
    }

    //GETTERS & SETTERS
    //Getter ID.

    public int getId() {
        return id;
    }

    //Setter ID
    public void setId(int id) {
        this.id = id;
    }

    //Getter Point
    public Point getPoint() {
        return point;
    }

    //Setter Point
    public void setPoint(Point point) {
        this.point = point;
    }

    // Method

    // Shape
    public boolean display(){
        System.out.printf("%-17s %d      (%s,%s) %10.2f \n",this.getClass().getSimpleName(), this.getId(), (int) this.getPoint().getX(), (int) this.getPoint().getY() ,this.getArea());

        return false;
    }

    public String toString(){
        return this.getClass().getSimpleName()+" "+this.getId()+" "+(int) this.getPoint().getX()+" "+(int) this.getPoint().getY()+" "+this.getArea();
    }

    //Area
    public abstract double getArea();


}
