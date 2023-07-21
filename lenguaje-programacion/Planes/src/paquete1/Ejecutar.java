/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.sql.SQLException;
import java.util.Scanner;
import paquete2.*;
import paquete3.Enlace;
/**
 *
 * @author Usuario
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        
        Enlace c = new Enlace();
        boolean bandera = true;
        while (bandera) {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n",
                    "              >>Planes de Celular<<              ",
                    "1) Ingresar un Plan PostPago Megas",
                    "2) Ingresar un Plan PostPago Minutos",
                    "3) Ingresar un Plan PostPago Minutos-Megas",
                    "4) Ingresar un Plan PostPago Minutos-Megas ¡Economico!");                    
            int opcion = entrada.nextInt();
            
            switch (opcion) {
                
                case 1 -> {
                    PlanPostPagoMegas plan = plan1();
                    c.insertarPlanPostPagoMegas(plan);
                }
                
                case 2 -> {
                    PlanPostPagoMinutos plan = plan2();
                    c.insertarPlanPostPagoMinutos(plan);
                }
                
                case 3 -> {
                    PlanPostPagoMinutosMegas plan = plan3();
                    c.insertarPlanPostPagoMinutosMegas(plan);
                }
                
                case 4 -> {
                    PlanPostPagoMinutosMegasEconomico plan = plan4();
                    c.insertarPlanPostPagoMinutosMegasEconomico(plan);
                }
                
                default -> {}
            }                                       
            entrada.nextLine();
            System.out.println("Desea salir del proceso? Ingrese:  si");
            String salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
            }
        } 
        
        c.obtenerDataPlan();
        for (int i = 0; i < c.obtenerArrayList().size(); i++) {
            System.out.printf("%s\n", c.obtenerArrayList().get(i));
        }
    }
    
    public static PlanPostPagoMegas plan1(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres del propietario: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los apellidos del propietario: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese el Pasaporte: ");
        String pasaporte = entrada.nextLine();
        System.out.println("Ingrese la ciudad: ");
        String ciu = entrada.nextLine();
        System.out.println("Ingrese el barrio: ");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese la marca del celular: ");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular: ");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el número de celular: ");
        int num = entrada.nextInt();
        
        System.out.println("Ingrese los megas del plan: ");
        double megas = entrada.nextDouble();
        System.out.println("Ingrese el costo por Mega: ");
        double costoMeg = entrada.nextDouble();
        System.out.println("Ingrese la tarifa base: ");
        double tafB = entrada.nextDouble();
        
        PlanPostPagoMegas p1 = new PlanPostPagoMegas
        (nombre, apellido, pasaporte, ciu, barrio, marca, modelo, num, 
                megas, costoMeg, tafB);
        
        p1.calcularPagoMensual();
        
        return p1;
    }
    
    public static PlanPostPagoMinutos plan2(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres del propietario: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los apellidos del propietario: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese el Pasaporte: ");
        String pasaporte = entrada.nextLine();
        System.out.println("Ingrese la ciudad: ");
        String ciu = entrada.nextLine();
        System.out.println("Ingrese el barrio: ");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese la marca del celular: ");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular: ");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el número de celular: ");
        int num = entrada.nextInt();
        
        System.out.println("Ingresar los minutos Nacionales: ");
        double minN = entrada.nextDouble();
        System.out.println("Ingresar el costo por minutos Nacionales: ");
        double costoN = entrada.nextDouble();
        System.out.println("Ingrese los minutos Internacionales: ");
        double minI = entrada.nextDouble();
        System.out.println("Ingrese el costo por minutos Internacionales: ");
        double costoI = entrada.nextDouble();
        
        PlanPostPagoMinutos p2 = new PlanPostPagoMinutos(nombre, apellido, 
                pasaporte, ciu, barrio, marca, modelo, num, minN, costoN, 
                minI, costoI);
        
        p2.calcularPagoMensual();
        
        return p2;
    }
    
    
    public static PlanPostPagoMinutosMegas plan3(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres del propietario: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los apellidos del propietario: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese el Pasaporte: ");
        String pasaporte = entrada.nextLine();
        System.out.println("Ingrese la ciudad: ");
        String ciu = entrada.nextLine();
        System.out.println("Ingrese el barrio: ");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese la marca del celular: ");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular: ");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el número de celular: ");
        int num = entrada.nextInt();
        
        System.out.println("Ingresar los minutos: ");
        double min = entrada.nextDouble();
        System.out.println("Ingresar el costo minutos: ");
        double costomin = entrada.nextDouble();
        System.out.println("Ingrese los megas: ");
        double megas = entrada.nextDouble();
        System.out.println("Ingrese el costo de los megas: ");
        double costomeg = entrada.nextDouble();
        
        PlanPostPagoMinutosMegas p3 =  new PlanPostPagoMinutosMegas(nombre, 
                apellido, pasaporte, ciu, barrio, marca, modelo, num, min, 
                costomin, megas, costomeg);
        
        p3.calcularPagoMensual();
        
        return p3;
    }
    
    public static PlanPostPagoMinutosMegasEconomico plan4(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres del propietario: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los apellidos del propietario: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese el Pasaporte: ");
        String pasaporte = entrada.nextLine();
        System.out.println("Ingrese la ciudad: ");
        String ciu = entrada.nextLine();
        System.out.println("Ingrese el barrio: ");
        String barrio = entrada.nextLine();
        System.out.println("Ingrese la marca del celular: ");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del celular: ");
        String modelo = entrada.nextLine();
        System.out.println("Ingrese el número de celular: ");
        int num = entrada.nextInt();
        
         System.out.println("Ingresar los minutos: ");
        double min = entrada.nextDouble();
        System.out.println("Ingresar el costo minutos: ");
        double costomin = entrada.nextDouble();
        System.out.println("Ingrese los megas: ");
        double megas = entrada.nextDouble();
        System.out.println("Ingrese el costo de los megas: ");
        double costomeg = entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento del plan: ");
        int des = entrada.nextInt();
        
        PlanPostPagoMinutosMegasEconomico p4 = new 
        PlanPostPagoMinutosMegasEconomico(nombre, apellido, pasaporte, ciu, 
                barrio, marca, modelo, num, min, costomin, megas, costomeg, des);
        
        p4.calcularPagoMensual();
        
        return p4;
    }
    /*public static void ingresarPropietario() {
        String nombreArchivoP = "datos/propietarios.dat";
        Scanner entrada = new Scanner(System.in);
        
        Propietario p = buscarPropietario();
        
        if (p == null) {
            System.out.println("El propietario no existe, ingrese los siguientes datos:");
            System.out.println("Ingrese el nombre del propietario:");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese apellido:");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese ID:");
            String id = entrada.nextLine();
            System.out.println("----------------------------------------------");

            Propietario propietario = new Propietario(nombre, apellido, id);

            EscrituraArchivoSecuencialPropi archivoPropi
                    = new EscrituraArchivoSecuencialPropi(nombreArchivoP);
            archivoPropi.establecerRegistro(propietario);
            archivoPropi.establecerSalida();
            archivoPropi.cerrarArchivo();

            System.out.println("Propietario creado");
        } else {
            System.out.printf("El propietario ya existe y es: \n%s\n%s\n%s\n",
                    p.obtenerNombre(),p.obtenerApellido(),p.obtenerId());
        }*/
    
    
    
    /*public static Propietario buscarPropietario() {
        String nombreArchivoProp = "datos/propietarios.dat";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese ID:");
        String id = entrada.next();
        LecturaAchivoSecuencialPropi lectura =
                new LecturaAchivoSecuencialPropi(nombreArchivoProp);
        lectura.establecerRegistroBuscado(id);
        Propietario p = lectura.obtenerRegistroBuscado();            
        return p;
    }*/
}

