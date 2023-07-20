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
    
    public void insertarPlan(PlanCelular plan) {  
  
        try{  
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            switch (plan.obtenerTipoPlan()) {
                case "PlanPostPagoMinutos" : {
                    String data = String.format("INSERT INTO autos (nombre,"
                    + "apellido, id, ciudad, marcaCel, modeloCel, numCel) "
                    + "values ('%s', '%s', '%s', '%s', '%s', %s, %s)", 
                    plan.obtenerNombresProp(), 
                    plan.obte
                    plan.obtenerIdProp(),
                    plan.obtenerCiudadProp(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumCelular(),
                    plan.obtenerPagoMensual());
                    statement.executeUpdate(data);
                }
                        
            }
            
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
            String data = "Select * from planes;";
            
            ResultSet rs = statement.executeQuery(data);
            while(rs.next()){
                PlanCelular plan = new PlanCelular();
                plan.establecerNombresProp(rs.getString("nombre"));
                plan.establecerValorMatricula(rs.getDouble("valor_matricula"));
                lista.add(plan);
            }
            
            obtenerConexion().close();
        } catch (SQLException e) {  
             System.out.println("Exception: insertarCiudad");
             System.out.println(e.getMessage());  
             
        }  
    }
     
    public ArrayList<PlanCelular> obtenerArrayList() {
        return lista;
    }
}
