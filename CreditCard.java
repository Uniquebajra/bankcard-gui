
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067577 Unique Bajracharya)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    //attributes //initializing the variables
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
   
    
    /**constructor for CreditCard subclass*/
    public CreditCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int cvcNumber, double interestRate, String expirationDate)
    {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        super.setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    
    //getter methods for all the variables //accessor
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }
    
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    
    public double getInterestRate()
    {
        return this.interestRate;
    }
    
    public String getExpirarionDate()
    {
        return this.expirationDate;
    }
    
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
    
    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    
    
    //setter method for the variables //mutator
    public void setCreditLimit(int creditLimit, int gracePeriod)
    {
        if(creditLimit <= 2.5 * super.getBalanceAmount())
        { 
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
            System.out.println("Credit is granted.");
        }
        else
        {
            System.out.println("Credit cannot be issued.");
        }
    }    
    
    /**cancle credit card method*/
    /*
    This method cancels the credit card and reset all the value of the variables to their default values
    and displays a suitable message
    */
    public void cancelCreditCard()
    { 
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.interestRate = 0;
        this.expirationDate = "";
        this.gracePeriod = 0;
        this.isGranted = false;
        System.out.println("Credit card has been canceled.");

    }
    
    
    
    /**method to display the results*/
    /*
    This is the display method of the CreditCard subclass.
    */
    public void display(){
        super.display();
        if(isGranted){
            System.out.println("CVC number: " + cvcNumber);
            System.out.println("Credit Limit: " + creditLimit);
            System.out.println("Interest rate: " + interestRate); 
            System.out.println("Expiration date: " + expirationDate);
            System.out.println("Grace period: " + gracePeriod);
        }
        else{
            System.out.println("Credit card has not been granted yet.");
        }
    }
}
