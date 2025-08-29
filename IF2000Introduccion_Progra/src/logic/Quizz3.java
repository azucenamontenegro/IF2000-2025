/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author azuce
 */
public class Quizz3 {
    public void quizz(int a) {
    if (a <= 0) {
            System.out.println("El tamaño debe ser mayor a 0");
            return;
        }
        if (a == 1) {
            System.out.println("*");
            return;
        }    
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < a; j++) {
            if (i == 0 || i == a - 1 || j == 0 || j == a - 1) {
                System.out.print("* ");
            }else if (i == a / 2 && j == a / 2) {
                    System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    }
}
