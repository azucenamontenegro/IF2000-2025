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
public class Juego {
        Tablero tablero;
    char turnoActual; // 'R' o 'N'
    Scanner scan;
    
    // Constructor: prepara el juego
    public Juego() {
        tablero = new Tablero();
        turnoActual = 'R'; // Las rojas empiezan
        scan = new Scanner(System.in);
    }
    
    // Método principal que inicia el juego
    public void iniciar() {
        System.out.println("JUEGO DE DAMAS");
        System.out.println("R = Fichas Rojas"
                +"\nN = Fichas Negras"
                +"\nLas rojas mueven hacia abajo, las negras hacia arriba");
        
        while (true) {
            
            tablero.ver();
            
            System.out.println("\n Turno de las fichas " + 
                             (turnoActual == 'R' ? "ROJAS" : "NEGRAS"));
            
            System.out.print("Ingresa fila de origen (0-7): ");
            int filaOrigen = scan.nextInt();
            
            System.out.print("Ingresa columna de origen (0-7): ");
            int colOrigen = scan.nextInt();
            
            System.out.print("Ingresa fila de destino (0-7): ");
            int filaDestino = scan.nextInt();
            
            System.out.print("Ingresa columna de destino (0-7): ");
            int colDestino = scan.nextInt();
            
            if (tablero.movimientoValido(filaOrigen, colOrigen, 
                                          filaDestino, colDestino, 
                                          turnoActual)) {
                tablero.moverFicha(filaOrigen, colOrigen, filaDestino, colDestino);
                System.out.println("Movimiento exitoso");
                
                cambiarTurno();
            } else {
                System.out.println("Error");
            }
        }
    }
    
    private void cambiarTurno() {
        if (turnoActual == 'R') {
            turnoActual = 'N';
        } else {
            turnoActual = 'R';
        }
    }
}
