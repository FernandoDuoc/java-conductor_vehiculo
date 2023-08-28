package cl.duoc.vehiculo.dominio;

public class Conductor{
    
    //atributos 1
    private String nombre;
    private String rut;
    private int edad;
    
    //Constructor vacío 2
    public Conductor() {
    }
    
    //Constructor con parámetros 3
    public Conductor(String nombre, String rut, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
    }

    //Encapsulamiento 4
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getRut() {
        return rut;
    }


    public void setRut(String rut) {
        this.rut = rut;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Metodos 5
    public void mostrar(){
        System.out.println("DATOS DEL CONDUCTOR:");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Rut: "+this.rut);
        System.out.println("Edad: "+this.edad);
        
    }
    
}