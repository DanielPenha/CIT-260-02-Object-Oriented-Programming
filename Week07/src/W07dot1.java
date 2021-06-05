import java.util.Scanner;

/**W07 Assignment: Program 7.1
 For this program you will write two methods. The first computes and returns the mean value for an array of doubles. The method header for this method looks like this:

 public static double mean(double[ ] x);

 The second method computes and returns the standard deviation for a sample population. The method header for this method looks like this:

 public static double deviation(double[ ] x);

 The equation for the mean:

 𝑚 𝑒 𝑎 𝑛 = ( 𝑥 1 + 𝑥 2 + 𝑥 3 + . . . + 𝑥 𝑛 ) ÷ 𝑛

 The equation for the Standard Deviation:

 How to Calculate Standard Deviation | Standard deviation, Math ...



 Now write a main( ) method that does the following:

 Tells the use what the program does.
 Prompts the user to enter five numbers.
 Saves the user's input in an array of doubles.
 Uses the methods above to compute the mean and the standard deviation for the numbers in the array.
 Displays the mean and the standard deviation with 2 digits after the decimal point.
 Displays a goodbye message.
 Your file should have the proper file prologue, and each method should have the proper method prologue.
 The following example show you what your program should look like when it runs (user input is green):

 This program computes the mean and the standard deviation for a set of numbers.
 Enter a number: 3.5
 Enter a number: 4
 Enter a number: 6.1
 Enter a number: 6
 Enter a number: 7.5

 The mean of this set of numbers is 5.42
 The standard deviation is 1.65
 Goodbye ...
 CIT 260 - 02
 Author@ Daniel Penha
 */
public class W07dot1 {
    public static void main(String[] args) {
        //1) Tells the use what the program does.
        System.out.println("This program calculates the average of five numbers.");

        //2) Prompts the user to enter five numbers.
        Scanner input = new Scanner(System.in);

        //3) Saves the user's input in an array of doubles.
        double[] fiveNumber = new double[5];
        double average = 0;

        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Please enter a number: ");
            fiveNumber[i] = input.nextDouble();
        }
        //4) Uses the methods above to compute the mean and the standard deviation for the numbers in the array.

        //5) Displays the mean and the standard deviation with 2 digits after the decimal point.
        //Mean
        System.out.printf("The mean of this set of numbers is %.2f\n", "mean" );

        //Standard Diviation
        System.out.printf("The standard deviation is %.2f\n" , "deviation" );

        //6) Displays a goodbye message.
        System.out.println("\nGoodbye ...");

    }
    //7) Your file should have the proper file prologue, and each method should have the proper method prologue.
    /**
     * Computes and returns the mean value for an array of doubles
     * @param    m mean value for an array
     * @return   the mean value for an array of doubles
     */
    //Research to get the mean: https://stackoverflow.com/questions/4191687/how-to-calculate-mean-median-mode-and-range-from-a-set-of-numbers
    public static double mean(double[] m) {
        double sum = 0;
        for (int i = 0 ; i < m.length; i++){
            sum += m[i];
        }
        return sum / m.length;

    }

    /**
     * Computes and returns the standard deviation for a sample population
     *
     * @param divided the standard deviation
     * @return the temperature in Celsius
     */

    //  }
}
