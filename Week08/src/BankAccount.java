public class BankAccount {
    //Attributes
    //1) A data field named accountNumber that holds the account number for the account.
    // This field is an integer.
    private int accountNumber;

    //2) A data field named balance that holds the balance in the account. This field is a double.
    private double balance;

    //GETTERS & SETTERS

    //Constructor
    //3) A no-arg constructor that creates a default account object.
    // It sets both data fields to zero.
    public BankAccount(){
        this.accountNumber = 0;
        this.balance = 0;
    }
    //4) A parameterized constructor that creates an account object with the
    // specified account number and balance.
    public BankAccount( int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //5) Getter methods for accountNumber and balance.
    public int getAccountNumber(){
        return this.accountNumber;
    }
//    public void setAccountNumber(int accountNumber){
//        this.accountNumber = accountNumber;
//    }

    public double getBalance(){
        return this.balance;
    }

//    public void setBalance(double balance){
//        this.balance = balance;
//    }

    //Methods
    //6) A method named makeDeposit( ) that takes a double as its argument, and
    // adds the value of the argument to the balance.
    /**
     * Returns the addition of a deposit value
     * @return makeDeposit
     */
    public void makeDeposit( double value ){
        this.balance += value;
    }

    //7) A method names makeWithdrawal( ) that takes a double as its argument,
    // and subtracts the value of the argument from the balance.
    /**
     * Returns the subtracts of a deposit value
     * @return makeWithdrawal
     */
    public void makeWithdrawal( double value ){
        this.balance -= value ;
    }

}
