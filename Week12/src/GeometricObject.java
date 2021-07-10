public abstract class GeometricObject {
    //Attribute
    private int id;

    //Constructor
    //A no-arg constructor that initializes the Shape
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
        System.out.printf("%d %14.2f sq. inches\n", this.getId(), this.getArea());

    }

    //Area
    public abstract double getArea();

}
