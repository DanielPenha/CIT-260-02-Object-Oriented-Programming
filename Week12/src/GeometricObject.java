public abstract class GeometricObject {
    //Attribute
    private int id;

    //Constructor
    //A no-arg constructor that initializes the Shape
    public GeometricObject(){
        this.id = id;
    }

    //A parameterized constructor that initializes id using arguments
    //passed to the constructor.
    public GeometricObject(int id){
        this.id = id;
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

    // Method

    // Shape
    public void display(){
        System.out.printf("%-10d %10.2f %s \n", this.getId(), this.getArea() , "sq. inches");

    }

    //Area
    public abstract double getArea();

}
