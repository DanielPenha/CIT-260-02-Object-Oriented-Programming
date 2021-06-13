/**Write a short Java program that implements your Rectangle class, and a main() method
 * that does the following:

 Tells the user what the program does.
 Creates two Rectangle objects, the first with a height of 4 and a width of 40, the second with a
 height of 3.5 and a width of 5.
 Call the methods in your Rectangle class to output the width, height, area, and perimeter
 of each rectangle, with 2 digits after the decimal point.
 Output a goodbye message.

 CIT 260 - 02
 Author@ Daniel Penha
 */
public class Rectangle {
    //Attributes
    //1) Two data fields named width and height, that specify the width and height of the rectangle.
    // The default values for both width and height should be 1.
    private double width = 1;
    private double height = 1;

    //GETTERS & SETTERS

    //Constructor
    //2) A no-arg constructor that creates a default rectangle object.
    public Rectangle(){

    }

    //3)A parameterized constructor that creates a rectangle object with the
    // specified height and width.
    public Rectangle (double height , double width ){
        this.height = height;
        this.width = width;
    }

    //4) Getter and setter methods for height and width.
    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

     //Methods
    //5) A method named getArea( ) that computes and returns the area of the rectangle.
    //>>7)Your file should have the proper file prologue (comments) and
     // each method should have the proper method prologue (comments).
    /**
     * Returns the area of a rectangle
     * @return area
     */
    public double getArea(){
        return this.width * this.height;
    }

    //6) A method names getPerimeter( ) that computes and returns the perimeter of the rectangle.
    /**
     * Returns the perimeter of a rectangle
     * @return perimeter
     */
    public double getPerimeter(){
        return 2 * (this.height + this.width);
    }

}
