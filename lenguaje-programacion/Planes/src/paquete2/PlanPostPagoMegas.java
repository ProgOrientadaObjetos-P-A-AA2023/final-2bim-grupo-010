/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Usuario
 */
public class PlanPostPagoMegas extends PlanCelular {
    private double megas;
    private double costoMegas;
    private double tarifaBase;
    
    /*PlanPostPagoMegas
megas expresado en gigas|costo por cada giga|tarifa base*/
    
    public PlanPostPagoMegas(String n, String id, String c, String marca,
            String modelo, int numC, double meg, double costoM, double tB){
        super(n, id, c, marca, modelo, numC);
        megas = meg;
        costoMegas = costoM;
        tarifaBase = tB;
    }
    
    public void establecerMegas(double p) {
        megas = p;
    }

    public void establecerCostoMegas(double p) {
        costoMegas = p;
    }

    public void establecerTarifaBase(double p) {
        tarifaBase = p;
    }
    
    public double obtenerMegas() {
        return megas;
    }

    public double obtenerCostoMegas() {
        return costoMegas;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = (megas * costoMegas) + tarifaBase;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s"
                + ">> Plan PostPago Megas <<\n"
                + "\tMegas: %.2f\n"
                + "\tCosto Megas: $%.2f\n"
                + "\tTarifa Base: $%.2f\n\n"
                + "Pago Mensual Plan: $%.2f\n",
                super.toString(),
                obtenerMegas(),
                obtenerCostoMegas(),
                obtenerTarifaBase(),
                obtenerPagoMensual());

        return cadena;
    }
}
