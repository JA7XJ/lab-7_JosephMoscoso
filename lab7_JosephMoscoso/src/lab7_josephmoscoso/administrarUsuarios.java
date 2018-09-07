/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josephmoscoso;

import java.io.File;
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

    @Override
    public String toString() {
        return "administrarUsuarios{" + "listaUsuarios=" + listaUsuarios + ", archivo=" + archivo + '}';
    }
    
}
