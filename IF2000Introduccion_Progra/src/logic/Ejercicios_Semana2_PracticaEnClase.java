/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author azuce
 */
public class Ejercicios_Semana2_PracticaEnClase {
    public void ejercicioA(int cara) {
    for (int i = 0; i < cara; i++) {
        for (int j = 0; j < cara; j++) {
            if (i == 0 || i == cara - 1 || j == 0 || j == cara - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
  
    
 public void ejercicioB(int cara){
     int punto = 0;
     for (int i = 0; i < cara; i++) {
         punto =i;
         for (int j = 0; j < cara; j++) {  
             if(punto<j){
                 System.out.print("*");
             }  
             }
         System.out.println("");
         }
     }
 
 public void ejercicioC(int cara){
    for (int i = cara; i > 0; i--) {
        
        for (int e = 0; e < (cara - i); e++) {
            System.out.print(" ");
        }
        
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println(""); 

    }
 }
 
 int arreglo[] = new int[10];
    
    public void ejercicioD() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            arreglo[i] = scan.nextInt();
        }
        scan.close();
    }
    
    public void ordenar() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    public void ver() {
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
    
    int arreglos[] = new int[100]; 
    
    public void ejercicioE(){
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            arreglos[i] = rand.nextInt(1000);
        }
    }
    
    public void ordenarE() {
        for (int i = 0; i < 99; i++) {
            for (int j = 0; j < 99 - i; j++) {
                if (arreglos[j] < arreglos[j + 1]) {
                    int temp = arreglos[j];
                    arreglos[j] = arreglos[j + 1];
                    arreglos[j + 1] = temp;
                }
            }
        }
    }
    public void verE() {
        System.out.println("\nArreglo ordenado decendentemente");
        for (int i = 0; i < 100; i++) {
            System.out.print(arreglos[i] + " ");
        }
        System.out.println();
    }
        
    char[][] matriz = new char [8][8];
    
    public void ejercicioF(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if((i + j) % 2 == 1) { 
                if (i <= 2) {
                    matriz[i][j]='N';
                }else if(i>=5){
                    matriz[i][j]='R';
                }
                }else{
                    matriz[i][j]=' ';
                }
            }
        }
    }
    
    public void mostrarF(){
        System.out.print(" ");
        for (int columna = 1; columna <= 8; columna++) {
            System.out.print(columna+" ");
        }
        System.out.println();
        
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        for (int i = 0; i < 8; i++) {
            System.out.print(letras[i]+" ");
            for (int j = 0; j < 8; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        }
   
    }
   


