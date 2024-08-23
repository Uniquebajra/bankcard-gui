  /**
 * Write a description of class DebitCard here.
 *
 * @author (22067577 Unique Bajracharya)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    //attributes //initializing the variables
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;

     /**constructor for DebitCard subclass*/
    public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber)
    {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        super.setClientName(clientName);
        this.pinNumber = pinNumber;
        this.withdrawalAmount = 0;
        this.dateOfWithdrawal = "";
        this.hasWithdrawn = false;
    }
    
    
    //getter methods for all the variables //accessor
    public int getPinNumber()
    {
        return this.pinNumber;
    }

    public int getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }

    public String getDateOfWithdrawal()
    {
        return this.dateOfWithdrawal;
    }

    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }

    
    //setter method for the variables //mutator
    public void setWithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount = withdrawalAmount;
    }


    
    /**withdraw method*/
    /*
     This is a method to check the withdrawal which accepts three parameters.
    */
    public void withdraw(int pinNumber, int withdrawalAmount, String dateOfWithdrawal)
    {
        if(this.pinNumber == pinNumber)
        {
        System.out.println("Pin is valid");
            if(super.checkBalance(withdrawalAmount))
            {
            this.withdrawalAmount = withdrawalAmount;
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.hasWithdrawn = true;
            super.setBalanceAmount (super.getBalanceAmount() - withdrawalAmount);// a new value is assign to the balanceAmount with setter method of the super class after the withdrawal//
            System.out.println("Withdrawal has been made");
            }
            else 
            { 
            System.out.println("Insufficient Balance amount");
        }
    }
    else 
    {
        
            System.out.println("Invalid Pin number");
    }
    }


     
    /**method to display the results*/
    /*
      This is the display method of the DebitCard subclass.
      It also calls the display method of the super class.
    */
    public void display() //Display method
    {
        super.display();
        System.out.println("PIN number: " + pinNumber);
        if(hasWithdrawn)
        {  
            System.out.println("Withdrawal amount: " + withdrawalAmount);
            System.out.println("Date of Withdrawal: " + dateOfWithdrawal);  
        }
        else 
        {
            System.out.println("No withdrawal has been made.");
        }
    }
}

