/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
    
    int numeros[] = new int[3];
    
    public void ejercicio4(){
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 3 números enteros:");
        for (int i = 0; i < 3; i++) {
            numeros[i] = scan.nextInt();
        }
        scan.close();
    }
    
    public void ordenar() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }
    public void ver() {
        for (int i = 0; i < 3; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
    
    public void ejercicio5(){
        Scanner scan= new Scanner (System.in);
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        System.out.println("Ingrese el primer numero");
        numero1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = scan.nextInt();
        
        if(numero1 == numero2){
            resultado = numero1*numero2;
            System.out.println("Primer numero: " +numero1
                    +"\nSegundo numero: "+ numero2 
                    +"\nOperacion: " + numero1 + "*" + numero2
                    +"\nResultado final: "+ resultado);
        }else if(numero1 > numero2){
            resultado = numero1-numero2;
            System.out.println("Primer numero: " +numero1
                    +"\nSegundo numero: "+ numero2 
                    +"\nOperacion: " + numero1 + "-" + numero2
                    +"\nResultado final: "+ resultado);
        }else {
            resultado = numero1 + numero2;
            System.out.println("Primer numero: " +numero1
                    +"\nSegundo numero: "+ numero2 
                    +"\nOperacion: " + numero1 + "+" + numero2
                    +"\nResultado final: "+ resultado);
        }
        
    }
   
    public void ejercicio6(){
        Scanner scan = new Scanner(System.in);
        boolean hayNota10 = false;
        int nota;
        int contador = 0;
        
        System.out.println("Ingrese notas (0-10). Termine con -1:");
        
        while(true) {
            System.out.print("Nota " + (contador + 1) + ": ");
            nota = scan.nextInt();
            if(nota == -1){
                break;
            }
            if(nota<0 || nota>10){
                System.out.println("Las notas deben de ser entre 0 y 10");
                continue;
            }
            if(nota==10){
                hayNota10 = true;
            }
            contador++;
        }
        System.out.println("Total de notas válidas ingresadas: " + contador);
        
        if (hayNota10) {
            System.out.println("¡Sí hubo al menos una nota con valor 10!");
        } else {
            System.out.println("No hubo ninguna nota con valor 10.");
        }
        
        scan.close();
        
    }
    

    public void ejercicio7(){
        int numeroPulsaciones = 0;
        int edad = 0;
  
    
    int opcion = 0;
    String menu = "";
                  menu+="\n1.Femenino";
                  menu+="\n2.Maculino"; 
                   
           
   
     opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
   
   
   switch (opcion){
     case 1://Femenino 
         edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
         numeroPulsaciones = (220 - edad)/10;
         JOptionPane.showMessageDialog(null,"Numero de pulsasiones: "+numeroPulsaciones
                  +"\nGenero: Femenino"
                  +"\nEdad: "+ edad);
     break;
      case 2://Masculino
          edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
          numeroPulsaciones = (210 - edad)/10;
          JOptionPane.showMessageDialog(null,"Numero de pulsasiones: "+numeroPulsaciones
                  +"\nGenero: Masculino"
                  +"\nEdad: "+ edad);
          
    break;      
    default:
        JOptionPane.showMessageDialog(null,"Debe ingresar un número entre 1 y 2");
        break;
        
        }
      }
    
    public void ejercicio8(){
        Scanner scan= new Scanner (System.in);
        int years = 0;
        System.out.println("Ingrese los años que lleva en la empresa");
        years = scan.nextInt();
        
        if(years>10){
            System.out.println("Se le aplica un 20%");
        } else if(years>5){
            System.out.println("Se le aplica un 15%");
        } else if(years>2){
            System.out.println("Se le aplica un 10%");
        } else  if(years>1){
            System.out.println("Se le aplica un 7%");
        } else {
            System.out.println("Se le aplica un 5%");
        }
        
    }
    public void ejercicio9(){
         Scanner scan = new Scanner(System.in);

        System.out.print("Digite un número: ");
        int N = scan.nextInt();

        boolean esPrimo = true;

        if (N < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(N + " es un número primo.");
        } else {
            System.out.println(N + " NO es un número primo.");

    }
    }
      
   public void ejercicio10(){
       Scanner scan = new Scanner(System.in);

        final int precioUnitario = 11000;

        System.out.print("Digite la cantidad de computadoras: ");
        int cantidad = scan.nextInt();

        double precioSinDescuento = cantidad * precioUnitario;
        double descuento;

        if (cantidad < 5) {
            descuento = 0.10;
        } else if (cantidad < 10) {
            descuento = 0.20;
        } else {
            descuento = 0.40;
        }

        double montoDescuento = precioSinDescuento * descuento;
        double precioFinal = precioSinDescuento - montoDescuento;

        System.out.println("Cantidad de computadoras: " + cantidad);
        System.out.println("Precio sin descuento: $" + precioSinDescuento);
        System.out.println("Monto descontado: $" + montoDescuento);
        System.out.println("Total a pagar: $" + precioFinal);

   }
    public void ejercicio11(){
         Scanner scan = new Scanner(System.in);

        System.out.print("Digite un número: ");
        int N = scan.nextInt();

        System.out.println("Números primos entre 2 y " + N + ":");

        for (int num = 2; num <= N; num++) {
            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.print(num + " ");
            }

    }
    }
    
  public void ejercicio12() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite la base del triángulo: ");
    double base = scan.nextDouble();

    System.out.print("Digite la altura del triángulo: ");
    double altura = scan.nextDouble();

    double area = (base * altura) / 2;

      System.out.println("El area del triangulo es: "+area);
  }
    
    
} 