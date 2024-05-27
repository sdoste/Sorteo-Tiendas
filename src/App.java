import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> librosPapeleria = new ArrayList<>();
        librosPapeleria.add("El señor de los anillos");
        librosPapeleria.add("Harry Potter y la piedra filosofal");
        librosPapeleria.add("Cien años de soledad");
        librosPapeleria.add("1984");
        librosPapeleria.add("Orgullo y prejuicio");
        
        Papeleria papeleria1 = new Papeleria("Papeleria A", 123456789,
        "Ubicacion A", new ArrayList<>(), librosPapeleria);

        ArrayList<String> inventarioTienda = new ArrayList<>();
        inventarioTienda.add("Portátil ASUS ZenBook");
        inventarioTienda.add("Monitor LG UltraGear 27GL850-B");
        inventarioTienda.add("Teclado mecánico Corsair K95 RGB Platinum XT");
        inventarioTienda.add("Ratón Logitech G502 Hero");
        inventarioTienda.add("Auriculares inalámbricos Sony WH-1000XM4");

        tiendaInformatica tiendaInformatica1 = new tiendaInformatica("Tienda A", 987654321,
        "Ubicacion B", new ArrayList<>(), inventarioTienda);

        papeleria1.inscribirDatos("Juan", 658741235);
        papeleria1.inscribirDatos("Maria", 625487412);
        papeleria1.inscribirDatos("Carlos", 698715247);
        papeleria1.inscribirDatos("Frida", 669857689);
        for (int i = 0; i < papeleria1.getClientes().size(); i++){
            System.out.println(papeleria1.getClientes().get(i).getName());
        };

        System.out.println(papeleria1.comunicarResultado());

        tiendaInformatica1.inscribirDatos("Narciso", 658741235);
        tiendaInformatica1.inscribirDatos("Robustiana", 625487412);
        tiendaInformatica1.inscribirDatos("Andrés", 698715247);
        tiendaInformatica1.inscribirDatos("Ciprano", 669857689);
        for (int i = 0; i < tiendaInformatica1.getClientes().size(); i++){
            System.out.println(tiendaInformatica1.getClientes().get(i).getName());
        };
        System.out.println(tiendaInformatica1.comunicarResultado());
    }
}
