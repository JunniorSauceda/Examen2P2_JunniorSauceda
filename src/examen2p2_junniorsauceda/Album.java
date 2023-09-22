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
public class Album extends Lanzamiento implements Serializable{
    private ArrayList<Cancion> canciones=new ArrayList<>();
    private int cant;

    public Album(int cant, String TituloPubli, String Lanzaamiento, int Likes) {
        super(TituloPubli, Lanzaamiento, Likes);
        this.cant = cant;
    }

    

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setCancion(Cancion c){
        canciones.add(c);
    }
    
    @Override
    public String toString() {
        return super.getTituloPubli()+" - "+cant ;
    }
    
    
}
