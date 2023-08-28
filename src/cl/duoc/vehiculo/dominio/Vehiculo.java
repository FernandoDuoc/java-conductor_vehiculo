package cl.duoc.vehiculo.dominio;

public class Vehiculo{
    //Atributos 1
    private String marca;
    private String modelo;
    private String patente;
    private int acomNino;
    private int acomAdult;
    private Conductor conductor;
    
    //Constructor vacío
    public Vehiculo() {
        this.conductor = new Conductor();
    }
    
    //Constructor con parámetros
    public Vehiculo(String marca, String modelo, String patente, int acomNino, int acomAdult, Conductor conductor) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.acomNino = acomNino;
        this.acomAdult = acomAdult;
        this.conductor = conductor;
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


    public int getAcomNino() {
        return acomNino;
    }


    public void setAcomNino(int acomNino) {
        this.acomNino = acomNino;
    }


    public int getAcomAdult() {
        return acomAdult;
    }


    public void setAcomAdult(int acomAdult) {
        this.acomAdult = acomAdult;
    }


    public Conductor getConductor() {
        return conductor;
    }


    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    //Metodos
    public void mostrar(){
        System.out.println("DATOS DEL VEHICULO");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Patente: "+this.patente);
        System.out.println("Acompañantes: "+(this.acomAdult+this.acomNino));
        this.getConductor().mostrar();    
    
    }
    
    public void total(){
        int VARBASE = 3000;
        int varPasajero = this.acomAdult+this.acomNino;
        int varTotal = 0;
        
        if (varPasajero == 0){
            varTotal = (int) (VARBASE * 0.8);
        }else if(acomNino > 0 && acomAdult == 0){
            varTotal = (int) ((VARBASE + this.acomNino * 1000) * 0.8);
        }else {
            int varTotalNino = this.acomNino * 1000;
            int varTotalAdult = this.acomAdult * 1000;
            varTotal = VARBASE + varTotalNino + varTotalAdult;
        }
        System.out.println("El total a pagar es: $"+varTotal);
    }
    
}