/**Write a short Java program that implements your Rectangle class, and a main() method that does the following:

 Tells the user what the program does.
 Creates two Rectangle objects, the first with a height of 4 and a width of 40, the second with a height of 3.5 and a width of 5.
 Call the methods in your Rectangle class to output the width, height, area, and perimeter of each rectangle, with 2 digits after the decimal point.
 Output a goodbye message.

 CIT 260 - 02
 Author@ Daniel Penha
 */
public class Rectangle {
    //Attributes
    private double width = 1;
    private double height = 1;

    //GETTERS & SETTERS

    //Constructor
    public Rectangle(){

    }

    public Rectangle (double height , double width ){
        this.height = height;
        this.width = width;
    }

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

    public double getArea(){

        return this.width * this.height;

    }

    public double getPerimeter(){

        return 2 * (this.height + this.width);

    }


}
