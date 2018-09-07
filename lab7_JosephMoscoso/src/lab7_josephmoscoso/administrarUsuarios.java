/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josephmoscoso;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class administrarUsuarios {

    ArrayList<Usuarios> listaUsuarios = new ArrayList();
    private File archivo;

    public administrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuarios> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void cargarArchivo() {
        try {
            listaUsuarios = new ArrayList();
            Usuarios temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuarios) objeto.readObject()) != null) {
                        listaUsuarios.add(temp);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuarios t : listaUsuarios) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

}
