/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_junniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Usuario {
    private String UserName, Password;
    private int Edad;

    public Usuario() {
    }

    public Usuario(String UserName, String Password, int Edad) {
        this.UserName = UserName;
        this.Password = Password;
        this.Edad = Edad;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return UserName+ " - "+Edad ;
    }
    
    
    
}
