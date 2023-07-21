/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Usuario
 */
public class PlanPostPagoMinutosMegas extends PlanCelular{
    private double minutos;
    private double costoMin;
    private double megas;
    private double costoMegas;
    
    /*  PlanPostPagoMinutosMegas
        minutos|costo minutos|megas expresado en gigas|costo por cada giga
    */
    public PlanPostPagoMinutosMegas () {
        
    }
    
    public PlanPostPagoMinutosMegas(String n, String a, String pasa, String c, 
            String ba, String marca, String modelo, int numC, double min, 
            double costoMi, double meg, double costoMeg){
        super(n, a, pasa, c, ba, marca, modelo, numC);
        minutos = min;
        costoMi = costoMi;
        megas = meg;
        costoMeg = costoMeg;
        tipoPlan = "PlanPostPagoMinutosMegas";
    }        

    public void establecerMinutos(double p) {
        minutos = p;
    }

    public void establecerCostoMin(double p) {
        costoMin = p;
    }

    public void establecerMegas() {
        megas = megas/1000;
    }

    public void establecerCostoMegas(double p) {
        costoMegas = p;
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMin() {
        return costoMin;
    }

    public double obtenerMegas() {
        return megas;
    }

    public double obtenerCostoMegas() {
        return costoMegas;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutos * costoMin) + (megas * costoMegas);
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s"
                + ">> Plan PostPago Minutos/Megas <<\n"
                + "\tMinutos: %.2f\n"
                + "\tCosto minutos: $%.2f\n"
                + "\tMegas: %.2fGB\n"
                + "\tCosto megas: $%.2f\n"
                + "Pago Mensual Plan: $%.2f\n",
                super.toString(),
                obtenerMinutos(),
                obtenerCostoMin(),
                obtenerMegas(),
                obtenerCostoMegas(),
                obtenerCiudadProp());

        return cadena;
    }
}
