/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_junniorsauceda;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Junnior Sauceda
 */
public class Cliente extends Usuario implements Serializable{
    
    private ArrayList<Cancion> Favoritas=new ArrayList<>();
    private ArrayList<Lista> Megusta=new ArrayList<>();
    private ArrayList<Lista> listas=new ArrayList<>();

    public Cliente() {
        super();
    }

    public Cliente(String UserName, String Password, int Edad) {
        super(UserName, Password, Edad);
    }

    public ArrayList<Cancion> getFavoritas() {
        return Favoritas;
    }

    public void setFavoritas(ArrayList<Cancion> Favoritas) {
        this.Favoritas = Favoritas;
    }

    public ArrayList<Lista> getMegusta() {
        return Megusta;
    }

    public void setMegusta(ArrayList<Lista> Megusta) {
        this.Megusta = Megusta;
    }

    public ArrayList<Lista> getListas() {
        return listas;
    }

    public void setListas(ArrayList<Lista> listas) {
        this.listas = listas;
    }
    
    
    public void setFavoritas(Cancion c){
        Favoritas.add(c);
    }
    
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
    
}
