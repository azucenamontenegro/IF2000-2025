/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author azuce
 */
public abstract class Account {
    //Atributes
    private String accountNumber;
    private double balance;
    private Client client;
    private Bank bank;

    public Account() {
    }

    public Account(String accountNumber
                   , double balance
                   , Client client, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public Bank getBank() {
        return bank;
    }
    
    public void setBank(Bank bank) {
        this.bank = bank;
    }


    //-----------------------
    //Methods for polimorfism
    //-----------------------
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double interestCalculation();

    @Override
    public String toString() {
        
        String result = "\nBANK ACCOUNT INFORMATION:"
                +"\n---------------------------------"
                +"\nAccount Number: "+this.getAccountNumber()
                +"\nBalance: "+ this.getBalance()
                +"\nAccount Owner:\n "+this.getClient().toString()
                +"\n";
                
            return result;

    }//endToString
    

}

