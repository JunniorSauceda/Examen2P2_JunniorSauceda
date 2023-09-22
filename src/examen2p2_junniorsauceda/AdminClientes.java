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
public class AdminClientes {
    private ArrayList<Cliente> clientes=new ArrayList<>();
    private File Archivo;

    public AdminClientes() {
    }

    public AdminClientes(String path) {
        this.Archivo = new File(path);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }
    public void setCliente(Cliente C){
        clientes.add(C);
    }

    @Override
    public String toString() {
        return "clientes=" + clientes + '}';
    }
    public void cargarArchivo() {
        try {            
            clientes = new ArrayList();
            Cliente temp;
            if (Archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(Archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Cliente) objeto.readObject()) != null) {
                        clientes.add(temp);
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
            for (Cliente t : clientes) {
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
