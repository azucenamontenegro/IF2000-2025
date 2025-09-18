/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import java.util.Date;
/**
 *
 * @author azuce
 */
public class Transaction {
    private int eventId;
        private String eventType;
        private Date transactionDate;
        private String accountInfo;
        private double amount;
        
        public Transaction(int eventId, String eventType, Date transactionDate, Account account, double amount) {
            this.eventId = eventId;
            this.eventType = eventType;
            this.transactionDate = transactionDate;
            this.accountInfo = account.getAccountNumber() + " - " + account.getClient().getName();
            this.amount = amount;
        }
        
        @Override
        public String toString() {
            return "ID: " + eventId + " | Type: " + eventType + " | Date: " + transactionDate 
                   + " | Account: " + accountInfo + " | Amount: $" + String.format("%.2f", amount);
        }
    }

