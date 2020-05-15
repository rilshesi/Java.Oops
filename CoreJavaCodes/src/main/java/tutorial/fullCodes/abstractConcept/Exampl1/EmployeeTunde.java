package tutorial.fullCodes.abstractConcept.Exampl1;

public class EmployeeTunde extends EmployeeBenefit {

    private double increasePercentage = 0.02;
    private double initialSalary = 5000;


    protected EmployeeTunde(String firstName, String lastName, String emId, double initialSalary,double totalIncrease) {
        super(firstName, lastName, emId, initialSalary,totalIncrease);
    }

    public double chooseOneBenefit() {
       double totalIncrease =increasePercentage*initialSalary;
        return totalIncrease+initialSalary;
    }









}
