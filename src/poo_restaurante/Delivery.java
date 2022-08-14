package poo_restaurante;

public class Delivery {
    //ATRIBUTOS
    private String direccion;
    private String pedido;
    private int precio;
    private int id;

    //CONSTRUCTOR
    public Delivery (){
    }

    public Delivery (String direccion, String pedido, int precio, int id){
     this.direccion = direccion;
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
