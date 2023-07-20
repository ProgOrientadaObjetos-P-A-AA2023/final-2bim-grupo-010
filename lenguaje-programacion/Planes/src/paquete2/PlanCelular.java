/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Usuario
 */
public abstract class PlanCelular {
    protected String nombresProp;
    protected String idProp;
    protected String ciudadProp;
    protected String marcaCelular;
    protected String modeloCelular;
    protected int numCelular;
    protected String tipoPlan;
    protected double pagoMensual;
    
    /*  nombres propietario tipo (tipo cadena)
        cedula propietario (tipo cadena)
        Ciudad propietario (tipo cadena)
        marca de celular
        modelo del celular
        numero celular
        pago mensual (para obtener el valor, se debe operar en cada subclase)
    */

    public PlanCelular(String n, String id, String c, String marca, 
            String modelo, int numC) {
        nombresProp = n;
        idProp = id;
        ciudadProp = c;
        marcaCelular = marca;
        modeloCelular = modelo;
        numCelular = numC;
    }  

    public void establecerNombresProp(String p) {
        nombresProp = p;
    }
    
    public void establecerIdProp(String p) {
        idProp = p;
    }
    
    public void establecerCiudadProp(String p) {
        ciudadProp = p;
    }
    
    public void establecerMarcaCelular(String p) {
        marcaCelular = p;
    }
    
    public void establecerModeloCelular(String p) {
        modeloCelular = p;
    }
    
    public void establecerTipoPlan(String p) {
        tipoPlan = p;
    }
    
    public void establecerNumCelular(int p) {
        numCelular = p;
    } 
  
    public abstract void calcularPagoMensual();
    
    
    public String obtenerNombresProp() {
        return nombresProp;
    }

    public String obtenerIdProp() {
        return idProp;
    }

    public String obtenerCiudadProp() {
        return ciudadProp;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }  

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public int obtenerNumCelular() {
        return numCelular;
    } 

    public double obtenerPagoMensual() {
        return pagoMensual;
    }
    
    public String obtenerTipoPlan() {
        return tipoPlan;
    }

    @Override
    public String toString() {
        String cadena = String.format(">> Plan Celular %s <<\n"
                + "Datos del Propietario:\n"
                + "\tNombres: %s\n"
                + "\tID: %s\n"
                + "\tCiudad: %s\n"
                + "\tMarca Celular: %s\n"
                + "\tModelo Celular: %s\n"
                + "\tNúmero celular: %d\n", 
                obtenerTipoPlan(),
                obtenerNombresProp(),
                obtenerIdProp(),
                obtenerCiudadProp(),
                obtenerMarcaCelular(),
                obtenerModeloCelular(),
                obtenerNumCelular());
        
        return cadena;
    }
}
