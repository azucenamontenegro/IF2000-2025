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
public class lab2_ejercicios {
    public void ejercicio13(){
        int suma = 0;

        for (int i = 2; i <= 1000; i += 2) {
            suma += i;
        }

        System.out.println("La suma de los numeros pares entre 2 y 1000 es: " + suma);
    }
    
    public void ejercicio14(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en grados Celsius");
        double celsius = scan.nextDouble();
        
        double fahrenheit = (9/5)*celsius + 32;
        
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

        scan.close();
    }
    public void ejercicio15(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la base X ");
        int x = scan.nextInt();

        System.out.print("Ingrese el exponente N ");
        int n = scan.nextInt();

        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= x;
        }

        System.out.println(x + " elevado a la " + n + " es: " + resultado);

        scan.close();
    }
    
    public void ejercicio16(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese un numero del 1 al 12 ");
        int numero = scan.nextInt();

        String mes;

        switch (numero) {
            case 1:  
                mes = "Enero"; 
                break;
            case 2:  
                mes = "Febrero"; 
                break;
            case 3:  
                mes = "Marzo"; 
                break;
            case 4:  
                mes = "Abril"; 
                break;
            case 5:  
                mes = "Mayo"; 
                break;
            case 6:  
                mes = "Junio"; 
                break;
            case 7:  
                mes = "Julio"; 
                break;
            case 8:  
                mes = "Agosto"; 
                break;
            case 9:  
                mes = "Septiembre"; 
                break;
            case 10: 
                mes = "Octubre"; 
                break;
            case 11: 
                mes = "Noviembre"; 
                break;
            case 12:
                mes = "Diciembre"; 
                break;
            default: 
                mes = "Numero invalido (debe estar entre 1 y 12)";
        }

        System.out.println("El mes correspondiente es: " + mes);

        scan.close();
    }
    
    public void ejercicio17(){
        
    }
    
    public void ejercicio18(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite el lado a: ");
        double a = scan.nextDouble();
        System.out.print("Digite el lado b: ");
        double b = scan.nextDouble();
        System.out.print("Digite el lado c: ");
        double c = scan.nextDouble();

        double p = (a + b + c) / 2;

        // Fórmula de Herón
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("El area del triangulo es: " + area);

        scan.close();
    }
    
    public void ejercicio19(){
        Scanner scan = new Scanner(System.in);

        // Leer valores de A y B
        System.out.print("Ingrese el valor de A: ");
        int a = scan.nextInt();

        System.out.print("Ingrese el valor de B: ");
        int b = scan.nextInt();

        System.out.println("Valores iniciales de A: " + a + ", B: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores intercambiados de A: " + a + ", B: " + b);

        scan.close();
    }
    
    public void ejercicio20(){
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Ingrese X0: ");
        double x0 = scan.nextDouble();
        
        System.out.print("Ingrese X1: ");
        double x1 = scan.nextDouble();
        
        System.out.print("Ingrese Y0: ");
        double y0 = scan.nextDouble();
        
        System.out.print("Ingrese Y1: ");
        double y1 = scan.nextDouble();
        
        double m = (y0 - y1) / (x0 - x1);
        double b = y0 - (m * x0);
        
        System.out.println("La ecuacion de la recta es: y = " + m + "x + " + b);
        scan.close();
    }
    public void ejercicio21(){
        
        
    }
    
    public void ejercicio22(){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Cantidad de numeros que va a ingresar ");
        int n = scan.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese número " + i + ": ");
            double num = scan.nextDouble();
            suma += num;
        }

        double promedio = suma / n;

        System.out.println("El promedio de los numeros es: " + promedio);

        scan.close();
        
    }
    
    public void ejercicio23(){
        
         Scanner scan = new Scanner(System.in);

        int sumaPares = 0;
        int sumaImpares = 0;
        int sumaTotal = 0;
        int cantidadPares = 0; 
        int cantidadImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int num = scan.nextInt();

            sumaTotal += num;

            if (num % 2 == 0) {
                sumaPares += num;
                cantidadPares++;
            } else {
                sumaImpares += num;
                cantidadImpares++;
            }
        }
        
        System.out.println("Cantidad de numeros pares: " + cantidadPares
                +"\nCantidad de numeros impares: " + cantidadImpares
                +"\nSuma de numeros pares: " + sumaPares
                +"\nSuma de numeros impares: " + sumaImpares
                +"\nSuma total de todos los numeros: " + sumaTotal);
        
        scan.close();
        
    }
    
    public void ejercicio24(){
        
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                sumaImpares += i;
            }
        }

        System.out.println("La suma de los numeros pares entre 1 y 200 es: " + sumaPares
                +"\nLa suma de los numeros impares entre 1 y 200 es: " + sumaImpares);
     
    }
    
    public void ejercicio25(){
        
        
    }
    
    public void ejercicio26(){
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo N: ");
        int n = scan.nextInt();

        long factorial = 1;

        if (n == 0 || n == 1) {
            factorial = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
        }

        System.out.println("El factorial de " + n + " es: " + factorial);

        scan.close();
    }
    
    public void ejercicio27(){
        
      Scanner scan = new Scanner(System.in);

        int max = 0;

        System.out.print("Ingrese el numero 1: ");
        max = scan.nextInt();

        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int num = scan.nextInt();

            if (num > max) {
                max = num;
            }
        }

        System.out.println("El valor maximo de los 10 numeros ingresados es: " + max);

        scan.close();  
    }
}
