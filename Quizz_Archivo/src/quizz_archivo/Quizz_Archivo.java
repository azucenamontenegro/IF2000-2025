/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizz_archivo;
import Domain.Archivo;
import Domain.Datos;
import Domain.Persona;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

        

/**
 *
 * @author azuce
 */
public class Quizz_Archivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Datos datos = new Datos(scan);
        Archivo archivo = new Archivo("personas.txt");
        
        System.out.println("Regristro");
        
        String nombre = datos.leerNoVacio("Nombre completo: ");
        String id = datos.leerNoVacio("Identificacion: ");
        int edad = datos.leerEnteroPositivo("Edad: ");
        String correo = datos.leerEmailValido("Correo electronico: ");
        String telefono = datos.leerTelefonoValido("Telefono: ");
        LocalDateTime fechaRegistro = LocalDateTime.now();

        Persona persona = new Persona(nombre, id, edad, correo, telefono);
        
        try {
            archivo.guardarPersona(persona);
            System.out.println("\nRegistro guardado en " + archivo.getNombreArchivo());
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
        
        scan.close();
    
    }
    
}
