/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author azuce
 */
public class Tablero {
         int filas = 8;
     int columnas = 8;
    char tablero[][];
   
    public Tablero() {
    tablero = new char[8][8];
    inicializarTablero();
    fichasIniciales();
}
    private void inicializarTablero() {
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            tablero[i][j] = ' ';
        }
    }
}
    private void fichasIniciales() {
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 8; j++) {
            tablero[i][j] = 'N';
        }
    }
    
    for (int i = 6; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            tablero[i][j] = 'R';
        }
    }
}
    public void ver() {
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print("(" + tablero[i][j] + ")");
        }
        System.out.println("");
    }
}
    public char obtenerPosicion(int fila, int columna) {
        return tablero[fila][columna];
    }
    
    public boolean movimientoValido(int filaOrigen, int colOrigen, 
                                       int filaDestino, int colDestino, 
                                       char colorTurno) {
        
        if (filaOrigen < 0 || filaOrigen >= 8 || colOrigen < 0 || colOrigen >= 8 ||
            filaDestino < 0 || filaDestino >= 8 || colDestino < 0 || colDestino >= 8) {
            System.out.println("Error");
            return false;
        }
        
        if (tablero[filaOrigen][colOrigen] == ' ') {
            System.out.println("No hay ficha en la posición de origen");
            return false;
        }
        
        if (tablero[filaOrigen][colOrigen] != colorTurno) {
            System.out.println("No es tu turno");
            return false;
        }
        
         if (tablero[filaDestino][colDestino] != ' ') {
            System.out.println("La posicion destino está ocupada");
            return false;
        }
        
       
        
        return true; 
    }
    public void moverFicha(int filaOrigen, int colOrigen, 
                          int filaDestino, int colDestino) {
        
        tablero[filaDestino][colDestino] = tablero[filaOrigen][colOrigen];
       
        tablero[filaOrigen][colOrigen] = ' ';
    }

}
