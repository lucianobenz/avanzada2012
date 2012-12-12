/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeviajes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 *
 * @author Luciano HP
 */
@Entity
public class Pasajero extends Persona implements Serializable {
    @Basic
    private String nacionalidad;
    
    
     public Pasajero(){
    }
    
    public Pasajero(String nacionalidad, String nombre, String apellido, int edad, String direccion, String telefono, String dni){
        super(nombre, apellido, edad, direccion, telefono, dni);
        this.nacionalidad = nacionalidad;    
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
//    public Pasajero registrar(){
//    
//        
//        
//    
//    }
    
}
