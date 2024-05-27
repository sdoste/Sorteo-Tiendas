public class Cliente {
    private String name;
    private int telefono;
    
    public Cliente(String name, int telefono) {
        this.name = name;
        this.telefono = telefono;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
}
