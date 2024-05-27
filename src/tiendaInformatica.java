import java.util.ArrayList;
import java.util.Random;

public class tiendaInformatica implements sorteoClientes{
    private String nombreTienda;
    private int numeroSeguridadSocial;
    private String ubicacion;
    private ArrayList<Cliente> clientes;
    private ArrayList<String> inventario;
    

    public tiendaInformatica(String nombreTienda, int numeroSeguridadSocial, String ubicacion,
            ArrayList<Cliente> clientes, ArrayList<String> inventario) {
        this.nombreTienda = nombreTienda;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.ubicacion = ubicacion;
        this.clientes = clientes;
        this.inventario = inventario;
    }


    public void inscribirDatos(String nombre, int telefono){
        this.clientes.add(new Cliente(nombre, telefono));
    }

    public int comunicarResultado(){
        return new Random().nextInt(1000 + 1);
    }


    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public int getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(int numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<String> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<String> inventario) {
        this.inventario = inventario;
    }


}