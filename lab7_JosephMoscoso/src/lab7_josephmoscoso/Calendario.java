/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josephmoscoso;

import java.io.Serializable;

/**
 *
 * @author Joseph
 */
public class Calendario implements Serializable {

    private String fecha;
    private Usuarios persona;
    private String lugar;
    private static final long SerialVersionUTD = 777L;

    public Calendario() {
    }

    public Calendario(String fecha, Usuarios persona, String lugar) {
        this.fecha = fecha;
        this.persona = persona;
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuarios getPersona() {
        return persona;
    }

    public void setPersona(Usuarios persona) {
        this.persona = persona;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return persona.getNombre();
    }

}
