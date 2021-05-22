/*W05 Assignment: Program 5.2
Write a short Java program that does the following:

Tells the user what the program does.
Uses a loop to display a table of all of the numbers from 100 to 1000 that are divisible by both 5 and 6.
   The numbers must be separated by exactly one space and there must be 10 numbers per line.
Displays a goodbye message.
Your output should look like the following:

This program displays all of the numbers from 100 to 1000
that are divisible by both 5 and 6.

120 150 180 210 240 270 300 330 360 390
420 450 480 510 540 570 600 630 660 690
720 750 780 810 840 870 900 930 960 990

Goodbye

----------------------------------------------------------------
CIT 260 - 02
Author@ Daniel Penha
*/

public class W05dot2 {
    public static void main(String[] args) {
        // 1)  Tells the user what the program does.
        System.out.println("This program displays all of the numbers from 100 to 1000\n" +
                "that are divisible by both 5 and 6.\n ");
        // 2) Uses a loop to display a table of all of the numbers from 100 to 1000 that are divisible by both 5 and 6.
        int elements = 1;
        //All of the numbers from 100 to 1000
        for (int i = 100 ; i <= 1000 ; i++){
            //Divisible by both 5 and 6
            if (i % 5 == 0 && i % 6 == 0){
                if (elements % 10 != 0) {
                    System.out.print( i+ " ");
                    elements++;
                } else {
                    System.out.println(i);
                    elements = 1;
                }

            }
        }
        //3) Displays a goodbye message.
        System.out.println("\nGoodbye");
    }
}
