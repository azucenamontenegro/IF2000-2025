/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Scanner;

/**
 *
 * @author azuce
 */
public class Ejercicios {
    public void ejercicio28(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la fecha día/mes/anno: ");
        String fecha = sc.nextLine();
        
        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anno = Integer.parseInt(partes[2]);
        
         String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
         
         if (mes < 1 || mes > 12) {
            System.out.println("El mes ingresado no es válido.");
        } else {
            String nombreMes = meses[mes - 1];
            // Mostrar la fecha en el nuevo formato
            System.out.println(dia + " de " + nombreMes + " del " + anno);
        }
    }
    
    public void ejercicio29(){
        
        
        
    }
    
    
}
