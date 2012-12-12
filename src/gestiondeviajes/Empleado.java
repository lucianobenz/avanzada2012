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
public class Empleado extends Persona implements Serializable{
    
    @Basic
    private String cargo;
    
    public Empleado() {
    }
    
    public Empleado(String cargo, String nombre, String apellido, int edad, String direccion, String telefono,String dni){
        super(nombre, apellido, edad, direccion, telefono, dni);
        this.cargo = cargo;    
    }
    
    public Empleado(String cargo){
        this.cargo = cargo;    
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getEmpleados(){
               
        return super.getNombre();
        
        
    }
    
}
