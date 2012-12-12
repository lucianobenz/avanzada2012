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
public class Conductor extends Persona implements Serializable{
    @Basic
    private String correo;
    @Basic
    private String carnet;

    
    
    public Conductor(){
    
    }
    
    public Conductor(String correo, String carnet, String nombre, String apellido, int edad, String direccion, String telefono,String dni){
        super(nombre, apellido, edad, direccion, telefono, dni);
        this.correo = correo;   
        this.carnet=carnet;
     }
   
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
