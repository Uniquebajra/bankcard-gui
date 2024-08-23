

/**
 * Write a description of class BankCardGUI here.
 *
 * @author (22067577 Unique Bajracharya)
 * @version (1.0.0)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BankCardGUI implements ActionListener
{
    //declar all the componentes here
    //-----declaring components for debit card----//
    private JFrame frame;
    private JPanel panel;
    
    //----------------------Declare the components Debit card---------------------//
    private JLabel bankCardLabel, debitCardDetailsLabel, balanceAmountLabel, cardIdLabel, bankAccountLabel, issuerBankLabel, clientNameLabel, pinNumberLabel, debitCardLabel, cardId3Label, withdrawalAmountLabel, pinNumber1Label, 
    dateOfWithdrawalLabel;
    private JTextField balanceAmountTextField, cardIdTextField, bankAccountTextField, issuerBankTextField, clientNameTextField, pinNumberTextField, debitcardTextField, withdrawalAmountTextField,
    pinNumber1TextField, cardId3TextField;
    private JButton addDebitCardButton, displayDebitCardButton, withdrawButton;
    private JComboBox debitDayComboBox, debitMonthComboBox, debitYearComboBox;
    
    //------------------------Declare the components of Credit card-------------------//
    private JLabel creditCardDetailsLabel, balanceAmount1Label, cardId1Label, bankAccount1Label, issuerBank1Label, clientName1Label, cvcNumberLabel, interestRateLabel, expirationDateLabel, setCreditLimitLabel, 
    cardId4Label, creditCardLabel, gracePeriodLabel;
    private JTextField balanceAmount1TextField, issuerBank1TextField, cardId1TextField, bankAccount1TextField, clientName1TextField, cvcNumberTextField, interestRateTextField, 
    cardId4TextField, setCreditLimitTextField, gracePeriodTextField;
    private JComboBox dayComboBox, monthComboBox, yearComboBox;
    private JButton addCreditCardButton, displayCreditCardButton, setCreditLimitButton, cancelCreditButton, clearButton; 
    
    //////Array list to store the details of the bank cards/////
    private ArrayList<BankCard> cards = new ArrayList();
    
        
    public BankCardGUI(){
        frame = new JFrame();
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(1, 141, 177)); // Set the background color
        panel.setBounds(0, 0, 1100, 100);
        
        frame.add(panel);
        
        bankCardLabel = new JLabel("ABC BANK");
        bankCardLabel.setBounds(470, 15, 142, 30);
        bankCardLabel.setFont(new Font("Helvetica", Font.BOLD, 25));  
        bankCardLabel.setForeground(Color.WHITE);
        panel.add(bankCardLabel);

        JLabel wBankCardJLabel = new JLabel("Thank You For Choosing Us");
        wBankCardJLabel.setBounds(385, 55, 411, 30);
        wBankCardJLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        wBankCardJLabel.setForeground(Color.WHITE);
        panel.add(wBankCardJLabel);
        
        
        ///////////////////-------------------------------------Debit Card Details--------------------------------------------////////////////
        debitCardDetailsLabel = new JLabel("DebitCard Details");
        debitCardDetailsLabel.setBounds(135, 110, 250, 30);
        debitCardDetailsLabel.setForeground(new Color(1, 141, 177));
        debitCardDetailsLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        frame.add(debitCardDetailsLabel);      
        
        
        ///////////////////Debit card details labels///////////////////
        balanceAmountLabel = new JLabel("Balance Amount: ");
        balanceAmountLabel.setBounds(85, 162, 132, 24);
        frame.add(balanceAmountLabel);
        
        cardIdLabel = new JLabel("Card ID: ");
        cardIdLabel.setBounds(85, 195, 132, 24);
        frame.add(cardIdLabel);
        
        bankAccountLabel = new JLabel("Bank Account: ");
        bankAccountLabel.setBounds(85, 228, 132, 24);
        frame.add(bankAccountLabel);
        
        issuerBankLabel = new JLabel("Issuer Bank: ");
        issuerBankLabel.setBounds(85, 261, 132, 24);
        frame.add(issuerBankLabel);
        
        clientNameLabel = new JLabel("Client Name: ");
        clientNameLabel.setBounds(85, 295 ,132, 24);
        frame.add(clientNameLabel);
        
        pinNumberLabel = new JLabel("PIN Number: ");
        pinNumberLabel.setBounds(85, 327 ,132, 24);
        frame.add(pinNumberLabel);
        
 
        /////////////////////////debit card details text field///////////////////
        balanceAmountTextField = new JTextField();
        balanceAmountTextField.setBounds(214, 162, 234, 25);
        frame.add(balanceAmountTextField);
        
        cardIdTextField = new JTextField();
        cardIdTextField.setBounds(214, 195, 234, 25);
        frame.add(cardIdTextField);
        
        bankAccountTextField = new JTextField();
        bankAccountTextField.setBounds(214, 228, 234, 25);
        frame.add(bankAccountTextField);
        
        issuerBankTextField = new JTextField();
        issuerBankTextField.setBounds(214, 261, 234, 25);
        frame.add(issuerBankTextField);
        
        clientNameTextField = new JTextField();
        clientNameTextField.setBounds(214, 295, 234, 25);
        frame.add(clientNameTextField);
        
        pinNumberTextField = new JTextField();
        pinNumberTextField.setBounds(214, 327, 234, 25);
        frame.add(pinNumberTextField);
        
  
        ////////////////add debitcard button to add the details of debitcard////////////////
        addDebitCardButton = new JButton("Add DebitCard");
        addDebitCardButton.setBounds(100, 353, 145, 30);
        addDebitCardButton.setFont(new Font("Arial", Font.PLAIN, 16));
        addDebitCardButton.setBackground(new Color(1, 141, 177));
        addDebitCardButton.setForeground(Color.WHITE);
        addDebitCardButton.setFocusPainted(false);
        addDebitCardButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        addDebitCardButton.setPreferredSize(new Dimension(120, 40));
        frame.add(addDebitCardButton);
        
        ////////////////display button to display the details of debitcard////////////////
        displayDebitCardButton = new JButton("Display Debit");
        displayDebitCardButton.setBounds(275, 353, 145, 30);
        displayDebitCardButton.setFont(new Font("Arial", Font.PLAIN, 16));
        displayDebitCardButton.setBackground(new Color(1, 141, 177));
        displayDebitCardButton.setForeground(Color.WHITE);
        displayDebitCardButton.setFocusPainted(false);
        displayDebitCardButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        displayDebitCardButton.setPreferredSize(new Dimension(120, 40));
        frame.add(displayDebitCardButton);
        
       
        ////////////////////witdraw from debitcard//////////////////
        debitCardLabel = new JLabel("Withdraw from DebitCard");
        debitCardLabel.setBounds(120, 510, 316, 30);
        debitCardLabel.setForeground(new Color(1, 141, 177));
        debitCardLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        frame.add(debitCardLabel);
        
        //////////////////withdraw from debit card label////////////////////
        cardId3Label = new JLabel("Card ID: ");
        cardId3Label.setBounds(85, 555, 132, 24);
        frame.add(cardId3Label);
        
        withdrawalAmountLabel = new JLabel("Withdrawal Amount: ");
        withdrawalAmountLabel.setBounds(85, 588, 132, 24);
        frame.add(withdrawalAmountLabel);
        
        pinNumber1Label = new JLabel("PIN Number: ");
        pinNumber1Label.setBounds(85, 621, 132, 24);
        frame.add(pinNumber1Label);
        
        dateOfWithdrawalLabel = new JLabel("Date of Withdrawal: ");
        dateOfWithdrawalLabel.setBounds(85, 654, 132, 24);
        frame.add(dateOfWithdrawalLabel);
        
        
        //////////////////withdraw from debit card textfield////////////////////
        cardId3TextField = new JTextField();
        cardId3TextField.setBounds(214, 555, 234, 25);
        frame.add(cardId3TextField);
        
        withdrawalAmountTextField = new JTextField();
        withdrawalAmountTextField.setBounds(214, 588, 234, 25);
        frame.add(withdrawalAmountTextField);
        
        pinNumber1TextField = new JTextField();
        pinNumber1TextField.setBounds(214, 621, 234, 25);
        frame.add(pinNumber1TextField);
        
       
        /////////////////////date of withdrawal of debit card////////////////////
        
        Integer[] day = new Integer[31];
        for(int i=0; i<31; i++){
            day[i] = i + 1;
        }
        debitDayComboBox = new JComboBox(day);
        debitDayComboBox.setBounds(214, 654, 60, 30);
        frame.add(debitDayComboBox);
     
        String month[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        debitMonthComboBox = new JComboBox(month);
        debitMonthComboBox.setBounds(279, 654, 60, 30);
        frame.add(debitMonthComboBox);
       
        String year[]={"2023","2024","2025","2026"};
        debitYearComboBox = new JComboBox(year);
        debitYearComboBox.setBounds(344, 654, 60, 30);
        frame.add(debitYearComboBox);
        
        
        ////////////////withdraw Button for debitcard////////////////
        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(214, 687, 234, 30);
        withdrawButton.setFont(new Font("Arial", Font.PLAIN, 16));
        withdrawButton.setBackground(new Color(1, 141, 177));
        withdrawButton.setForeground(Color.WHITE);
        withdrawButton.setFocusPainted(false);
        withdrawButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        withdrawButton.setPreferredSize(new Dimension(120, 40));
        frame.add(withdrawButton);
        
     
        ///////////////////----------------------------------Credit Card Details-----------------------------////////////////
        creditCardDetailsLabel = new JLabel("CreditCard Details");
        creditCardDetailsLabel.setBounds(685, 110, 250, 30);
        creditCardDetailsLabel.setForeground(new Color(1, 141, 177));
        creditCardDetailsLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
        frame.add(creditCardDetailsLabel);      
                
        
        ////////////////////////////////////////credit card details labebls//////////////////////////
        balanceAmount1Label = new JLabel("Balance Amount: ");
        balanceAmount1Label.setBounds(620, 162, 132, 24);
        frame.add(balanceAmount1Label);
        
        cardId1Label = new JLabel("Card ID: ");
        cardId1Label.setBounds(620, 195, 132, 24);
        frame.add(cardId1Label);
        
        bankAccount1Label = new JLabel("Bank Account: ");
        bankAccount1Label.setBounds(620, 228, 132, 24);
        frame.add(bankAccount1Label);
        
        issuerBank1Label = new JLabel("Issuer Bank: ");
        issuerBank1Label.setBounds(620, 261, 132, 24);
        frame.add(issuerBank1Label);
        
        clientName1Label = new JLabel("Client Name: ");
        clientName1Label.setBounds(620, 295 ,132, 24);
        frame.add(clientName1Label);
        
        cvcNumberLabel = new JLabel("CVC Number: ");
        cvcNumberLabel.setBounds(620, 327, 132, 24);
        frame.add(cvcNumberLabel);
        
        interestRateLabel = new JLabel("Interest Rate: ");
        interestRateLabel.setBounds(620, 360, 132, 24);
        frame.add(interestRateLabel);
        
        expirationDateLabel = new JLabel("Expiration Date: ");
        expirationDateLabel.setBounds(620, 393, 132, 24);
        frame.add(expirationDateLabel);
        
        
        //////////////////credit card details text field//////////////////////////
        balanceAmount1TextField = new JTextField();
        balanceAmount1TextField.setBounds(755, 162, 234, 25);
        frame.add(balanceAmount1TextField);
        
        cardId1TextField = new JTextField();
        cardId1TextField.setBounds(755, 195, 234, 25);
        frame.add(cardId1TextField);
        
        bankAccount1TextField = new JTextField();
        bankAccount1TextField.setBounds(755, 228, 234, 25);
        frame.add(bankAccount1TextField);
        
        issuerBank1TextField = new JTextField();
        issuerBank1TextField.setBounds(755, 261, 234, 25);
        frame.add(issuerBank1TextField);
        
        clientName1TextField = new JTextField();
        clientName1TextField.setBounds(755, 295, 234, 25);
        frame.add(clientName1TextField);
        
        cvcNumberTextField = new JTextField();
        cvcNumberTextField.setBounds(755, 327, 234, 25);
        frame.add(cvcNumberTextField);

        interestRateTextField = new JTextField();
        interestRateTextField.setBounds(755, 360, 234, 25);
        frame.add(interestRateTextField);
        
        
        ////////////////////expiration date of credit card/////////////////////////
        Integer[] day1 = new Integer[31];
        for(int i=0; i<31; i++){
            day1[i] = i + 1;
        }   
        dayComboBox = new JComboBox(day1);
        dayComboBox.setBounds(755, 393, 60, 30);
        frame.add(dayComboBox);
        
        
        String month1[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        monthComboBox = new JComboBox(month1);
        monthComboBox.setBounds(820, 393, 60, 30);
        frame.add(monthComboBox);
        
        String year1[]={"2023","2024","2025","2026"};
        yearComboBox = new JComboBox(year);
        yearComboBox.setBounds(885, 393, 60, 30);
        frame.add(yearComboBox);
        
        
        ///////////////////////////////button to add credit card details//////////////////
        addCreditCardButton = new JButton("Add CreditCard");
        addCreditCardButton.setBounds(635, 426, 155, 30);
        addCreditCardButton.setFont(new Font("Arial", Font.PLAIN, 16));
        addCreditCardButton.setBackground(new Color(1, 141, 177));
        addCreditCardButton.setForeground(Color.WHITE);
        addCreditCardButton.setFocusPainted(false);
        addCreditCardButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        addCreditCardButton.setPreferredSize(new Dimension(120, 40));
        frame.add(addCreditCardButton);
        
        //////////////////button to display credit card details////////////////////////////////
        displayCreditCardButton = new JButton("Display Credit");
        displayCreditCardButton.setBounds(820, 426, 145, 30);
        displayCreditCardButton.setFont(new Font("Arial", Font.PLAIN, 16));
        displayCreditCardButton.setBackground(new Color(1, 141, 177));
        displayCreditCardButton.setForeground(Color.WHITE);
        displayCreditCardButton.setFocusPainted(false);
        displayCreditCardButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        displayCreditCardButton.setPreferredSize(new Dimension(120, 40));
        frame.add(displayCreditCardButton);
        
        
        /////////////////////setcredit limit of credit card label/////////////////////////
        
        creditCardLabel = new JLabel("Set Credit Limit");
        creditCardLabel.setBounds(720, 510, 250, 30);
        creditCardLabel.setForeground(new Color(1, 141, 177));
        creditCardLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        frame.add(creditCardLabel);
        
        //-------------setcredit limit----------label-----////
        cardId4Label = new JLabel("Card ID: ");
        cardId4Label.setBounds(620, 555, 132, 24);
        frame.add(cardId4Label);
        
        setCreditLimitLabel = new JLabel("Set Credit Limit: ");
        setCreditLimitLabel.setBounds(620, 588, 132, 24);
        frame.add(setCreditLimitLabel);
        
        gracePeriodLabel = new JLabel("Grace Period: ");
        gracePeriodLabel.setBounds(620, 621, 132, 24);
        frame.add(gracePeriodLabel);
        
        //--------------set credit limit--------textfield//
        cardId4TextField = new JTextField();
        cardId4TextField.setBounds(755, 555, 234, 25);
        frame.add(cardId4TextField);
        
        setCreditLimitTextField = new JTextField();
        setCreditLimitTextField.setBounds(755, 588, 234, 25);
        frame.add(setCreditLimitTextField);
        
        gracePeriodTextField = new JTextField();
        gracePeriodTextField.setBounds(755, 621, 234, 25);
        frame.add(gracePeriodTextField);
        
        
        //////////////button to set credit limit/////////////////////  
        setCreditLimitButton = new JButton("Set Credit Limit");
        setCreditLimitButton.setBounds(755, 654, 234, 30);
        setCreditLimitButton.setFont(new Font("Arial", Font.PLAIN, 16));
        setCreditLimitButton.setBackground(new Color(1, 141, 177));
        setCreditLimitButton.setForeground(Color.WHITE);
        setCreditLimitButton.setFocusPainted(false);
        setCreditLimitButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        setCreditLimitButton.setPreferredSize(new Dimension(120, 40));
        frame.add(setCreditLimitButton);
        
        ////////////////button to cancel credit////////////////////////////////
        cancelCreditButton = new JButton("Cancel Credit");
        cancelCreditButton.setBounds(755, 687, 234, 30);
        cancelCreditButton.setFont(new Font("Arial", Font.PLAIN, 16));
        cancelCreditButton.setBackground(new Color(1, 141, 177));
        cancelCreditButton.setForeground(Color.WHITE);
        cancelCreditButton.setFocusPainted(false);
        cancelCreditButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        cancelCreditButton.setPreferredSize(new Dimension(120, 40));
        frame.add(cancelCreditButton);
        
        
        ////////////////////////////////clear button////////////////////////////////
        clearButton = new JButton("Clear");
        clearButton.setBounds(470, 720, 180, 30);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 16));
        clearButton.setBackground(new Color(1, 141, 177));
        clearButton.setForeground(Color.WHITE);
        clearButton.setFocusPainted(false);
        clearButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        clearButton.setPreferredSize(new Dimension(120, 40));
        frame.add(clearButton);
        
        
        ////////////////action listeners//////////////////////////////// 
        addDebitCardButton.addActionListener(this);
        addCreditCardButton.addActionListener(this);
        displayDebitCardButton.addActionListener(this);
        displayCreditCardButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        setCreditLimitButton.addActionListener(this);
        cancelCreditButton.addActionListener(this);
        clearButton.addActionListener(this);
        
        
        frame.setTitle("Bank Card");
                
        frame.setLayout(null);
        
        frame.setSize(1100, 800);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setResizable(false);
        
        frame.setVisible(true);
    }
    public static void main(String[] args){
        BankCardGUI GUI = new  BankCardGUI();
    }
    
    public void actionPerformed(ActionEvent e){
        //write the logic of the button functionality here
        if(e.getSource() == addDebitCardButton){
            try{
                // Get balance amount from text field
                String balanceAmount = balanceAmountTextField.getText();
                int balanceAmountValue = Integer.parseInt(balanceAmount);
                
                // Get card ID from text field
                String cardId = cardIdTextField.getText();
                int cardIdValue = Integer.parseInt(cardId);
                
                // Get bank account from text field
                String bankAccount = bankAccountTextField.getText();
                // Get issuer bank from text field
                String issuerBank = issuerBankTextField.getText();
                // Get issuer bank from text field
                String clientName = clientNameTextField.getText();
                // Get PIN number from text field
                
                String pinNumber = pinNumberTextField.getText();
                int pinNumberValue = Integer.parseInt(pinNumber);
                
                // Create a new DebitCard object with the extracted values
                DebitCard debitCardDetails = new DebitCard (balanceAmountValue, cardIdValue, bankAccount, issuerBank, clientName, pinNumberValue);
                
                if(cards.isEmpty()){
                    // If the cards list is empty, add the new debit card directly
                    cards.add(debitCardDetails);
                    JOptionPane.showMessageDialog(frame, "DebitCard has been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                }
                else{
                    boolean isAdded = true;
                    for(BankCard storeDebitCards: cards){
                        if(cardIdValue == storeDebitCards.getCardId()){
                            // If a card with the same card ID exists, show an error message
                            JOptionPane.showMessageDialog(frame, "This DebitCard has already been added", "Alert", JOptionPane.ERROR_MESSAGE);
                            isAdded = false;
                            break; //Exit the loop once a matching card id is found
                        }
                        else{
                            isAdded = true;
                        }
                    }
                    
                    if(isAdded == true){
                        cards.add(debitCardDetails);
                        JOptionPane.showMessageDialog(frame, "New DebitCard has been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException nfe){
                 // Show a warning message if input information is invalid
                JOptionPane.showMessageDialog(frame, "The information you have input cannot be accepted", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        
        if(e.getSource() == addCreditCardButton){
            try{
                // Get balance amount from text field
                String balanceAmount = balanceAmount1TextField.getText();
                double balanceAmount1Value = Double.parseDouble(balanceAmount);
                
                // Get card ID from text field
                String cardId1 = cardId1TextField.getText();
                int cardId1Value = Integer.parseInt(cardId1);
                
                // Get bank account from text field
                String bankAccount = bankAccount1TextField.getText();
                // Get issuer bank from text field
                String issuerBank = issuerBank1TextField.getText();
                // Get client name from text field
                String clientName = clientName1TextField.getText();
                
                // Get CVC number from text field
                String cvcNumber = cvcNumberTextField.getText();
                int cvcNumberValue = Integer.parseInt(cvcNumber);
                
                // Get interest rate from text field
                String interestRate = interestRateTextField.getText();
                double interestRateValue = Double.parseDouble(interestRate);
                
                
                // Get interest rate from text field
                String year  = (String)yearComboBox.getSelectedItem();
                String month = (String)monthComboBox.getSelectedItem();
                int day = (int)dayComboBox.getSelectedItem();
                String dayString = String.valueOf(day);
                
                String expirationDate = (year +","+ month +" "+ dayString);
                
                
                // Create a new CreditCard object with the extracted values
                CreditCard creditCardDetails = new CreditCard (balanceAmount1Value, cardId1Value, bankAccount, issuerBank, clientName, cvcNumberValue, interestRateValue, expirationDate);
                
                if(cards.isEmpty()){
                    // If the cards list is empty, add the new credit card directly
                    cards.add(creditCardDetails);
                    JOptionPane.showMessageDialog(frame, "CreditCard has been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                else{ 
                    boolean isAdded = false;
                    for(BankCard storeCreditCards: cards){
                        if(cardId1Value == storeCreditCards.getCardId()){
                            // If a card with the same card ID exists, show an error message
                            JOptionPane.showMessageDialog(frame, "CreditCard has already been added", "Alert", JOptionPane.ERROR_MESSAGE);
                            isAdded = false;
                            break; //Exit the loop once a matching card id is found
                        }
                        else{
                             // If no card with the same card ID exists, set isAdded to true
                            isAdded = true;
                        }
                    }
                    
                    if(isAdded == true){
                        // If isAdded is true, add the new credit card
                        cards.add(creditCardDetails);
                        JOptionPane.showMessageDialog(frame, "New CreditCard has been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException nfe){
                // Show a warning message if input information is invalid
                JOptionPane.showMessageDialog(frame, "The information you have input cannot be accepted", "Alert", JOptionPane.WARNING_MESSAGE);

            }
        }
        
        
        if (e.getSource() == displayDebitCardButton) {
            // Variable to track if a debit card is found
            boolean foundDebitCard = false;
            
            // Iterate through the cards list to find debit cards
            for (BankCard storeDebitCards : cards) {
                if (storeDebitCards instanceof DebitCard) {
                    System.out.println("*************************************************\n");
                    ((DebitCard) storeDebitCards).display();
                    System.out.println("\n");
                    foundDebitCard = true;
                }
            }
            if (foundDebitCard) {
                JOptionPane.showMessageDialog(frame, "The details have been displayed", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "No DebitCard found", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if (e.getSource() == displayCreditCardButton) {
            // Variable to track if a credit card is found
            boolean foundCreditCard = false;
            
            // Iterate through the cards list to find credit cards
            for (BankCard storeCreditCards : cards) {
                if (storeCreditCards instanceof CreditCard) {
                    System.out.println("*************************************************\n");
                    ((CreditCard) storeCreditCards).display();
                    System.out.println("\n");
                    foundCreditCard = true;
                }
            }
            if (foundCreditCard) {
                JOptionPane.showMessageDialog(frame, "The details have been displayed", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "No CreditCard found", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        
        if (e.getSource() == withdrawButton) {
            try {
                // Get card ID from text field
                String cardId3 = cardId3TextField.getText();
                int cardId3Value = Integer.parseInt(cardId3);
                
                // Get PIN number from text field
                String pinNumberWithdraw = pinNumber1TextField.getText();
                int pinNumberWithdrawValue = Integer.parseInt(pinNumberWithdraw);
                
                // Get withdrawal amount from text field
                String withdrawalAmount = withdrawalAmountTextField.getText();
                int withdrawalValue = Integer.parseInt(withdrawalAmount);
                
                // Get selected values from combo boxes for the withdrawal date
                String year = (String) debitYearComboBox.getSelectedItem();
                String month = (String) debitMonthComboBox.getSelectedItem();
                int day1 = (int) dayComboBox.getSelectedItem();
                String day1String = String.valueOf(day1);
                
                // Join the selected values to create the withdrawal date string
                String dateOfWithdrawal = year +","+ month +" "+ day1String;
                
                // Variable to track if a debit card is found
                boolean debitcard = false;
                
                if (cards.isEmpty()) {
                    // If the cards list is empty, show an error message
                    JOptionPane.showMessageDialog(frame, "Cannot Withdraw, DebitCard has not been added yet", "Alert", JOptionPane.ERROR_MESSAGE);
                } else {
                    for (BankCard withdrawCards : cards) {
                        if (withdrawCards instanceof DebitCard) {
                            if (cardId3Value == withdrawCards.getCardId()) {
                                debitcard = true;
                                if (pinNumberWithdrawValue == ((DebitCard) withdrawCards).getPinNumber()) {
                                    if (((DebitCard) withdrawCards).checkBalance(withdrawalValue)) {
                                        ((DebitCard) withdrawCards).withdraw(pinNumberWithdrawValue, withdrawalValue, dateOfWithdrawal);
                                        JOptionPane.showMessageDialog(frame, "The amount has been withdrawn successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                    } else {
                                        JOptionPane.showMessageDialog(frame, "Insufficient balance", "Success", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Incorrect PIN number", "Alert", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                debitcard = false;
                            }
                        } 
                    }
                }
                
                if (debitcard == false) {
                    JOptionPane.showMessageDialog(frame, "The DebitCard with the provided ID has not been found", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException nfex) {
                JOptionPane.showMessageDialog(frame, "The information you provided cannot be accepted", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }

                
        if (e.getSource() == setCreditLimitButton) {
            try {
                // Get card ID from text field
                String cardId4 = cardId4TextField.getText();
                int cardIdCreditLimit = Integer.parseInt(cardId4);
                
                // Get credit limit value from text field
                String setCreditLimit = setCreditLimitTextField.getText();
                int setCreditLimitValue = Integer.parseInt(setCreditLimit);
                
                // Get grace period value from text field
                String gracePeriod = gracePeriodTextField.getText();
                int gracePeriodValue = Integer.parseInt(gracePeriod);
                
                // Variable to track if a credit card is found
                boolean creditcard = false;
                
                if (cards.isEmpty()) {
                    // If the cards list is empty, show an error message
                    JOptionPane.showMessageDialog(frame, "Cannot set credit limit. CreditCard has not been added yet", "Alert", JOptionPane.ERROR_MESSAGE);
                } else {
                    for (BankCard creditCards : cards) {
                        if (creditCards instanceof CreditCard) {
                            if (cardIdCreditLimit == creditCards.getCardId()) {
                                creditcard = true;
                                if (setCreditLimitValue <= 2.5 * creditCards.getBalanceAmount()) {
                                    ((CreditCard) creditCards).setCreditLimit(setCreditLimitValue, gracePeriodValue);
                                    JOptionPane.showMessageDialog(frame, "The credit limit has been set successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(frame, "The amount exceeds the credit limit", "Alert", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                creditcard = false;
                            }
                        }
                    }
                }
                
                if (creditcard == false) {
                    JOptionPane.showMessageDialog(frame, "The Creditcard with the provided ID has not been found", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException nfex) {
                JOptionPane.showMessageDialog(frame, "The information you provided cannot be accepted", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }

        
        if (e.getSource() == cancelCreditButton) {
            try {
                // Get card ID from text field
                String cardId4 = cardId4TextField.getText();
                int cardIdCreditLimit = Integer.parseInt(cardId4);
                
                // Variable to track if the credit card is found
                boolean creditlimit = false;
                
                if (cards.isEmpty()) {
                    // If the cards list is empty, show an error message
                    JOptionPane.showMessageDialog(frame, "Cannot cancel credit card. CreditCard has not been added yet", "Alert", JOptionPane.ERROR_MESSAGE);
                } else {
                    for (BankCard creditCards : cards) {
                        if (creditCards instanceof CreditCard) {
                            if (cardIdCreditLimit == creditCards.getCardId()) {
                                // Cancel the credit card
                                ((CreditCard) creditCards).cancelCreditCard();
                                JOptionPane.showMessageDialog(frame, "The CreditCard has been canceled", "Success", JOptionPane.INFORMATION_MESSAGE);
                                creditlimit = true;
                                break;
                            } 
                        } 
                    }
                }
                if(creditlimit == false){
                    JOptionPane.showMessageDialog(frame, "The card ID provided does not exist", "Alert", JOptionPane.ERROR_MESSAGE);

                }
            } 
            catch (NumberFormatException nfex) {
                JOptionPane.showMessageDialog(frame, "The information you provided cannot be accepted", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }

        
        if(e.getSource() == clearButton){
            // Clear the text fields by setting their text to empty strings
            balanceAmountTextField.setText("");
            cardIdTextField.setText("");
            bankAccountTextField.setText("");
            issuerBankTextField.setText("");
            clientNameTextField.setText("");
            pinNumberTextField.setText("");
            balanceAmount1TextField.setText("");
            cardId1TextField.setText("");
            bankAccount1TextField.setText("");
            issuerBank1TextField.setText("");
            clientName1TextField.setText("");
            cvcNumberTextField.setText("");
            interestRateTextField.setText("");
            pinNumber1TextField.setText("");
            cardId3TextField.setText("");
            withdrawalAmountTextField.setText("");
            pinNumberTextField.setText("");
            cardId4TextField.setText("");
            setCreditLimitTextField.setText("");
            gracePeriodTextField.setText("");
            
        }
    }

}
