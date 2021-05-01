import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args){
        //My code here!
        //1)Tells the user what the program does.
        System.out.println("here");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase amoutn: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100);
    }
}