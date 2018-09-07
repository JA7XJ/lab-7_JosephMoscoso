/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josephmoscoso;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class Usuarios implements Serializable {

    private String nombre;
    private int edad;
    private String sexo;
    private String usuario;
    private String contraseña;
    ArrayList intereses = new ArrayList();
    ArrayList<Usuarios> amigos = new ArrayList();
    ArrayList<Usuarios> interesados = new ArrayList();
    private String descripcion;
    ArrayList mensajes = new ArrayList();
    ArrayList<Usuarios> solicitudes = new ArrayList();
    ArrayList<Usuarios> bloqueados = new ArrayList();
    ArrayList<Calendario> citas = new ArrayList();
    private String tipo;
    private static final long SerialVersionUTD = 777L;

    public Usuarios() {
    }

    public Usuarios(String nombre, int edad, String sexo, String usuario, String contraseña, String descripcion, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList intereses) {
        this.intereses = intereses;
    }

    public ArrayList<Usuarios> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuarios> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Usuarios> getInteresados() {
        return interesados;
    }

    public void setInteresados(ArrayList<Usuarios> interesados) {
        this.interesados = interesados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList mensajes) {
        this.mensajes = mensajes;
    }

    public ArrayList<Usuarios> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Usuarios> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public ArrayList<Usuarios> getBloqueados() {
        return bloqueados;
    }

    public void setBloqueados(ArrayList<Usuarios> bloqueados) {
        this.bloqueados = bloqueados;
    }

    public ArrayList<Calendario> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Calendario> citas) {
        this.citas = citas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", intereses=" + intereses + ", amigos=" + amigos + ", interesados=" + interesados + ", descripcion=" + descripcion + ", mensajes=" + mensajes + ", solicitudes=" + solicitudes + ", bloqueados=" + bloqueados + ", citas=" + citas + ", tipo=" + tipo + '}';
    }

}
