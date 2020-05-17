package tutorial.fullCodes.oOpConcept.abstractConcept.Exampl1;

public class EmployeeRunner {



    public static void main(String[] args) {

        double totalIncrease=0;

        double initialSalary = 5000;
        EmployeeTunde employeeTunde = new EmployeeTunde("Tunde","Ola","yahoo",5000, totalIncrease);

        String appraisal = employeeTunde.getAppraised();
        System.out.println(appraisal);

        String fullName = employeeTunde.getEmployeeFullName();
        System.out.println(fullName);

        String id = employeeTunde.getEmployeeId();
        System.out.println(id);

         totalIncrease = employeeTunde.chooseOneBenefit();
        System.out.println(totalIncrease);




    }
}
