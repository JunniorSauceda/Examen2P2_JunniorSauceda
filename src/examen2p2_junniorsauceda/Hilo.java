/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_junniorsauceda;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Junnior Sauceda
 */
public class Hilo extends Thread{
    private JProgressBar jp;
    private boolean vive;
    private double duracion;

    public Hilo(JProgressBar jp, boolean vive, double duracion) {
        this.jp = jp;
        this.vive = vive;
        this.duracion = duracion;
        double s=jp.getMaximum()*duracion;
        jp.setMaximum((int)s);
    }

    public Hilo() {
    }

    public JProgressBar getJp() {
        return jp;
    }

    public void setJp(JProgressBar jp) {
        this.jp = jp;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    
    
    
    @Override
    public void run(){
        
        
        while (vive) {            
            if(jp.getValue()>=100){
                jp.setValue(0);
                vive=false;
                jp.setMaximum(60);
            }
            else{
               jp.setValue(jp.getValue()+1);
               
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
