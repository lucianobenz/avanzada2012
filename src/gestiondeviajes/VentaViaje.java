/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeviajes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Luciano HP
 */
@Entity
public class VentaViaje implements Serializable {
    @Id
    private int id;
    @OneToOne
    private ServicioComun servicioComun;
    @OneToOne
    private Conductor conductor;
    @OneToOne
    private Embarcacion embarcacion;
    @OneToMany
    private Empleado empleados;
    @OneToOne
    private String fecha;
    @OneToOne
    private String hora;
    @OneToOne
    private Pasajero pasajeros;
    @Basic
    private double monto;
    @Basic
    private boolean bono;
    
    
    
    
public VentaViaje(){
}

public VentaViaje(int id,ServicioComun servicioComun,Embarcacion embarcacion, String fecha, String hora,Pasajero pasajeros, double monto, Conductor conductor, Empleado empleados, boolean bono){
  
    this.id=id;
    this.servicioComun=servicioComun;
    this.embarcacion = embarcacion;
    this.fecha=fecha;
    this.hora = hora;
    this.pasajeros=pasajeros;
    this.conductor = conductor;
    this.empleados = empleados;
    this.bono=bono;
    this.monto = monto;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public boolean isBono() {
        return bono;
    }

    public void setBono(boolean bono) {
        this.bono = bono;
    }

    public Pasajero getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero pasajeros) {
        this.pasajeros = pasajeros;
    }

 
    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Embarcacion getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(Embarcacion embarcacion) {
        this.embarcacion = embarcacion;
    }

    public Empleado getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado empleados) {
        this.empleados = empleados;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public ServicioComun getServicioComun() {
        return servicioComun;
    }

    public void setServicioComun(ServicioComun servicioComun) {
        this.servicioComun = servicioComun;
    }


}
