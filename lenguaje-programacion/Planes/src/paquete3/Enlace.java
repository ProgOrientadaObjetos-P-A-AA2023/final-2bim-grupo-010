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
    ArrayList<PlanCelular> lista = new ArrayList<>();
    
    public void establecerConexion() {  

        try {  
            // db parameters  
            String url = "jdbc:sqlite:bd/planes.bd";  
            // create a connection to the database  
            conn = DriverManager.getConnection(url);  
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
        
    } 
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos plan) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
                                        
            String data = String.format("INSERT INTO planPostPagoMinutos"
            + " (tipo,"
            + "nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
            + "modeloCel, NumCel, minutosNaci, costoMinNaci, minutosInter,"
            + "costoMinInter, Pago) "
            + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s'"
            + "%s, %s, %s, %s, %s, %s)", 
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
             System.out.println("Exception:");
             System.out.println(e.getMessage());               
        }  
    }
    
    public void insertarPlanPostPagoMegas(PlanPostPagoMegas plan) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
                                        
            String data = String.format("INSERT INTO planPostPagoMegas "
            + "(tipo, nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
            + "modeloCel, numCel, megas, costoM, tarifaBase, pago) "
            + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s'"
            + "%s, %s, %s, %s, %s)", 
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
             System.out.println("Exception: linea 110");
             System.out.println(e.getMessage());               
        }  
    }
    
    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas plan) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
                                        
            String data = String.format("INSERT INTO planPostPagoMinutosMegas"
            + " (tipo,"
            + "nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
            + "modeloCel, numCel, min, costoMin, megas, costoMegas, pago) "
            + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s'"
            + "%s, %s, %s, %s, %s, %s)", 
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
             System.out.println("Exception:");
             System.out.println(e.getMessage());               
        }  
    }
    
    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico plan) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
                                        
            String data = String.format("INSERT INTO planPostPagoMinutosMegasEconomico"
            + " (tipo,"
            + "nombre, apellido, pasaporte, ciudad, barrio, marcaCel,"
            + "modeloCel, numCel, min, costoMin, megas, costoMegas, descuento"
            + ",pago) "
            + "values ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s'"
            + "%s, %s, %s, %s, %s, %s, %s)", 
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
             System.out.println("Exception:");
             System.out.println(e.getMessage());               
        }  
    }
    
    public void obtenerDataPlan() {          
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            
            String data = "Select * from planPostPagoMegas";            
            ResultSet rs = statement.executeQuery(data);
            
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

                    if (uwu.equals("PlanPostPagoMinutosMegas")) {
                        while(rs.next()){
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
                            lista.add(plan); 
                        }
                    } else {
                        // establecerConexion();
                        data = "Select * from planPostPagoMinutosMegasEconomico"; 
                        uwu = rs.getString("tipo");

                        if (uwu.equals("PlanPostPagoMinutosMegasEconomico")) {
                            while(rs.next()){
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
                                lista.add(plan); 
                            }
                        }
                    }
                } 
            }
        obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: uwu linea 289");
             System.out.println(e.getMessage());  
        }  
    }
     
    public ArrayList<PlanCelular> obtenerArrayList() {
        return lista;
    }
}
