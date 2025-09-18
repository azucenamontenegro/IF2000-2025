/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if2000_lab3;

import domain.Client;
import domain.SavingAccount;
import domain.Binnacle;
import domain.Bank;
import domain.Sinpe;
import domain.TransactionLog;


        
/**
 *
 * @author azuce
 */
public class IF2000_lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear bancos
        Bank banco1 = new Bank("01", "Banco Uno", "San José");
        Bank banco2 = new Bank("02", "Banco Dos", "Alajuela");

        // Crear clientes
        Client cliente1 = new Client("Ana", "Ramírez", "101", "8888-4444", 28);
        Client cliente2 = new Client("Luis", "Mora", "102", "8777-1111", 34);

        // Crear cuentas de ahorro
        SavingAccount cuenta1 = new SavingAccount("2025-09-17", 12, 5.0f, "001", 12000.0, cliente1, banco1);
        SavingAccount cuenta2 = new SavingAccount("2025-09-16", 6, 4.5f, "002", 9500.0, cliente2, banco2);

        // Registro de transacciones
        TransactionLog registro = new TransactionLog();

        // Crear Sinpe
        Sinpe sinpeMovil = new Sinpe(registro);

        // Realizar transferencia
        sinpeMovil.transferMoney(cuenta1, cuenta2, 2000.0);
        
        // Verificar balances
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        // Registrar y mostrar historial de transacciones
        registro.showAllTransactions();
    }
}

       
//        Client client1 =
//                new Client("Pedro", "Perez", "1-1234-5678", "61236545",18);
//        
//        SavingAccount account1 = new SavingAccount("2025-09-04", 12, 5, "1000578906", 25000, client1);
//        
//        //Simulation of deposit of 3000colones in the account
//        account1.deposit(3000);
//        
//        System.out.println(account1.toString());
//        
//        System.out.println("\n\n\n----------------------------------------------");
//        System.out.println("whithdraw of money");
//        System.out.println("----------------------------------------------\n\n\n");
//        
//        account1.withdraw(16000);
//        
//        System.out.println(account1);
//        
//    }
//    
//    
//    
//    
//    
//    
//}
