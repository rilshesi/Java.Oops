package tutorial.fullCodes.abstractConcept;


//Add Abstract to the class
/*Abstract class does same things as normal class, but will not be available for public consumption or used directly.
it can have Variables(field o/ local) and Proper Method & Abstract Method. An Abstract class cannot be
Instantiated directly becos some methods in abstract are not fully defined
 e.g(Instantiate) Bank bank =  new Bank().

 if you succeed in instantiating it, that means the abstract method will be useless. any class that
 inherit them will be forced to implement abstract method and abstract variables, As well as benefit from


 Why do we create Abstract Class: To ensure uniformity in the class that Inherit from them

 */
public abstract class BankOfEngland {

    private final String bankName = "the name of the bank is satanda";


    //abstract method cannot have body {}.
    public abstract double getAccountBalance();

    public abstract int getPassCode();

    public abstract void showAddress();


    //proper method that we mostly used
    public void createAccount(){
        System.out.println("Creating Account On this Bank");

    }

    public String getBankName( ){
        return bankName;
    }

}
