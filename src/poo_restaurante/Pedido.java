package poo_restaurante;

public class Pedido {
    //ATRIBUTOS
    private String direccion;
    private String pedido;
    private int precio;
    private int id;
    private Cliente clienteNombre;

    //CONSTRUCTOR
    public Pedido (){
    }

    public Pedido (String direccion, Cliente clienteNombre, String pedido, int precio, int id){
     this.direccion = direccion;
     this.clienteNombre = clienteNombre;
     this.pedido = pedido;
     this.precio = precio;
     this.id = id;
    }

    public String getDireccion (){
     return direccion;
    }

    public void setDireccion ( String direccion){
        this.direccion = direccion;
    }

    public Cliente getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(Cliente clienteNombre) {
        this.clienteNombre = clienteNombre;
    }
    

    public String getPedido (){
        return pedido;
    }

    public void setPedido (String pedido){
        this.pedido = pedido;
    }

    public int getPrecio (){
        return precio;
    }

    public void setPrecio (int precioEnvio){
        this.precio = precioEnvio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
