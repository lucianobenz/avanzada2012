
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeviajes;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 *
 * @author Luciano HP
 */
@Entity
public class ServicioEspecial extends Servicio {
    @Basic
    private double entrega;
    @Basic
    private double recargoPasajeros;
    
public ServicioEspecial(){
    
}

public ServicioEspecial(int idServicio, String hora, String dia, String embarcacion, String pasajero, double precio,double entrega, 
        double recargo, double recargoPasajeros){
    super(idServicio,hora, dia, embarcacion, pasajero, precio);
    this.entrega= entrega;
    this.recargoPasajeros=recargoPasajeros;
}

     public double getEntrega() {
        return entrega;
    }

    public void setEntrega(double entrega) {
        this.entrega = entrega;
    }

    public double getRecargoPasajeros() {
        return recargoPasajeros;
    }

    public void setRecargoPasajeros(double recargoPasajeros) {
        this.recargoPasajeros = recargoPasajeros;
    }


}
