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
public class Cancion implements Serializable{
    private  String Titulo, Papa;
    private double Duracion;

    public Cancion() {
    }

    public Cancion(String Titulo, String Papa, double Duracion) {
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

    public double getDuracion() {
        return Duracion;
    }

    public void setDuracion(double Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return Papa+" - "+ Titulo + " - " + Duracion ;
    }
    
    
}
