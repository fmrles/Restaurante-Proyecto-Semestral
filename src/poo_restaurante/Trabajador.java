package poo_restaurante;

public class Trabajador {

    //ATRIBUTOS
    private String nombre;
    private String rut;
    private String puesto;
    private String fono;

    //CONSTRUCTOR
    public Trabajador(String nombre, String rut, String puesto, String fono) {
        this.nombre = nombre;
        this.rut = rut;
        this.puesto = puesto;
        this.fono = fono;
    }

    //GET Y SET
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

}
