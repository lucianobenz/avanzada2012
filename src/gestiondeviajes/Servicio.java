/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeviajes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Luciano HP
 */
@Entity
public class Servicio implements Serializable {
    @Id
    private int idServicio;
    @Basic
    private String hora;
    @Basic
    private String dia;
    @Basic
    private String embarcacion;
    @Basic
    private String pasajero;
    @Basic
    private double precio;
    
public Servicio(){
}

public Servicio(int idServicio,String hora, String dia, String embarcacion, String pasajero, double precio)
{
    this.idServicio=idServicio;
    this.hora = hora;
    this.dia = dia;
    this.embarcacion = embarcacion;
    this.pasajero = pasajero;
    this.precio = precio;
 
    
}

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }


    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(String embarcacion) {
        this.embarcacion = embarcacion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
  
    
    
}
