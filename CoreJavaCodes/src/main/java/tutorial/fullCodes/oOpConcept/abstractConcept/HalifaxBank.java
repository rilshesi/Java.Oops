package tutorial.fullCodes.abstractConcept;

public class HalifaxBank extends BankOfEngland {/* wat if halifax also extends the BankOfEngland
and its called in runner class. so both halifax and barclays will some common abstract
method coming from BankOfEngland*/

    private final double balance;
    private int passCode;
    private String halifaxAddress;

    public HalifaxBank(double balance) {
        this.balance=balance;
    }


    public double getAccountBalance() {
        return balance;
    }

    public int getPassCode() {
        return passCode;
    }

    public void showAddress() {
        System.out.println("halifax");

    }
}
