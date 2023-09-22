/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_junniorsauceda;

import java.io.Serializable;

/**
 *
 * @author Junnior Sauceda
 */
public class Artista extends Usuario implements Serializable{
     private String NomAutista;

    public Artista() {
        super();
    }

    public Artista(String NomAutista) {
        this.NomAutista = NomAutista;
    }

    public String getNomAutista() {
        return NomAutista;
    }

    public void setNomAutista(String NomAutista) {
        this.NomAutista = NomAutista;
    }

    @Override
    public String toString() {
        return  NomAutista +" - " + super.toString()  ;
    }
    
     
     
}
