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
public class ServicioComun extends Servicio{
    
    @Basic
    private boolean bonificacion;
        
public ServicioComun() {

}

public ServicioComun(int idServicio, String hora, String dia, String embarcacion, String pasajero, double precio,boolean bonificacion, VentaViaje viaje){

   super(idServicio, hora, dia, embarcacion, pasajero, precio);
   this.bonificacion=bonificacion;
}

    public boolean isBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(boolean bonificacion) {
        this.bonificacion = bonificacion;
    }

       
}
