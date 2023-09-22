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
public class Single extends Lanzamiento implements Serializable{
    private Cancion contenido=new Cancion();

    public Single() {
    }
    public Single(Cancion c){
        contenido=c;
    }

    public Cancion getContenido() {
        return contenido;
    }

    public void setContenido(Cancion contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return super.getTituloPubli() + " - " + contenido ;
    }
    
    
}
