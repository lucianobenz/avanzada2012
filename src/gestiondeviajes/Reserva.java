/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeviajes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Luciano HP
 */
@Entity
public class Reserva implements Serializable {
    @Id
    private int idreserva;
    @OneToMany
    private List<Pasajero> pasajero;
    @OneToOne
    private Conductor unConductor;
    @OneToMany
    private List<Empleado> empleado;
    @OneToOne
    private List<Embarcacion> embarcacion;
    @Basic
    private double entrega;
    @Basic
    private double precio;
    @Basic
    private String fechaReserva;
    @Basic
    private String fechaTransaccion;
    @OneToOne
    private ServicioEspecial unServicioE;
    
public Reserva(){ 
}

public Reserva(int idreserva,List<Pasajero> pasajero,Conductor unConductor,List<Empleado> empleado,List<Embarcacion>  embarcacion, double entrega, double precio, String fechaReserva, String fechaTransaccion, ServicioEspecial unServicioE){
    
    this.idreserva=idreserva;
    this.pasajero=pasajero;
    this.unConductor= unConductor;
    this.empleado=empleado;
    this.embarcacion=embarcacion;
    this.entrega = entrega;
    this.precio = precio;
    this.fechaReserva = fechaReserva;
    this.fechaReserva= fechaReserva;
    this.unServicioE=unServicioE;
    
  }

    public List<Embarcacion> getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(List<Embarcacion> embarcacion) {
        this.embarcacion = embarcacion;
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public double getEntrega() {
        return entrega;
    }

    public void setEntrega(double entrega) {
        this.entrega = entrega;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(String fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public List<Pasajero> getPasajero() {
        return pasajero;
    }

    public void setPasajero(List<Pasajero> pasajero) {
        this.pasajero = pasajero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Conductor getUnConductor() {
        return unConductor;
    }

    public void setUnConductor(Conductor unConductor) {
        this.unConductor = unConductor;
    }

    public ServicioEspecial getUnServicioE() {
        return unServicioE;
    }

    public void setUnServicioE(ServicioEspecial unServicioE) {
        this.unServicioE = unServicioE;
    }

    



}
