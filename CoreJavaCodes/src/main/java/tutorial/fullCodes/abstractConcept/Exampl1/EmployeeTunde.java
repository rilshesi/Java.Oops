package tutorial.fullCodes.abstractConcept.Exampl1;

public class EmployeeTunde extends EmployeeBenefit {

    private final double increasePercentage = 0.02;
    private final double initialSalary = 5000;
    double totalIncrease;


    public EmployeeTunde(String firstName, String lastName, String emId, double initialSalary, double totalIncrease) {
        super(firstName, lastName, emId, initialSalary,totalIncrease);
    }

    public double chooseOneBenefit() {
       double totalIncrease =increasePercentage*initialSalary;
        return totalIncrease+initialSalary;
    }









}
