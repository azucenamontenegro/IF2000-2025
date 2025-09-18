/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author azuce
 */
public class TransactionLog {
    private ArrayList<Transaction> transactions;
    private int eventIdCounter;
    
    public TransactionLog() {
        this.transactions = new ArrayList<>();
        this.eventIdCounter = 1;
    }
    
    public void addTransaction(String eventType, Account account, double amount) {
        Transaction transaction = new Transaction(eventIdCounter++, eventType, new Date(), account, amount);
        transactions.add(transaction);
        System.out.println("Transaction logged: " + transaction.toString());
    }
    
    public void showAllTransactions() {
        System.out.println("\n=== TRANSACTION HISTORY ===");
        for (Transaction transaction : transactions) {
            System.out.println(transaction.toString());
        }
    }
    
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
