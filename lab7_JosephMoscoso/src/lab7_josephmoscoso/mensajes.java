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
public class mensajes implements Serializable {

    private String mensaje;
    private String destino;
    private static final long SerialVersionUTD = 777L;

    public mensajes() {
    }

    public mensajes(String mensaje, String destino) {
        this.mensaje = mensaje;
        this.destino = destino;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return destino;
    }

}
