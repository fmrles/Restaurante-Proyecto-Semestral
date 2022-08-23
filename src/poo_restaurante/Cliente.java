package poo_restaurante;

public class Cliente {

    //ATRIBUTOS
    private String nombre;
    private String celular;
    private int id;

    // CONSTRUCTOR
    public Cliente(String n, String c, int id) {
        this.nombre = n;
        this.celular = c;
        this.id = id;

    }

    //GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
