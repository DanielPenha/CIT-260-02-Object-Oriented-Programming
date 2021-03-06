/**W06 Assignment: Program 6.2
 Write a short Java program that contains the following two methods:

 public static double celsiusToFahrenheit(double tempCelsius)

 public static double fahrenheitToCelsius(double tempFahrenheit)

 Your program should

 1) Tell the user what the program does.
 2) Invoke the above two methods to compute and display the table shown below.
 3) Output a goodbye message.
 ----------------------------------------
 Celsius        Fahrenheit     |    Fahrenheit     Celsius
 ----------------------------------------------------------
 40.0           104.0          |    120.0          48.89
 39.0           102.2          |    110.0          43.33
 38.0           100.4          |    100.0          37.78
 37.0            98.6          |     90.0          32.22
 36.0            96.8          |     80.0          26.67
 35.0            95.0          |     70.0          21.11
 34.0            93.2          |     60.0          15.56
 33.0            91.4          |     50.0          10.00
 32.0            89.6          |     40.0           4.44
 31.0            87.8          |     30.0          -1.11

 * CIT 260 - 02
 * Author@ Daniel Penha
 * */
public class W06dot2 {
    public static void main(String[] args) {
        //1) Tell the user what the program does.
        System.out.println("This program shows you an table of Celsius and Fahrenheit");

        //2) Invoke two methods to compute and display the table shown below
        double celsius = 40;
        double fahrenheit = 120;
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s   %-10s   |     %-10s   %-10s\n", "Celsius","Fahrenheit", "Fahrenheit", "Celsius");
        System.out.println("--------------------------------------------------------");

        for (int i = 1; i <= 10; i++){
            //System.out.println(celsius--);
            //System.out.println(fahrenheit);
            System.out.printf("%-10s   %-10s   |     %-10s   %-10.2f\n",celsius,celsiusToFahrenheit(celsius) , fahrenheit, fahrenheitToCelsius(fahrenheit));
            celsius--;
            fahrenheit -= 10;
        }

        //3) Output a goodbye message.
        System.out.println("\nGoodbye");
    }
    /**
     * Mathematical conversion celsius to Fahrenheit
     * @param    tempCelsius the temperature in Celsius
     * @return   the temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double tempCelsius){
        return (tempCelsius * 9.0 / 5.0 )  + 32;
    }

    /**
     * Mathematical conversion Fahrenheit to celsius
     * @param    tempFahrenheit the temperature in Fahrenheit
     * @return   the temperature in Celsius
     */
    public static double fahrenheitToCelsius(double tempFahrenheit){
        return (tempFahrenheit - 32) * (5.0 / 9) ;
    }
}
