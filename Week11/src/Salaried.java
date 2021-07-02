public class Salaried extends Employee{
    //Attributes
    //1) A double, annualSalary, that holds the annual salary for this person.
    private double annualSalary;

    //Constructor
    //2) An appropriate no-arg constructor.
    public Salaried(){

    }

    //3) An appropriate parameterized constructor.
    public Salaried( double annualSalary){
        this.annualSalary = annualSalary;
    }

    //GETTERS & SETTERS
    //4) A Getter for salary.
    public double getAnnualSalary() {
        return annualSalary;
    }

    //Methods
    //5) Override the getGrossPay( ), getFedWithholding( ) and getStateWithholding( ) methods
    // from the Employee class.
    // The gross pay for a Salaried employee is calculated as annualSalary / 52.
    // Use a state tax rate of 0.07 and a federal tax rate of 0.15.
    @Override
    public double getGrossPay(){
        return this.annualSalary / 52;
    }

    @Override
    public double getFedWithholding(){
        return this.getGrossPay() * 0.15;
    }

    @Override
    public double getStateWithholding(){
        return this.getGrossPay() * 0.07;
    }




}
