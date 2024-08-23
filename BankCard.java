 
/**
 * Write a description of class BankCard here.
 * The BankCard is a representation of bank card in the form of object. The BankCard class contains several attributes such as balance ammount, card ID, bank account, issuer bank. 
   These attributes describes the BankCard class. The class also contains a constructor method which accepts four parameters such as balance amount, card ID, bank account and issuer bank. 
   The parameter values are assigned to the respective attributes.
   The BankCard also has accessor mehod for each attribute which allows the program to retrieve the values of the corresponding attributes. the class also contains a setter method to set 
   the client name.
   The BankCard also has a display method that provides the output values of the balance amount, card ID, bank account and issuer bank. And if the client name is not assigned, a suitable 
   message is displayed as a output with the help of display method.
   This class can be used to represent a real-world scenario of basic bank card and its function. It can also be extented by the subclasses DebitCard and CreditCard to add functionality.
 * @author (22067577 Unique Bajracharya)
 * @version (1.0.0)
 */
public class BankCard
{
    //attributes //initializing the variables
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
    
    
    /**constructor for BankCard super class*/
    public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank)
    {
        this.cardId = cardId;
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;
        this.clientName = "";
    }

    
    
    //getter methods for all the variables //accessor
     public int getCardId() 
    {
        return this.cardId;
    }

    public String getClientName() 
    {
        return this.clientName;
    }

    public String getIssuerBank() 
    {
        return this.issuerBank;
    }

    public String getBankAccount()
    {
        return this.bankAccount;
    }

    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }
    
    
    
    //setter method for the variables //mutator
    public void setClientName(String clientName)
    {
        //attribute = parameter
        this.clientName = clientName;
    }
    
    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
    
    //checking whether balance is sufficient for withdrawal
    //checkbalance method
    public boolean checkBalance(int withdrawalAmount)
    {
        return this.balanceAmount >= withdrawalAmount;
    }
    
    
    
    
    /**method to display the details*/
     /*
      This is the display method of the super class.
     */
    public void display() //Display method
    {
    System.out.println("Card ID: " + cardId);
    if(clientName.equals("")) {
        System.out.println("Client name: not assigned");
    } 
    else {
        System.out.println("Client name: " + clientName);
    }
    System.out.println("Issuer bank: " + issuerBank);
    System.out.println("Bank account: " + bankAccount);
    System.out.println("Balance amount: " + balanceAmount);
    }
}
