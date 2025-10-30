/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author azuce
 */
public class ArchivoTexto {
     File archivo = new File("archivo.txt");
        private void crearArchivoDeTexto(){
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
 
    private void eliminarArchivoDeTexto(){
        
        
        if(archivo.delete()){
            System.out.println("El archivo eliminado con exito");
        }else{
            System.out.println("Error al eliminar archivo");
        }
       
    }  
    
    //Metodo para escribir en el archivo
    private void escribirAlArchivoDeTexto(){
        try{
            FileWriter escritura = new FileWriter(archivo);
            escritura.write("Saludos");
            escritura.close();
            System.out.println("Texto añadido");
        }catch(IOException excepcion){
            excepcion.printStackTrace(System.out);
        }
        
    }
    
    //Metodo para leer un archivo de texto
    private void leerArchivoDeTexto(){
        String contenido;
        
    }
        try{
            FileReader lector =new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);
            String contenido = lectura.readLine();
            System.out.println(contenido);
    }catch(IOException excepcion){
            excepcion.printStackTrace(System.out);
        }
    
    
    
    public static void main(String[] args) {
        ArchivoTexto archivoTexto = new ArchivoTexto();
        archivoTexto.crearArchivoDeTexto();
        //archivoTexto.eliminarArchivoDeTexto();
        
        archivoTexto.escribirAlArchivoDeTexto();
        archivoTexto.leerArchivoDeTexto();
    }
    
}
