/*
Instructions
        Design a parent class named Employee. Your Employee class should include:

        A String, name,  that holds the employee's name.
        an integer serialNumber, that holds the employee's serial number.
        A no-arg constructor that initializes name to "none" and serialNumber to 0.
        A parameterized constructor that initializes name and serialNumber using arguments passed
        to the constructor.
        Getters for name and serialNumber.
        A method named getGrossPay( ) that returns a zero;
        A method named getFedWithholding( ) that returns a zero.
        A method named getStateWithholding( ) that returns a zero.

        Design a class named Hourly that inherits from Employee. Your Hourly class should include:

        A double, hourlyWage,  that holds this person's hourly wage.
        A double, hoursWorked, that holds the number of hours this person worked.
        An appropriate no-arg constructor.
        An appropriate parameterized constructor.
        Getters for hourlyWage and hoursWorked.
        Override the getGrossPay( ), getFedWithholding( ) and getStateWithholding( ) methods from
        the Employee class. The gross pay for an Hourly employee is calculated as hoursWorked x
        hourlyWage. Use a state tax rate of 0.07 and a federal tax rate of 0.15.
        Design a class named Salaried that inherits from Employee. Your Salaried class should include:

        A double, annualSalary, that holds the annual salary for this person.
        An appropriate no-arg constructor.
        An appropriate parameterized constructor.
        A Getter for salary.
        Override the getGrossPay( ), getFedWithholding( ) and getStateWithholding( ) methods
        from the Employee class. The gross pay for a Salaried employee is calculated as
        annualSalary / 52. Use a state tax rate of 0.07 and a federal tax rate of 0.15.

        Create a UML diagram that documents your class design. Show the Employee, Hourly and
        Salaried classes in your diagram. Include your diagram when you submit your assignment.
        The preferred format is a .PDF file.


        Create a new project in IntelliJ and add the code for your Employee class, your Hourly
        class, and your Salaried class. Then create a driver class that contains your main( ) method.
         Your main( ) method should do the following:

        Tells the user what the program does.
        Creates an ArrayList<Employee>.
        Create instances for the following employees and add them to the ArrayList:
        * Hourly employee Harry Hacker, serial number 123. Harry earns $15.00 and hour and
        works 30 hours a week.
        * Hourly employee Isabel Intern, serial number 233. Isabel earns $12.50 and hour and
         works 20 hours a week.
        * Salaried employee Cathy Coder, serial number 611. Cathy earns $80,000 a year.
        Using an appropriate loop to go through the Employees in the ArrayList, print out a
         payroll report as shown in the following diagram:
        Display a goodbye message.
        The example below shows what the output from your program should look like:

        Payroll Report
        Employee: Harry Hacker Serial: 123
        Gross Pay: $450.00
        Federal Withholding: $67.50
        State Withholding: $31.50
        Net Pay: $351.00

        Employee: Isabell Intern Serial: 233
        Gross Pay: $250.00
        Federal Withholding: $37.50
        State Withholding: $17.50
        Net Pay: $195.00

        Employee: Catherine Coder Serial: 611
        Gross Pay: $1,538.46
        Federal Withholding: $230.77
        State Withholding: $107.69
        Net Pay: $1,200.00
        Compile and test your code. When you are satisfied that your program works correctly,
         place the complete project folder for the
        program into a zip file.  Add the UML file to the .zip file.

        Submit the .zip file here on Canvas by the due date.

        CIT 260 - 02
        Author@ Daniel Penha
*/
public class W11dot1 {
    public static void main(String[] args) {

        //1) Tells the user what the program does.
        System.out.println("Payroll Report");

        //2) Creates an ArrayList<Employee>.


        //3) Create instances for the following employees and add them to the ArrayList:
        //   * Hourly employee Harry Hacker, serial number 123. Harry earns $15.00 and hour
        //   and works 30 hours a week.
        //   * Hourly employee Isabel Intern, serial number 233. Isabel earns $12.50 and
        //   hour and works 20 hours a week.
        //   * Salaried employee Cathy Coder, serial number 611. Cathy earns $80,000 a year.


        //4) Using an appropriate loop to go through the Employees in the ArrayList, print
        // out a payroll report as shown in the following diagram:


        //5) Display a goodbye message.
        System.out.println("\nGoodbye ...");
    }
}
