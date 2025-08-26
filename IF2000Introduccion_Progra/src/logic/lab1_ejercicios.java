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
public class lab1_ejercicios {
    public void ejercicio1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = scan.nextInt();
        if (numero % 2 == 0) { 
            System.out.println("el numero "+ numero +" es par");
        }else{
            System.out.println("el numero "+ numero +" es impar");
        }
        scan.close();
    }
    
    public void ejercicio2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int numero = scan.nextInt();
        int valorAbsoluto;
        
        if(numero<0){
            valorAbsoluto = numero * -1;
        }else{
            valorAbsoluto = numero;
        }
        System.out.println("el valor absoluto de "+ numero + " es: " + valorAbsoluto);
        scan.close();
    }
    
    public void ejercicio3(){
    int numeroActual = 3;
    int sumaTotal = 0;
    String listaNumeros = "";
            while(numeroActual<=99){
                listaNumeros = listaNumeros + numeroActual + " ";
                sumaTotal = sumaTotal + numeroActual;
                numeroActual = numeroActual + 3;
            }
            System.out.println("Numeros: "+listaNumeros + "\nSuma: "+sumaTotal);
            }
    
    
}
