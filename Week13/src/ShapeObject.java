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
    public void display(){
        System.out.printf("%s %10d %10s %s %s \n",this.getClass().getSimpleName(), this.getId(), this.getPoint().getX(), this.getPoint().getY() ,this.getArea());

    }

    //Area
    public abstract double getArea();


}
