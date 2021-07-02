public class Hourly extends Employee {
    //Attributes
    //1) A double, hourlyWage,  that holds this person's hourly wage.
    private double hourlyWage;

    //2) A double, hoursWorked, that holds the number of hours this person worked.
    private double hoursWorked;

    //Constructor

    //3) An appropriate no-arg constructor.
    public Hourly(){

    }

    //4) An appropriate parameterized constructor.
    public Hourly ( double hourlyWage , double hoursWorked ){
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    
    //GETTERS & SETTERS
    //5) Getters for hourlyWage and hoursWorked.
    //hourlyWage
    public double getHourlyWage() {
        return hourlyWage;
    }

    //hoursWorked
    public double getHoursWorked() {
        return hoursWorked;
    }

    //Methods
    //6) Override the getGrossPay( ), getFedWithholding( ) and getStateWithholding( )
    // methods from the Employee class.
    // The gross pay for an Hourly employee is calculated as hoursWorked x hourlyWage.
    // Use a state tax rate of 0.07 and a federal tax rate of 0.15.

    //Override the getGrossPay( )
    @Override
    public double getGrossPay(){
        return this.hoursWorked * this.hourlyWage ;
    }

    //getFedWithholding( )
    @Override
    public double getFedWithholding(){
        // federalTax = (hourWage * hourWage) * 0.20;
        return this.getGrossPay() * 0.15;
    }

    //getStateWithholding( )
    @Override
    public double getStateWithholding(){
        //stateTax =  (hourWage * hourWage) * 0.09;
        return this.getGrossPay() * 0.07;
    }
}
