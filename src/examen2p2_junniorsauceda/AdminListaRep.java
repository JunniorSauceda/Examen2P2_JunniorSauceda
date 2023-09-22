/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_junniorsauceda;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Junnior Sauceda
 */
public class AdminListaRep {
    private ArrayList <Lista> Listas=new ArrayList<>();
    private File Archivo;

    public AdminListaRep() {
    }

    public AdminListaRep(String path) {
        this.Archivo = new File(path);
    }

    public ArrayList<Lista> getListas() {
        return Listas;
    }

    public void setListas(ArrayList<Lista> Listas) {
        this.Listas = Listas;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }
    public void setLista(Lista List){
        Listas.add(List);
    }
    
    @Override
    public String toString() {
        return "Listas=" + Listas + '}';
    }
    
    public void cargarArchivo() {
        try {            
            Listas = new ArrayList();
            Lista temp;
            if (Archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(Archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Lista) objeto.readObject()) != null) {
                        Listas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del Archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(Archivo);
            bw = new ObjectOutputStream(fw);
            for (Lista t : Listas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
