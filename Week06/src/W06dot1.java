import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

/**W06 Assignment: Program 6.1
 Write a short Java program that does the following:

 1) Tells the user what the program does.
 2) Prompts the user to an investment amount, for example, 1000.
 3) Gets the user's input and saves it. If the user's input is not a positive, non-zero value, display an error message, then loop back and prompt for a new value. Stay in this loop until you have a valid value.
 4) Prompts the user to enter an annual interest rate between 0 and 100. For example, 9 would be 9%.
 5) Gets the user's input and saves it. If the user's input is not positive or if it is greater than 100, display an error message, then loop back and prompt for a new value. Stay in this loop until you have a valid value.
 6) Using a method that you have written, calculate and display the future value of the investment
 for a period of 10 years. The formula for computing the future value of an investment is
 futureValue = investmentAmount x (1 + monthlyInterestRate)numberOfYears * 12

 The method header for your method should look like this:

 public static double futureValue(double investmentAmount, double monthlyInterestRate, int years)

 Here is an example of what your program should look like when it runs (user input is in green):
 ---------------------------------------------------------
 Given an investment amount and an annual interest rate, this program
 will calculate the future value of the investment for a period of
 ten years.

 Enter the a positive, non-zero value for the investment: 1000
 Enter an annual interest rate, between 0 and 100: 9

 Years   Future Value
 1       $1093.81
 2       $1196.41
 3       $1308.65
 4       $1431.41
 5       $1565.68
 6       $1712.55
 7       $1873.20
 8       $2048.92
 9       $2241.12
 10      $2451.36

 Goodbye ...
 *
 * CIT 260 - 02
 * Author@ Daniel Penha
 * */
public class W06dot1 {
    public static void main(String[] args) {

        Currency currentLocate = Currency.getInstance(Locale.getDefault());
        //1) Tells the user what the program does.
        System.out.println("Given an investment amount and an annual interest rate, this program \n" +
                "will calculate the future value of the investment for a period of\n" +
                "ten years.\n");

        //2) Prompts the user to an investment amount, for example, 1000.
        Scanner input = new Scanner(System.in);

        boolean positiveValue = false;
        int investmentAmount = 0;

        while (positiveValue == false) {

            //3) Gets the user's input and saves it. If the user's input is not a positive, non-zero value, display an error message, then loop back and prompt for a new value. Stay in this loop until you have a valid value.
            System.out.println("Enter the a positive, non-zero value for the investment:");


            investmentAmount = input.nextInt();

            if (investmentAmount > 0)
                positiveValue = true;
        }

        //4) Prompts the user to enter an annual interest rate between 0 and 100. For example, 9 would be 9%.

        positiveValue = false;
        double annualInterestRate = 0;
        //5) Gets the user's input and saves it. If the user's input is not positive or if it is greater than 100, display an error message, then loop back and prompt for a new value. Stay in this loop until you have a valid value.

        while (positiveValue == false) {

            if (annualInterestRate > 0 && annualInterestRate <= 100) {
                positiveValue = true;
            } else {
                System.out.println("Please, enter an annual interest rate, between 0 and 100:");
                annualInterestRate = input.nextDouble();
            }

        }
        System.out.printf("%6s     %s\n" , "Years" , "Future Value");

        for (int year = 1; year <=10 ; year++) {
            double futureValue = futureValue(investmentAmount, annualInterestRate, year);
            System.out.printf("%6s     "+currentLocate.getSymbol()+"%.2f\n" , year , futureValue);
        }

        //Say goodbye
        System.out.println("\nGoodbye ....");
    }
    //6) Using a method that you have written, calculate and display the future value of the investment
    //  for a period of 10 years. The formula for computing the future value of an investment is
    //     futureValue = investmentAmount x (1 + monthlyInterestRate)numberOfYears * 12
    //**  The method header for your method should look like this:
    //public static double futureValue(double investmentAmount, double monthlyInterestRate, int years)*/
    /**
     * A mathematics method for future value
     * @param    investmentAmount, annualInterestRate, years
     * @return   The future value of a value
     */
    public static double futureValue(double investmentAmount, double annualInterestRate, int years){

        return investmentAmount * Math.pow((1 + ((annualInterestRate/100)/12)), (years*12));
    }
}
