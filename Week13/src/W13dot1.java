/*For this assignment you will start with the program that you wrote for week 12. Your shape objects will be positioned at a point in 2-dimensional space. Your program will write a report to a text file, then read the report back in and display it.

Your main( ) method must do the following:

Tell the user what the program does.
Create the following objects and store the references to them in a single ArrayList.
A Circle object at point (1,1) with a radius of 10 inches and an identifier of 156
A Square object at point (1,3) with a side of 2 inches and an identifier of 237
A  Right Triangle at point (3,3) with a height of 3 inches, a base of 4 inches and an identifier of 212
Create a text file and write the data for each object to the file. Handle any IO exceptions.
Read the data from the file back into your program. Handle any IO Exceptions.
Using the data you just read from the file, display a report that looks like the following:
Shape      ID  Position  Area
Circle    156  (1,1)     314.16
Square    237  (1,3)       4.00
Triangle  212  (3,3)       6.00

    CIT 260 - 02
    Author@ Daniel Penha

*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class W13dot1 {
    public static void main(String[] args) {
        //1) Tell the user what the program does.
        System.out.println("This program creates a series of shapes then " +
                "shows their ID with their area.\n");
        System.out.println("Also it will write those shapes to a file, read them from a file.\n");

        //2) Create the following objects and store the references to them in a single ArrayList

        /*Err on the path
        ArrayList<ShapeObject> shapes = getShapes("C:\\Users\\Daniel Penha\\IdeaProjects\\CIT-260-02-Object-Oriented-Programming\\Week13\\src\\text_file.csv"); */

        //new ArrayList<>();

        //Read the data from the file back into your program. Handle any IO Exceptions.
        ArrayList<ShapeObject> shapes = getShapes("Week13/src/text_file.csv"); //new ArrayList<>();
/*
        No long needed
        //2.1) A Circle object at point (1,1) with a radius of 10 inches and an identifier of 156

//        shapes.add(new Circle( 156 , 10, new Point(1 ,1) ) );

        //2.2) A Square object at point (1,3) with a side of 2 inches and an identifier of 237

//        shapes.add(new Square( 237 , 2 , new Point(1 ,3)) );

        //2.3) A  Right Triangle at point (3,3) with a height of 3 inches, a base of 4 inches
        // and an identifier of 212

//        shapes.add(new RightTriangle( 212 , 4 , 3 , new Point(3 , 3) ) );

        //3) Create a text file and write the data for each object to the file.
        // Handle any IO exceptions.

        //4) Read the data from the file back into your program. Handle any IO Exceptions.


        //5) Using the data you just read from the file, display a report that
        // looks like the following:*/

        //Create a text file and write the data for each object to the file. Handle any IO exceptions.
        try (PrintWriter data = new PrintWriter("Week13/creat_file.txt")){

            data.format("%s %15s %10s %8s\n", "Shape" , "ID" , "Position" , "Area" );
            for (ShapeObject shape : shapes){
                shape.display();
                data.format("%-17s %d      (%s,%s) %10.2f \n",shape.getClass().getSimpleName(), shape.getId(), (int) shape.getPoint().getX(), (int) shape.getPoint().getY() , shape.getArea());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //6) Display a goodbye message.
        System.out.println("\nGoodbye ...");
    }

    //Build the exception
    public static ArrayList<ShapeObject> getShapes( String filePath) {
        ArrayList<ShapeObject> shapes = new ArrayList<>();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String[] row = scanner.nextLine().split(",");
                shapes.add(rowToShape(row));
            }
            scanner.close();
        } catch(Exception e) {
            System.out.println("Error while reading file data");
            e.printStackTrace();
            return shapes;
        }
        return shapes;
    }

    public static ShapeObject rowToShape(String[] row){
        String className = row[0];
        int id = Integer.parseInt(row[1]);
        int x = Integer.parseInt(row[2]);
        int y = Integer.parseInt(row[3]);
        double data = Double.parseDouble(row[4]);
        Point point = new Point(x, y);

        switch (className){
            case "Circle":
                return new Circle(id, data, point);
            case "Square":
                return new Square(id, data, point);
            default:
                double height = Double.parseDouble(row[5]);
                return new RightTriangle(id, data, height, point);
        }
    }

}
