/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_junniorsauceda;

/**
 *
 * @author Junnior Sauceda
 */
public class Cancion {
    private  String Titulo, Papa;
    private int Duracion;

    public Cancion() {
    }

    public Cancion(String Titulo, String Papa, int Duracion) {
        this.Titulo = Titulo;
        this.Papa = Papa;
        this.Duracion = Duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getPapa() {
        return Papa;
    }

    public void setPapa(String Papa) {
        this.Papa = Papa;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return Papa+" - "+ Titulo + " - " + Duracion ;
    }
    
    
}
