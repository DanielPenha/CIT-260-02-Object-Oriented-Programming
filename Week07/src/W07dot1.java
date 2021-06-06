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
        System.out.println("This program calculates the Mean and the Standard Deviation of five numbers.\n");

        //2) Prompts the user to enter five numbers.
        Scanner input = new Scanner(System.in);
        double[] fiveNumbers = new double[5];
        double sum = 0.0;


        for (int i = 0 ; i < fiveNumbers.length ; i++){
            System.out.println("Enter a number: ");
            //3) Saves the user's input in an array of doubles.
            fiveNumbers[i] = input.nextDouble();
            sum += fiveNumbers[i];
        }
        double mean = mean(fiveNumbers);
        double SD = calculateSD(fiveNumbers);

        //5) Displays the mean and the standard deviation with 2 digits after the decimal point.
        // Display the mean
        //System.out.println("The mean of this set of numbers is " + sum/fiveNumbers.length);
        //System.out.println("The mean of this set of numbers is " + mean);
        System.out.printf("The mean of this set of numbers is %.2f\n", mean);

        // Display the standard deviation
        //System.out.println("The standard deviation is " + SD);
        System.out.printf("The standard deviation is %.2f\n" , SD);

        //6) Displays a goodbye message.
        System.out.println("Goodbye ...");
    }

    //4) Uses the methods to compute the mean and the standard deviation
    // for the numbers in the array.

    //https://www.programiz.com/java-programming/examples/average-arrays
    /**
     * Computes and returns the mean value for an array of doubles
     * @param    fiveNumbers mean value for an array
     * @return   the mean value for an array of doubles
     */
    // The mean is simply the average of the numbers.
    public static double mean(double[] fiveNumbers){
        double sum = 0.0 , mean = 0.0;
        for (double num: fiveNumbers){
            sum += num;
        }
        return mean = sum/fiveNumbers.length;
    }
    // The standard deviation is a statistic that tells you how tightly all the various
    // data are clustered around the mean in a set of data
    /**
     * Computes and returns the standard deviation for a sample population
     * @param fiveNumbers the standard deviation
     * @return the temperature in Celsius
     */
    //https://www.programiz.com/java-programming/examples/standard-deviation
    public static double calculateSD(double[] fiveNumbers){
        double sum = 0.0 , standardDeviation = 0.0;
        int length = fiveNumbers.length;
        for (double num: fiveNumbers){
            sum += num;
        }
        double mean = sum/length;
        for (double num: fiveNumbers){
            standardDeviation += Math.pow(num - mean,2);
        }
        return Math.sqrt(standardDeviation/length);
        }
}