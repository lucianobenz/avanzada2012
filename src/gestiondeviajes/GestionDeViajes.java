/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeviajes;




//import Persistencia.ControladoraPersistencia;
import Persistencia.ControladoraPer;
import Persistencia.exceptions.PreexistingEntityException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author Luciano HP
 */

public class GestionDeViajes {
    
    private List<Embarcacion> embarcaciones;
    private List<Empleado> empleados;
    private List<ServicioEspecial> servicioEspecial;
    private List<ServicioComun> servicioComun; 
    private List<VentaViaje> ventas;
    private List<Pasajero> pasajeros;
    private List<Reserva> reservas;
    private List<Conductor> conductores;
  
      
 ControladoraPer persistencia=new ControladoraPer();
   
    
    
    public GestionDeViajes(){
    
       this.embarcaciones = embarcaciones;
       this.empleados = empleados;
       this.servicioEspecial = servicioEspecial;
       this.servicioComun = servicioComun;
       this.ventas = ventas;
       this.pasajeros = pasajeros;
       this.reservas = reservas;
       this.conductores = conductores;
       
    }
             
    
    
    
  

/****************************************METODOS DE VENTA**********************/
    public String buscarConductor() {
//        Empleado conductor= controladoraPer.buscarConductor;
         //como busco el nombre del conductor?
        String nombre=""; //solo par probar
        return nombre;
    }

     public int cantidadPasajeros() {
        int pas=0;//solo para prueba
        
        return pas;
    }

  
    
                                /*********/
/******************************EMBARCACION********************************************/
                               /*********/
     
      public void crearEmbarcacion(int id, String model, String nombre, String marca, int velmax, int capacidad) {
        Embarcacion unBarco=new Embarcacion(id,model,nombre,marca,velmax,capacidad);
        
    }
     
  
     public boolean disponibilidadEmbarcacion(String barco, String fechaReserva, String hora) {
         boolean disponible=true;
        // debe determinar si el barco en cuestion esta disponible esa fecha
         // a esa hora de lo contrario retornara falso.
        return disponible;
    }
       
   
    public Embarcacion obtenerBarcoActual(int dia, int mes, int año, String hora) {
        Embarcacion unBarco=null;//solo para probar
        
        return unBarco;
    }
                                /*********/
/********************************RESERVA***********************************/
                               /*********/
    
       
 
      
          
     public String diaActual() {
        Calendar fechaHoy= Calendar.getInstance(); 
        String dia = Integer.toString(fechaHoy.get(Calendar.DATE)) ;
        System.out.println("el dia es "+dia);
        return dia;
                
        //annio = Integer.toString(c.get(Calendar.YEAR));       
    }

    public String mesActual() {
        Calendar fechaHoy=Calendar.getInstance();
        String mes = Integer.toString(fechaHoy.get(Calendar.MONTH)+1);
        return mes;
    }

    public String anioActual() {
        Calendar fechaHoy=Calendar.getInstance();
        String anio = Integer.toString(fechaHoy.get(Calendar.YEAR));
        return anio;
    }
    
    public String horaActual() {
        Calendar fechaHoy=Calendar.getInstance();
        String hora = Integer.toString(fechaHoy.get(Calendar.HOUR));
        return hora;
    }
    
      
     public Conductor asignarConductorReserva(String reserva, Conductor cond) {
        
        // ya q este conductor ya existe y lo debo asociar a la reserva
        
        //recibe el conductor q de la embarcacion de dicha reserva
         // necesitaria id de la reserva para asociarlas
         return cond;
    }
    
    
     public boolean conductorReserva() {
        boolean cond=true;
        
        return cond;
    }
    
                                /*********/
/********************************PASAJEROS********************************************/
                               /*********/
     
     public void registrarPasajeros(String nac, String nombre, String ape, int edad, String dir, String tel, String dni) throws PreexistingEntityException, Exception {
        Pasajero unPasajero = new Pasajero(nac,nombre,ape,edad,dir,tel,dni);
        persistencia.registrarPasajero(unPasajero);
    }
    
                                  /*********/
/********************************           ********************************************/
                               /*********/

    public String obtenerEmpleadosBarco() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

   public void registrarReserva(int id, List pasajeros, Conductor conductor, List empleados, String emb, int entre, double pre, String fechaReserva, String fechaTransaccion) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
   
    public List listaDePasajerosEspecial(String hora, String fechaReserva) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public List asignarEmpleadoReserva(String fechaReserva) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    

   

    

   

    
      
}
