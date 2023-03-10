import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, String nombre, String apellido) {
        super(numeroDeTelefono);
        this.nombre = nombre;
        this.apellido = apellido;
        this.prestamos = new ArrayList<>();
    }

    public void printInformacionPersonal() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + getNumeroDeTelefono());
    }

    public void printTodaLaInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + getNumeroDeTelefono());
        for (Prestamo p : prestamos) {
            System.out.println("ID de préstamo: " + p.getId());
        }
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public void eliminarPrestamo(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }
}

/**
 * Cambios realizados en el código
 * Elimina el campo str.
 * Agrega campos nombre y apellido para almacenar los nombres y apellidos del profesor.
 * Agrega un constructor que acepta los valores numeroDeTelefono, nombre y apellido y los usa para inicializar los campos correspondientes.
 * Cambia el tipo de datos de la lista prestamos a ArrayList.
 * Cambia el método printTodaLaInformacion() para imprimir información útil sobre cada préstamo.
 * Agrega métodos agregarPrestamo() y eliminarPrestamo() para agregar y eliminar préstamos de la lista prestamos.
 * Agrega métodos para obtener y establecer la edad, el nombre, el apellido y los préstamos.
 */