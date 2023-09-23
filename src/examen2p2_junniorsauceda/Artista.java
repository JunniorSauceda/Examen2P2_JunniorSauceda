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
public class Artista extends Usuario implements Serializable{
     private String NomAutista;
     private ArrayList<Cancion> canciones=new ArrayList<>();
     private ArrayList<Album> albumes=new ArrayList<>();

    public Artista() {
        super();
    }

    public Artista(String NomAutista, String UserName, String Password, int Edad) {
        super(UserName, Password, Edad);
        this.NomAutista = NomAutista;
    }

   

    public String getNomAutista() {
        return NomAutista;
    }

    public void setNomAutista(String NomAutista) {
        this.NomAutista = NomAutista;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return  NomAutista +" - " + super.toString()  ;
    }
    
     
     
}
