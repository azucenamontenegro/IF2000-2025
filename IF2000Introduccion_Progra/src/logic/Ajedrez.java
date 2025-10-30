/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author azuce
 */
public class Ajedrez {
    
        String[][] tablero;

        String[] negras = {"TN", "CN", "AN", "RN", "KN", "AN", "CN", "TN"};
        String[] blancas = {"TB", "CB", "AB", "RB", "KB", "AB", "CB", "TB"};

        public Ajedrez() {
        tablero = new String[8][8];
        inicializarTablero();
    }
        private void inicializarTablero(){
        tablero[0] = negras;
        for (int i = 0; i < 8; i++) {
            tablero[1][i] = "PN"; 
        }

        tablero[7] = blancas; 
        for (int i = 0; i < 8; i++) {
            tablero[6][i] = "PB"; 
        }

        for (int fila = 2; fila <= 5; fila++) {
            for (int col = 0; col < 8; col++) {
                tablero[fila][col] = "--"; 
            }
        }
        }

        public void mostrarTablero() {
        for (int fila = 0; fila < 8; fila++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(tablero[fila][col] + " ");
            }
            System.out.println();
        }
    }
}



