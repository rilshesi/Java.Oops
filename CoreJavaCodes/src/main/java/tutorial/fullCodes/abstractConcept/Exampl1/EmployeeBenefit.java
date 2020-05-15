package tutorial.fullCodes.abstractConcept.Exampl1;

/*this is an employee benefit, created by Employer, which will allow workers to take the normal
benefit from the normal method and implement the abstract method to demand for an extra
benefit. so they need to implement it themselves and ask for what they want by extending EmployeeBenefit class.

 */
public abstract class EmployeeBenefit {

    private final String firstName;
    private final String lastName;
    private final String emId;
    private final double initialSalary;
    private final double totalIncrease;


    protected EmployeeBenefit(String firstName, String lastName, String emId, double initialSalary, double totalIncrease) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emId = emId;
        this.initialSalary=initialSalary;
        this.totalIncrease=totalIncrease;
    }


    public abstract double chooseOneBenefit();


    public String getAppraised(){

        return "every employee must be appraised once a year";
    }


    public String getEmployeeFullName(){
        return firstName+ ""+ lastName;

    }

    public String getEmployeeId(){
        return emId;
    }

    public double finalSalary(){
        return totalIncrease+initialSalary;
    }



}
