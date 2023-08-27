
package cl.duoc.vehiculo.dominio;

//Atributos
public class Conductor {
    private String nombre;
    private String rut;
    private int edad ;
    private boolean acom;
    private int cantAcomAdult;
    private int cantAcomNino;

    //Constructor    
    public Conductor(String nombre, String rut, int edad, boolean acom, int cantAcomAdult, int cantAcomNino) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.acom = acom;
        this.cantAcomAdult = cantAcomAdult;
        this.cantAcomNino = cantAcomNino;
    }
    
    public Conductor() {
    }

    //Encapsulamiento
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


    public boolean isAcom() {
        return acom;
    }


    public void setAcom(boolean acom) {
        this.acom = acom;
    }


    public int getCantAcomAdult() {
        return cantAcomAdult;
    }


    public void setCantAcomAdult(int cantAcomAdult) {
        this.cantAcomAdult = cantAcomAdult;
    }


    public int getCantAcomNino() {
        return cantAcomNino;
    }


    public void setCantAcomNino(int cantAcomNino) {
        this.cantAcomNino = cantAcomNino;
    }
    
    //Metodos
    public void mostrarConductor(){
        System.out.println("DATOS DEL CONDUCTOR");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Rut: "+this.getRut());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Acompañantes adultos: "+this.getCantAcomAdult());
        System.out.println("Acompañantes Menores: "+this.getCantAcomNino());
        
    }
    
    public boolean esAcom (){
        String res = "";
        boolean varRespuesta = false;
        
        if(res.equals("si")){
            return varRespuesta = true;
            
        }
        
        return varRespuesta;
    }   
        
}