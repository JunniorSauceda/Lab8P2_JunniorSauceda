/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

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
public class adminPais {
    private ArrayList<Pais> paises=new ArrayList<>();
    private File Archivo;

    public adminPais(String path) {
        this.Archivo = new File(path);
        
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    public File getArchivo() {
        return Archivo;
    }

    public void setArchivo(File Archivo) {
        this.Archivo = Archivo;
    }

    @Override
    public String toString() {
        return paises.toString();
    }
    
    public void cargarArchivo() {
        try {            
            paises = new ArrayList();
            Pais temp;
            if (Archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(Archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Pais) objeto.readObject()) != null) {
                        paises.add(temp);
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
            for (Pais t : paises) {
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
