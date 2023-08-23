
package cl.duoc.vehiculo.dominio;

//Atributos
public class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;
    private Conductor conductor;

//Constructor    
    public Vehiculo(String marca, String modelo, String patente, Conductor conductor) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.conductor = conductor;
    }

//Constructor vacío    
    public Vehiculo() {
        conductor = new Conductor(); //Instanciado Objeto conductor
        
    }
    
//Encapsulamiento
    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getPatente() {
        return patente;
    }


    public void setPatente(String patente) {
        this.patente = patente;
    }


    public Conductor getConductor() {
        return conductor;
    }


    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
//Metodos
    public void mostrarVehiculo() {
        System.out.println("DATOS DEL VEHÍCULO");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Patente: "+this.patente);
        this.getConductor().mostrarConductor();
        
    }
    
}
