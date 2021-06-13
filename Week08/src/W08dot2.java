/**W08 Assignment: Program 8.2
 Design and create a class that represents a bank account. Name the class BankAccount.
 Create a UML class diagram that shows your design. Your UML class diagram must be submitted
 as part of this assignment.
 Your Bank class should contain the following:

 A data field named accountNumber that holds the account number for the account. This field
 is an integer.
 A data field named balance that holds the balance in the account. This field is a double.
 A no-arg constructor that creates a default account object. It sets both data fields to zero.
 A parameterized constructor that creates an account object with the specified account number
 and balance.
 Getter methods for accountNumber and balance.
 A method named makeDeposit( ) that takes a double as its argument, and adds the value of the
 argument to the balance.
 A method names makeWithdrawal( ) that takes a double as its argument, and subtracts the value
 of the argument
 from the balance.
 Then write a short Java program that implements your BankAccount class, and a main() method that
 does the following:

 Tells the user what the program does. This program has no user input.
 Creates a BankAccount object with an account number of 123 and an initial balance of $5.00
 Makes a deposit of $10.50 into this account.
 Makes a deposit of $3.25 into this account.
 Makes a withdrawal of $1.50 from this account.
 Displays the current balance in the account as shown in the example below.
 Output a goodbye message.
 The following example illustrates what your program should look like when it runs. Your code
 should be well documented
 with appropriate file prologues, method prologues and comments.

 This program tests the BankAccount class by ...
 ...Creating account number 123 with an initial balance of $5.00
 ...Making a deposit of $10.50
 ...Making a deposit of $3.25
 ...Making a withdrawal of $1.50
 The balance in account number 123 is $17.25
 Goodbye...


 * CIT 260 - 02
 * Author@ Daniel Penha*/

public class W08dot2 {
    public static void main(String[] args) {
        //1) Tells the user what the program does. This program has no user input.
        System.out.println("This program tests the BankAccount class by adding a deposit and withdrawal,\n" +
                " and shows the account balance.\n" +
                "This program has no user input.");

        //2) Creates a BankAccount object with an account number of 123
        // and an initial balance of $5.00
        BankAccount bankAccount = new BankAccount(123,5.00);
        System.out.printf("\n...Creating account number %s with an initial balance of $%.2f",
                bankAccount.getAccountNumber(), bankAccount.getBalance());

        //3) Makes a deposit of $10.50 into this account.
        bankAccount.makeDeposit(10.50);
        System.out.printf("\n...Making a deposit of $%.2f", 10.50 );

        //4) Makes a deposit of $3.25 into this account.
        bankAccount.makeDeposit(3.25);
        System.out.printf("\n...Making a deposit of $%.2f", 3.25 );

        //5) Makes a withdrawal of $1.50 from this account.
        bankAccount.makeWithdrawal(1.50);
        System.out.printf("\n...Making a withdrawal of $%.2f", 1.50 );

        //6) Displays the current balance in the account as shown in the example below.
        System.out.printf("\nThe balance in account number %s is $%.2f\n", bankAccount.getAccountNumber(),
                bankAccount.getBalance() );


        //7) Output a goodbye message.
        System.out.println("\nGoodbye...");
    }
}
