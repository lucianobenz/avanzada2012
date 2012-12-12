/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeviajes;

import java.io.Serializable;
import java.util.Iterator;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Luciano HP
 */
@Entity
public class Embarcacion implements Serializable {
    @Id
    private int nroEmbarcacion;
    @Basic
    private String nombre;
    @Basic
    private String modelo;
    @Basic
    private String marca;
    @Basic
    private int velMaxima;
    @Basic
    private int capacidad;
   
    public Embarcacion() {
        
    }
    
    public Embarcacion(int nroEmbarcacion, String nombre, String modelo, String marca, int velMaxima, int capacidad) {
        this.nroEmbarcacion= nroEmbarcacion;
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.velMaxima = velMaxima;
        this.capacidad = capacidad;
          
    }

    public int getNroEmbarcacion() {
        return nroEmbarcacion;
    }

    public void setNroEmbarcacion(int nroEmbarcacion) {
        this.nroEmbarcacion = nroEmbarcacion;
    }
    

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }   
    

    
        
      
        
    }


