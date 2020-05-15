package AbstractTest;



import tutorial.fullCodes.abstractConcept.HalifaxBank;
import tutorial.fullCodes.abstractConcept.BarclaysBank;


public class BankRunner {


    public static void main(String[] args) {

        BarclaysBank barclaysBank = new BarclaysBank();
        barclaysBank.createAccount();


       HalifaxBank halifaxBank = new HalifaxBank(8000);
       halifaxBank.getAccountBalance();





        /*1 BankOfEngland will not let you instantiate or else it will override all the abstract method
    BankOfEngland bank = new BankOfEngland() {
        @Override
        public double getAccountBalance() {
            return 0;
        }

        @Override
        public int getPassCode() {
            return 0;
        }

        @Override
        public void showAddress() {

        }
    };

 */
   }


}
