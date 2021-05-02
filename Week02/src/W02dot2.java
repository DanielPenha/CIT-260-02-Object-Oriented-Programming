/*
 * W02 Assignment: Program 2.2
 Write a short Java program that does the following:

 Tells the user what the program does.
 Prompts the user to enter a value for the cost of their meal.
 Gets the user's input and saves it in a variable declared as a double.
 Prompts the user to enter a percentage value for the tip.
 Gets the user's input and saves it in a variable declared as a double.
 Calculates the value of the tip, using the percentage entered by the user.
 Calculates the tax on the meal. The tax rate is 3.2%.
 Calculates the total bill = meal cost + tip + tax.
 Outputs the tip, the tax, and the total value of the bill.
       All values will be formatted to show a dollar sign and 2 digits after the decimal point.
 Outputs a goodbye message.
  CIT 260 - 02
   Author@ Daniel Penha
   * font textbook: 2.15 Numeric Type Conversions
*/

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class W02dot2 {
    public static void main(String[] args){
        //My code here!
        //*Current Locate - Extra Credit
        // To do that we need to use a class Currency*/
        Currency correntLocate = Currency.getInstance(Locale.getDefault());
        //Test code:
        // +++System.out.println(correntLocate.getSymbol());
        //font for help: https://howtodoinjava.com/java/date-time/how-to-get-current-user-locale-in-java/
        //https://www.javatpoint.com/post/java-currency-getinstance-method#:~:text=The%20getInstance(Locale%20locale)%20is,result%20may%20vary%20over%20time.
        //https://www.tutorialspoint.com/java/util/currency_getinstance.htm
        //http://www.avajava.com/tutorials/lessons/how-do-i-display-the-currency-for-a-locale.html
        //1) Tells the user what the program does.
        System.out.println("Given the price of a meal and a percentage to use for the tip, this program calculates the tip, the tax, and the total amount of the bill.");
        //2) Prompts the user to enter a value for the cost of their meal.
        System.out.print("Enter the cost of the meal: ");
        //3) Gets the user's input and saves it in a variable declared as a double.
        //--Scanner costMeal = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        //--double meal = costMeal.nextDouble();
        double costMeal = input.nextDouble();

        //4) Prompts the user to enter a percentage value for the tip.
        System.out.print("Enter the tip percentage: ");
        //5) Gets the user's input and saves it in a variable declared as a double.
        //--Scanner tipPerc = new Scanner(System.in);
        //--double tip = tipPerc.nextDouble();
        double tipPerc = input.nextDouble() /100;

        //6) Calculates the value of the tip, using the percentage entered by the user.
        //--double valueTip = (costMeal + (tipPerc * 100));
        double valueTip = (costMeal * tipPerc);

        //7) Calculates the tax on the meal. The tax rate is 3.2%.
        double MealTax = (costMeal * (3.2 / 100));

        //8) Calculates the total bill = meal cost + tip + tax.
        double totalBill = (costMeal + valueTip + MealTax);

        //9) Outputs the tip, the tax, and the total value of the bill. * All values will be formatted to show a dollar sign and 2 digits after the decimal point.
        System.out.println( "The tip is: " + correntLocate.getSymbol()  + String.format("%.2f",valueTip) );
        System.out.println("The tax is: "  + correntLocate.getSymbol() + String.format("%.2f", MealTax) );
        System.out.println("The total bill is: " + correntLocate.getSymbol() + String.format("%.2f", totalBill) );

        //10) Outputs a goodbye message.
        System.out.println("Goodbye!");
    }
}
