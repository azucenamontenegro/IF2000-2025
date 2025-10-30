/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author azuce
 */
public class Ficha {
    char color;    

    public Ficha() {
    }

    public Ficha( char color) {
       
        this.color = color;
    }

   

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "fichas{" + ", color=" + color + '}';
    }

    public static void main(String[] args) {
        
    
Ficha fi = new Ficha('R');
        System.out.println(fi);
            }

}
