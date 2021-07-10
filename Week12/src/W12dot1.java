/*      Instructions
        In the last few assignments, you have been given very specific design details
        regarding the classes you were to develop for your programs. In this assignment,
        you will be told what the program must do, but it will be up to you to use the
        object oriented design concepts you have learned over the past few weeks to
        design the classes you will use in your program. You will be graded on how well
        your design uses the concepts of abstract classes, inheritance, and polymorphism.

        Your program must do the following:

        Tell the user what the program does.
        Create the following objects and store the references to them in a single ArrayList.
        A Circle object with a radius of 10 inches and an identifier of 156.
        A Square object with a side of 2 inches and an identifier of 237.
        A  Right Triangle with a height of 3 inches, a base of 4 inches and an identifier of 212.
        3. Iterate through the ArrayList and display the area of the three different
        shape objects you have created. Your output should look like this:
        CIT 260 - 02
        Author@ Daniel Penha*/

import java.util.ArrayList;

public class W12dot1 {
    public static void main(String[] args) {
        //1) Tell the user what the program does.
        System.out.println("This program creates a series of shapes then " +
                "shows their ID with their area.\n");

        //2) Create the following objects and store the references
        // to them in a single ArrayList.

        ArrayList<Shape> shapes = new ArrayList<>();

        //2.1) A Circle object with a radius of 10 inches and an identifier of 156.

        shapes.add(new Circle( 156 , 10 ) );

        //2.2) A Square object with a side of 2 inches and an identifier of 237.

        shapes.add(new Square( 237 , 2 ) );

        //2.3) A  Right Triangle with a height of 3 inches, a base of 4 inches
        // and an identifier of 212.

        shapes.add(new Triangle( 212 , 4 , 3 ) );
        Shape triangle1 = new Triangle( 666,4,3 );

        //3) Iterate through the ArrayList and display the area of the three different shape
        // objects you have created. Your output should look like this:

        System.out.println("Identifier \tArea");
        for (Shape shape : shapes){
            shape.display();
        }

        //4) Display a goodbye message.
        System.out.println("Goodbye ...");
    }
}
