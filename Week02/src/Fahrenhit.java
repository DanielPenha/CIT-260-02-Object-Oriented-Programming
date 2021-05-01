import java.util.Scanner;

public class Fahrenhit {
    public static void main(String[] args){
        //1) Tells the user what the program does.
        System.out.println("This program converts a temperature in degrees Celsius into a temperature in degrees Fahrenheit.");
        //2) Prompts the user to enter a temperature in degrees Celsius.
        // Type a tempeture Fahrenhit
        System.out.println("Enter a degree in Fahrenhit: ");
        //3) Gets the user's input and saves it in a variable declared as a double.
        //Get data from keyboard
        Scanner input = new Scanner(System.in);
        //Variable declared as a double.
        double fahrenheit = input.nextDouble();
        //4) Converts the Celsius temperature to a temperature in degrees Fahrenheit, using the formula tempf = (9/5) tempc+ 32
        //Formula of corvation Fahrenhit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        //5) Outputs the Celsius temperature and the Fahrenheit temperature, with 2 digits after the decimal point.
        //Show the results
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
        //6) Outputs a goodbye message.
        System.out.println("Goodbye!");
    }
}