/*
    Generar un método main que permita ingresar múltiples tipos de objetos de 
    Planes de celular. Se debe calcular el valor mensual a pagar de acuerdo a 
    su contexto.
    Guardar la información de cada objeto en una base de datos (una entidad por 
    cada clase). Se usará la base de datos SQLite.
    Obtener la información de los registros de la base de datos y presentar 
    la información de cada objeto haciendo uso del método toString
    Generar un diagrama que involucre las clases del polimorfismo.

    En el método (main) de la clase a Ejecutar. En un ciclo repetitivo el 
    usuario puede decidir que tipo de Plan desea crear para la empresa de 
    acuerdo a las opciones: PlanPostPagoMinutos, PlanPostPagoMegas, 
    PlanPostPagoMinutosMegas, PlanPostPagoMinutosMegasEconomico.
    De acuerdo a la opción, el usuario ingresa por teclado los datos necesarios 
    para crear el objeto.
    Luego de crear el objeto; se debe guardar en la base datos
    Finalizado el ciclo (cuando lo decida el usuario); se debe presentar todos 
    los objetos guardados en la base de datos.
*/

/*
    Tareas:
    En una clase Inicio usted debe:

    Generar un método main que permita ingresar múltiples tipos de objetos de 
    Planes de celular.
    Se debe calcular el valor mensual a pagar de acuerdo a su contexto.
    Guardar la información de cada objeto en una base de datos (una entidad por
    cada clase). Se usará la base de datos SQLite.
    Obtener la información de los registros de la base de datos y presentar la 
    información de cada objeto haciendo uso del método toString
    Generar un diagrama que involucre las clases del polimorfismo / herencia

    Recomendaciones:
    Analizar la problemática; realizar el diagrama (carpeta diagramas); crear 
    la solución en Java (carpeta lenguaje-programacion)

    Proceso a seguir:
    En el método (main) de la clase a Ejecutar. En un ciclo repetitivo el 
    usuario puede decidir que tipo de Plan desea crear para la empresa de 
    acuerdo a las opciones: PlanPostPagoMinutos, PlanPostPagoMegas, 
    PlanPostPagoMinutosMegas, PlanPostPagoMinutosMegasEconomico.
    De acuerdo a la opción, el usuario ingresa por teclado los datos necesarios 
    para crear el objeto.
    Luego de crear el objeto; se debe guardar en la base datos
    Finalizado el ciclo (cuando lo decida el usuario); se debe presentar todos 
    los objetos guardados en la base de datos.
*/