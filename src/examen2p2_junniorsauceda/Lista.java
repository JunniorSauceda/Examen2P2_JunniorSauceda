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
public class Lista implements Serializable{
    private String Nombre;
    private int Likes;
    private ArrayList<Cancion> canciones=new ArrayList<>();

    public Lista() {
    }

    public Lista(String Nombre, int Likes) {
        this.Nombre = Nombre;
        this.Likes = Likes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int Likes) {
        this.Likes = Likes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    public void setCancion(Cancion c){
        canciones.add(c);
    }

    @Override
    public String toString() {
        return Nombre + ", Likes=" + Likes ;
    }
    
}
