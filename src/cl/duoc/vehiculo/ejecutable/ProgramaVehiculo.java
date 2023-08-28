package cl.duoc.vehiculo.ejecutable;

import cl.duoc.vehiculo.dominio.*;
import java.util.Scanner;


public class ProgramaVehiculo {


    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        Conductor conductor1 = new Conductor();
        
        String varNombre = "";
        String varRut = "";
        int varEdad = 0;
        
        //VALIDACIÓN
        while(varNombre.equals("")){
            System.out.println("INGRESE EL NOMBRE: ");
            varNombre = ingreso.nextLine();
            if(varNombre.equals("")){
                System.out.println("DEBE INGRESAR UN NOMBRE VÁLIDO");
            }
        }
        
        System.out.println("INGRESE RUT: ");
        varRut = ingreso.next();
        
        System.out.println("INGRESE SU EDAD: ");
        varEdad = ingreso.nextInt();
        
        //asignar datos con set
        conductor1.setNombre(varNombre);
        conductor1.setRut(varRut);
        conductor1.setEdad(varEdad);
        
        //mostrar datos
        conductor1.mostrar();
        
        //conductor con parametros
        Conductor conductor2 = new Conductor("Fernando","1234",  32);
        conductor2.mostrar();
        
        Vehiculo vehiculo1 = new Vehiculo();
        
        String varMarca = "";
        String varModelo = "";
        String varPatente = "";
        int varAcomNino = -1;
        int varAcomAdult = -1;
        
        System.out.println("INGRESE DATOS DEL VEHICULO");
        System.out.println("Ingrese Marca: ");
        varMarca = ingreso.next();
        
        System.out.println("Ingrese Modelo: ");
        varModelo = ingreso.next();
        
        System.out.println("Ingrese Patente: ");
        varPatente = ingreso.next();
        
        while(varAcomNino < 0){
            System.out.println("Ingrese cantidad de niños: ");
            varAcomNino = ingreso.nextInt();
            if(varAcomNino < 0){
                System.out.println("Ingrese valor mayor o igual a 0");
            }
        }
        
        while(varAcomAdult < 0){
            System.out.println("Ingrese cantidad de adultos: ");
            varAcomAdult = ingreso.nextInt();
            if(varAcomAdult < 0){
                System.out.println("Ingrese valor mayor o igual a 0");
            }
        }
        
        vehiculo1.setConductor(conductor1);
        vehiculo1.setMarca(varMarca);
        vehiculo1.setModelo(varModelo);
        vehiculo1.setPatente(varPatente);
        vehiculo1.setAcomNino(varAcomNino);
        vehiculo1.setAcomAdult(varAcomAdult);
        
        vehiculo1.mostrar();
        vehiculo1.total();
        
    }
    
}
