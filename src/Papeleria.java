import java.util.ArrayList;
import java.util.Random;

public class Papeleria implements sorteoClientes {
    private String nombreTienda;
    private int numeroSeguridadSocial;
    private String ubicacion;
    private ArrayList<Cliente> clientes;
    private ArrayList<String> libros;
    
    public Papeleria(String nombreTienda, int numeroSeguridadSocial, String ubicacion, ArrayList<Cliente> clientes,
            ArrayList<String> libros) {
        this.nombreTienda = nombreTienda;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.ubicacion = ubicacion;
        this.clientes = clientes;
        this.libros = libros;
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

    public ArrayList<String> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<String> libros) {
        this.libros = libros;
    }
    

}
