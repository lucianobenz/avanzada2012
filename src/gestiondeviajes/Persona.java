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
public class Persona implements Serializable {
    @Id
    private String dni;
    @Basic
    private String nombre;
    @Basic 
    private String apellido;
    @Basic
    private int edad;
    @Basic
    private String direccion;
    @Basic
    private String telefono;
    
    
    
 public Persona(){
     
 }
 
 public Persona(String nombre, String apellido, int edad, String direccion, String telefono, String dni){
     
     this.nombre = nombre;
     this.apellido = apellido;
     this.edad = edad;
     this.direccion = direccion;
     this.telefono = telefono;
     this.dni = dni;
     
 }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
         
         
}  

 