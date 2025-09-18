/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author azuce
 */
public class Bank {
    private String codeBank;
    private String nameBank;
    private String location;
    
    public Bank(String codeBank, String nameBank, String location) {
        this.codeBank = codeBank;
        this.nameBank = nameBank;
        this.location = location;
    }
    
    public Bank(){
        
    }

    public String getCodeBank() {
        return codeBank;
    }

    public void setCodeBank(String codeBank) {
        this.codeBank = codeBank;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    @Override
    public String toString() {
        return "Bank: " + nameBank + " (Code: " + codeBank + ", location: " + location + ")";
    }


}
