import java.util.ArrayList;
import java.util.List;
public class Asignatura {
    private int id;
    private String nombre;
    private String profesor;

    public Asignatura(int id, String nombre, String profesor) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesor() {
        return profesor;
    }
}
