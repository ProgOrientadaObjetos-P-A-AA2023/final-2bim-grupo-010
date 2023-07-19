/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Usuario
 */
public class PlanPostPagoMinutos extends PlanCelular{
    private double minutoNa;
    private double costoMinNa;
    private double minutosIn;
    private double costoMinIn;
    
    /*PlanPostPagoMinutos:
minutos nacionales|costo minuto nacional|minutos internacionales|costo minuto internacional*/
    
    public PlanPostPagoMinutos(String n, String id, String c, String marca,
            String modelo, int numC, double mN, double costoMN, double mI, 
            double costoMI){
        super(n, id, c, marca, modelo, numC);
        minutoNa = mN;
        costoMinNa = costoMN;
        minutosIn = mI;
        costoMinIn = costoMI;
    }

    public void establecerMinutoNa(double p) {
        minutoNa = p;
    }

    public void establecerCostoMinNa(double p) {
        costoMinNa = p;
    }

    public void establecerMinutosIn(double p) {
        minutosIn = p;
    }

    public void establecerCostoMinIn(double p) {
        costoMinIn = p;
    }

    public double obtenerMinutoNa() {
        return minutoNa;
    }

    public double obtenerCostoMinNa() {
        return costoMinNa;
    }

    public double obtenerMinutosIn() {
        return minutosIn;
    }

    public double obtenerCostoMinIn() {
        return costoMinIn;
    }
    
    @Override
    public void calcularPagoMensual() {
        pagoMensual = (minutoNa * costoMinNa) + (minutosIn * costoMinIn);
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s"
                + ">> Plan PostPago Minutos <<\n"
                + "\tMinuto Nacional: %.2f\n"
                + "\tCosto minuto Nacional: $%.2f\n"
                + "\tMinuto Internacional: %.2f\n"
                + "\tCosto minuto Internacional: $%.2f\n"
                + "Pago Mensual Plan: $%.2f\n",
                super.toString(),
                obtenerMinutoNa(),
                obtenerCostoMinNa(),
                obtenerMinutosIn(),
                obtenerCostoMinIn(),
                obtenerPagoMensual());

        return cadena;
    }
}
