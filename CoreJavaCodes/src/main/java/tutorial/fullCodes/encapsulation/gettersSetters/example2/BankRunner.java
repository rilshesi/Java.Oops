package tutorial.fullCodes.encapsulation.gettersSetters.example2;

public class BankRunner {

    public static void main(String[] args) throws Exception {
        BankAccount bankAccount = new BankAccount();
        boolean accessed = bankAccount.isAccessed();
        System.out.println(accessed);


        double bal = bankAccount.getAccountBalance(1213);
        System.out.println(bal);


        boolean access = bankAccount.setAccessed(false);
        System.out.println(access);

        bankAccount.setAccountBalance(0000);
    }
}
