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
public class Lanzamiento implements Serializable{
    private String TituloPubli;
    private String Lanzaamiento;
    private int Likes;

    public Lanzamiento() {
    }

    public Lanzamiento(String TituloPubli, String Lanzaamiento, int Likes) {
        this.TituloPubli = TituloPubli;
        this.Lanzaamiento = Lanzaamiento;
        this.Likes = Likes;
    }
    
    

    public String getTituloPubli() {
        return TituloPubli;
    }

    public void setTituloPubli(String TituloPubli) {
        this.TituloPubli = TituloPubli;
    }

    public String getLanzaamiento() {
        return Lanzaamiento;
    }

    public void setLanzaamiento(String Lanzaamiento) {
        this.Lanzaamiento = Lanzaamiento;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int Likes) {
        this.Likes = Likes;
    }

    @Override
    public String toString() {
        return  TituloPubli + "- Likes=" + Likes + '}';
    }
    
}
