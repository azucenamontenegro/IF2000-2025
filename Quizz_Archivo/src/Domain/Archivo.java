/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.io.*;

/**
 *
 * @author azuce
 */
public class Archivo {
    
    private String nombreArchivo;

    public Archivo(String archivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
     public void guardarPersona(Persona persona) throws IOException {
        String linea = persona.toLineaArchivo();
        guardarLinea(linea);
    }
    
      private void guardarLinea(String linea) throws IOException {
        try (FileWriter fw = new FileWriter(nombreArchivo, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {
            
            pw.println(linea);
        }
    }
     
       public boolean archivoExiste() {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }
    
  
}
