/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_junniorsauceda;

import java.util.Date;

/**
 *
 * @author Junnior Sauceda
 */
public class Lanzamiento {
    private String TituloPubli;
    private Date Lanzaamiento;
    private int Likes;

    public Lanzamiento() {
    }

    public String getTituloPubli() {
        return TituloPubli;
    }

    public void setTituloPubli(String TituloPubli) {
        this.TituloPubli = TituloPubli;
    }

    public Date getLanzaamiento() {
        return Lanzaamiento;
    }

    public void setLanzaamiento(Date Lanzaamiento) {
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
