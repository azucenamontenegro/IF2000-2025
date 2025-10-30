/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author azuce
 */
public class ClaseFile {
    public static void main(String[] args) {
        
        File archivo = new File("prueba.txt");
        
        try{
        if(archivo.createNewFile()){
            System.out.println("El archivo ha sido creado con exito");
        }else{
            System.out.println("Ya existe el archivo - ocurrio un error");
        }
        
    }catch(IOException excepcion){
        excepcion.printStackTrace(System.out);
    }
    }
}
