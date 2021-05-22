/*W05 Assignment: Program 5.1
Write a short Java program that does the following:

Tells the user what the program does.
Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds) and display the following table.
Outputs a goodbye message.
        kilograms    pounds
        ---------    ------
         1           2.2
         3           6.6
         5          11.0
         7          15.4
         9          19.8
        11          24.2
        13          28.6
        15          33.0
----------------------------------------------------------------
CIT 260 - 02
Author@ Daniel Penha
        */

public class W05dot1 {
    public static void main(String[] args) {
        //1) Tells the user what the program does.
        System.out.println("This Program displays a table of kilogram to ponds conversions.\n");

        //2) Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds) and display the following table.
        //Table top
        System.out.printf("%-10s   %-10s\n", "Kilogram", "Pounds");

        //Table spacer
        System.out.printf("%-10s   %-10s\n", "--------" , "------");

        //Loop i == Kilogram
        for (int i = 1 ; i <= 15; i= i+2){

            //Calculate Pounds per Kilogram
            double pounds = i * 2.2;

            //System.out.println(kilogram);
            System.out.printf("%-10s   %-10.1f\n", i , pounds);

        }

        //3) Outputs a goodbye message.
        System.out.println("\nGoodbye");
    }
}
