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
    private ArrayList<Cancion> Megusta=new ArrayList<>();
    private ArrayList<ArrayList> listas=new ArrayList<>();

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

    public ArrayList<Cancion> getMegusta() {
        return Megusta;
    }

    public void setMegusta(ArrayList<Cancion> Megusta) {
        this.Megusta = Megusta;
    }

    public ArrayList<ArrayList> getListas() {
        return listas;
    }

    public void setListas(ArrayList<ArrayList> listas) {
        this.listas = listas;
    }
    
    public void setMEgusta(Cancion c){
        Megusta.add(c);
    }
    
    public void setFavoritas(Cancion c){
        Favoritas.add(c);
    }
    public void setCancion(ArrayList c){
        listas.add(c);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
    
}
