/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author D E L L
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete2.*;

public class Enlace {

    private Connection conn;
    private ArrayList<PlanCelular> lista = new ArrayList<>();

    public void establecerConexion() {

        try {
            String url = "jdbc:sqlite:bd/planes.bd";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Linea 30: "+e.getMessage());
        }
    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();

            String data = String.format("INSERT INTO planPostPagoMinutos "
                    + "(tipo, nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
                    + "modeloCel, numCel, minutosNaci, costoMinNaci, "
                    + "minutosInter, costoMinInter, pago) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s',"
                    + " %s, %s, %s, %s, %s, %s)",
                    plan.obtenerTipoPlan(),
                    plan.obtenerNombres(),
                    plan.obtenerApellidos(),
                    plan.obtenerPasaporte(),
                    plan.obtenerCiudadProp(),
                    plan.obtenerBarrio(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumCelular(),
                    plan.obtenerMinutoNa(),
                    plan.obtenerCostoMinNa(),
                    plan.obtenerMinutosIn(),
                    plan.obtenerCostoMinIn(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            // System.out.println(data);            
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: linea 69");
            System.out.println(e.getMessage());
        }
    }

    public void insertarPlanPostPagoMegas(PlanPostPagoMegas plan) {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();

            String data = String.format("INSERT INTO planPostPagoMegas "
                    + "(tipo, nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
                    + "modeloCel, numCel, megas, costoM, tarifaBase, pago) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s',"
                    + " %s, %s, %s, %s, %s)",
                    plan.obtenerTipoPlan(),
                    plan.obtenerNombres(),
                    plan.obtenerApellidos(),
                    plan.obtenerPasaporte(),
                    plan.obtenerCiudadProp(),
                    plan.obtenerBarrio(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumCelular(),
                    plan.obtenerMegas(),
                    plan.obtenerCostoMegas(),
                    plan.obtenerTarifaBase(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            // System.out.println(data);            
            // obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: linea 102");
            System.out.println(e.getMessage());
        }
    }

    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();

            String data = String.format("INSERT INTO planPostPagoMinutosMegas "
                    + "(tipo, nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
                    + "modeloCel, numCel, min, costoMin, megas, costoMegas, pago) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s',"
                    + " %s, %s, %s, %s, %s, %s)",
                    plan.obtenerTipoPlan(),
                    plan.obtenerNombres(),
                    plan.obtenerApellidos(),
                    plan.obtenerPasaporte(),
                    plan.obtenerCiudadProp(),
                    plan.obtenerBarrio(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumCelular(),
                    plan.obtenerMinutos(),
                    plan.obtenerCostoMin(),
                    plan.obtenerMegas(),
                    plan.obtenerCostoMegas(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            // System.out.println(data);            
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: linea 137");
            System.out.println(e.getMessage());
        }
    }

    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();

            String data = String.format("INSERT INTO planPostPagoMinutosMegasEconomico "
                    + "(tipo, nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
                    + "modeloCel, numCel, min, costoMin, megas, costoMegas, "
                    + "descuento, pago) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s',"
                    + " %s, %s, %s, %s, %s, %s, %s)",
                    plan.obtenerTipoPlan(),
                    plan.obtenerNombres(),
                    plan.obtenerApellidos(),
                    plan.obtenerPasaporte(),
                    plan.obtenerCiudadProp(),
                    plan.obtenerBarrio(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumCelular(),
                    plan.obtenerMinutos(),
                    plan.obtenerCostoMin(),
                    plan.obtenerMegas(),
                    plan.obtenerCostoMegas(),
                    plan.obtenerDescuento(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            // System.out.println(data);            
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: linea 174");
            System.out.println(e.getMessage());
        }
    }

    public void obtenerDataPlanPostPagoMegas() {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();

            String data = "Select * from planPostPagoMegas";
            ResultSet rs = statement.executeQuery(data);
<<<<<<< HEAD
=======
<<<<<<< HEAD
            while(rs.next()){
                /*
                tipo,"
            + "nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
            + "modeloCel, numCel, min, costoMin, megas, costoMegas, descuento"
            + ",pago
                */
                PlanCelular plan = new PlanCelular();
                plan.establecerNombresProp(rs.getString("nombre"));
                plan.establecerValorMatricula(rs.getDouble("valor_matricula"));
                lista.add(plan);
            }
=======
>>>>>>> 7eb9695e7a7e254a87451c24eb920e1358c97a95
            
            String uwu = rs.getString("tipo");
            
            if (uwu.equals("PlanPostPagoMegas")) {
                while(rs.next()){
                    PlanPostPagoMegas plan = new PlanPostPagoMegas(
                            rs.getString("nombre"), 
                            rs.getString("apellido"), 
                            rs.getString("pasaporte"), 
                            rs.getString("ciudad"), 
                            rs.getString("barrio"), 
                            rs.getString("marcaCel"), 
                            rs.getString("modeloCel"), 
                            rs.getInt("numCel"), 
                            rs.getDouble("megas"), 
                            rs.getDouble("costoM"), 
                            rs.getDouble("tarifaBase"));
                    lista.add(plan);
                }
            } else {
                // establecerConexion();
                data = "Select * from planPostPagoMinutos"; 
                uwu = rs.getString("tipo");
                
                if (uwu.equals("PlanPostPagoMinutos")) {
                    while(rs.next()){
                        PlanPostPagoMinutos plan = new PlanPostPagoMinutos(
                                rs.getString("nombre"), 
                                rs.getString("apellido"), 
                                rs.getString("pasaporte"), 
                                rs.getString("ciudad"), 
                                rs.getString("barrio"), 
                                rs.getString("marcaCel"), 
                                rs.getString("modeloCel"), 
                                rs.getInt("NumCel"), 
                                rs.getDouble("minutosNaci"), 
                                rs.getDouble("costoMinNaci"), 
                                rs.getDouble("minutosInter"),
                                rs.getDouble("costoMinInter"));
                        lista.add(plan); 
                    }
                } else {
                    // establecerConexion();
                    data = "Select * from planPostPagoMinutosMegas"; 
                    uwu = rs.getString("tipo");
>>>>>>> 0fc5e200be2fbe731f20ae504989710ef5484992

            while (rs.next()) {
                PlanPostPagoMegas plan = new PlanPostPagoMegas(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marcaCel"),
                        rs.getString("modeloCel"),
                        rs.getInt("numCel"),
                        rs.getDouble("megas"),
                        rs.getDouble("costoM"),
                        rs.getDouble("tarifaBase"));
                plan.calcularPagoMensual();
                lista.add(plan);
            }
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: uwuDATA linea 205");
            System.out.println(e.getMessage());
        }
    }

    public void obtenerDataPlanPostPagoMinutos() {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutos";
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutos plan = new PlanPostPagoMinutos(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marcaCel"),
                        rs.getString("modeloCel"),
                        rs.getInt("NumCel"),
                        rs.getDouble("minutosNaci"),
                        rs.getDouble("costoMinNaci"),
                        rs.getDouble("minutosInter"),
                        rs.getDouble("costoMinInter"));
                plan.calcularPagoMensual();
                lista.add(plan);
            }
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: uwuDATA linea 235");
            System.out.println(e.getMessage());
        }
    }

    public void obtenerDataPlanPostPagoMinutosMegas() {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegas";
            ResultSet rs = statement.executeQuery(data);

            while (rs.next()) {
                PlanPostPagoMinutosMegas plan = new PlanPostPagoMinutosMegas(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marcaCel"),
                        rs.getString("modeloCel"),
                        rs.getInt("numCel"),
                        rs.getDouble("min"),
                        rs.getDouble("costoMin"),
                        rs.getDouble("megas"),
                        rs.getDouble("costoMegas"));
                plan.calcularPagoMensual();
                lista.add(plan);
            }
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: uwuDATA linea 266");
            System.out.println(e.getMessage());
        }
    }

    public void obtenerDataPlanPostPagoMinutosMegasEconomico() {
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegasEconomico";
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutosMegasEconomico plan = new PlanPostPagoMinutosMegasEconomico(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marcaCel"),
                        rs.getString("modeloCel"),
                        rs.getInt("numCel"),
                        rs.getDouble("min"),
                        rs.getDouble("costoMin"),
                        rs.getDouble("megas"),
                        rs.getDouble("costoMegas"),
                        rs.getInt("descuento"));
                plan.calcularPagoMensual();
                lista.add(plan);
            }
            obtenerConexion().close();
        } catch (SQLException e) {
            System.err.println("Exception: uwuDATA linea 297");
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<PlanCelular> obtenerArrayList() {
        return lista;
    }
}
