/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author azuce
 */
public class SavingAccount extends Account{
    //Atributes
    private String initialDate;
    private int months;
    private float interest;

    public SavingAccount(String initialDate, int months, float interest) {
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public SavingAccount(String initialDate, int months, float interest, String accountNumber, double balance, Client client, Bank bank) {
        super(accountNumber, balance, client, bank);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public void deposit(double amount) {
        
        super.setBalance(this.getBalance()+ amount);
        
    }

    @Override
    public void withdraw(double amount) {
    if(amount<=this.getBalance())   
        super.setBalance(this.getBalance()- amount);
    else
            System.out.println("You dont have enough money");
    }

    @Override
    public double interestCalculation(){
       
        double total;
        total = this.getMonths()*super.getBalance()*this.getInterest();
        
     return super.getBalance()+ total;
        
    }

    @Override
    public String toString() {
        double gainedInterest = (this.getMonths() * super.getBalance() * this.getInterest()) / 100;
        String result = "\nAccount Type: SAVING ACCOUNT"
                +"\n-----------------------------------"
                +"\n Initial date of account: "+this.getInitialDate()
                +"\n Months of saving: "+this.getMonths()
                +"\n Interest: "+this.getInterest()
                +"\n Gained Interest: "+gainedInterest
                +"\n Balance after interest: "+(this.getBalance()+gainedInterest);
        return super.toString()+ result;
    
    }//end Of ToString()
    
    
 
    
    
    
}
