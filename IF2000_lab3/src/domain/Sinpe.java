/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author azuce
 */
public class Sinpe {
    
   private TransactionLog transactionLog;
    
    public Sinpe(TransactionLog transactionLog) {
        this.transactionLog = transactionLog;
    }
    
    public boolean transferMoney(Account fromAccount, Account toAccount, double amount) {
        // Validate that accounts belong to banks
        if (fromAccount.getBank() == null || toAccount.getBank() == null) {
            System.out.println("Transfer failed: One or both accounts are not associated with a bank.");
            return false;
        }
        
        if (fromAccount.getBalance() < amount) {
            System.out.println("Transfer failed: Insufficient funds in source account.");
            return false;
        }
        
        if (amount <= 0) {
            System.out.println("Transfer failed: Invalid transfer amount.");
            return false;
        }
        
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
        
        transactionLog.addTransaction("SINPE_TRANSFER_OUT", fromAccount, amount);
        transactionLog.addTransaction("SINPE_TRANSFER_IN", toAccount, amount);
        
        System.out.println("SINPE Movil transfer successful!"
                +"\nFrom: " + fromAccount.getBank().getNameBank()+ " - Account: " + fromAccount.getAccountNumber()
                +"\nTo: " + toAccount.getBank().getNameBank()+ " - Account: " + toAccount.getAccountNumber()
                +"\nAmount: " + String.format("%.2f", amount));
        
        return true;
    }
    
}
