/*
Design a parent class named Employee. Your Employee class should include:

        A String, name,  that holds the employee's name.
        an integer serialNumber, that holds the employee's serial number.
        A no-arg constructor that initializes name to "none" and serialNumber to 0.
        A parameterized constructor that initializes name and serialNumber using arguments
        passed to the constructor.
        Getters for name and serialNumber.
        A method named getGrossPay( ) that returns a zero;
        A method named getFedWithholding( ) that returns a zero.
        A method named getStateWithholding( ) that returns a zero.

        CIT 260 - 02
        Author@ Daniel Penha
*/
public class Employee {
    //Attributes
    //1) A String, name,  that holds the employee's name.
    private String name;

    //2) an integer serialNumber, that holds the employee's serial number.
    private int serialNumber;

    //Constructor
    //3) A no-arg constructor that initializes name to "none" and serialNumber to 0.
    public Employee(){
        this.name = "none";
        this.serialNumber = 0;
    }

    //4) A parameterized constructor that initializes name and serialNumber using arguments
    // passed to the constructor.
    public Employee( String name , int serialNumber){
        this.name = name;
        this.serialNumber = serialNumber;
    }

    //GETTERS & SETTERS
    //5) Getters for name and serialNumber.
    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Serial Number

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Method
    //6) A method named getGrossPay( ) that returns a zero;
  /*  public double getGrossPay(){
        return  this.getGrossPay() = 0;
    }*/


    //7) A method named getFedWithholding( ) that returns a zero.
    //8) A method named getStateWithholding( ) that returns a zero.

}
