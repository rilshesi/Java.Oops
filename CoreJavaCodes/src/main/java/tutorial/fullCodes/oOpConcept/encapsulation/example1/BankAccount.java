package tutorial.fullCodes.oOpConcept.encapsulation.example1;

import java.util.Scanner;

/*Encapsulation Golden Rule: states that because fields are now encapsulated and access is restricted, to access
 the field, we need to use Getters and Setters methods.

Note: Getters and setters can allow us to set a pin functions and other security for our instance
variables in case we need to access it outside of its class.
 */

public class BankAccount {

    private static final int Pin_Number = 1213;
    private double accountBalance = 2500;
    private boolean isAccessed = true;


    public double getAccountBalance(int pin) throws Exception {
        if(pin == Pin_Number ){
            return accountBalance;

        }else{
            throw new Exception(("Try again"));
        }
    }


    public void setAccountBalance(int pin) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount to deposit");
        String amountToDeposit = scanner.nextLine();
        int amount = Integer.parseInt(amountToDeposit);

        if(pin == Pin_Number){
            this.accountBalance=accountBalance+amount;
            System.out.println(accountBalance);
        }else if(pin !=Pin_Number){
            throw new Exception("Incorrect pin try again");
        }
    }



    public boolean isAccessed() {
        return isAccessed;
    }

    public boolean setAccessed(boolean accessed) {
        isAccessed = accessed;
        return accessed;
    }


}
