/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.util.Scanner;

/**
 *
 * @author azuce
 */
public class Datos {
    private Scanner scan = new Scanner(System.in);

     public Datos(Scanner scan) {
        this.scan = scan;
    }
    
    public String leerNoVacio(String prompt) {
    String dato;
    do { 
        System.out.print(prompt);
        dato = scan.nextLine().trim();
        if (dato.isEmpty()) {
            System.out.println("No puede estar vacio. Intente de nuevo.");
        }
    } while (dato.isEmpty()); 
    return dato;
}
    
    public int leerEnteroPositivo(String prompt) {
        int numero = -1;
        while (numero <= 0) {
            System.out.print(prompt);
            try {
                numero = Integer.parseInt(scan.nextLine().trim());
                if (numero <= 0) {
                    System.out.println("Debe ser un numero positivo");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingresar un numero valido");
            }
        }
        return numero;
    }
    
    public String leerEmailValido(String prompt) {
    System.out.print(prompt);
    String email = scan.nextLine().trim();

    boolean tieneArroba = false;

    for (int i = 0; i < email.length(); i++) {
        if (email.charAt(i) == '@') {
            tieneArroba = true;
            break; 
        }
    }

    if (!tieneArroba) {
        System.out.println("El correo debe contener @");
    }

    return email;
}
    
    public String leerTelefonoValido(String prompt) {
    System.out.print(prompt);
    String telefono = scan.nextLine().trim();

    if (!validarTelefono(telefono)) {
        System.out.println("Error: El teléfono debe tener solo dígitos y al menos 8 caracteres.");
    }

    return telefono;
}

    private boolean validarTelefono(String telefono) {
        return telefono.matches("\\d{8,}");//No entendi para que sirve pero funciona
    }
    
    
    
}
