import java.util.ArrayList;
import java.util.List;
public class Estudiante {
    private int id;
    private String nombre;
    private List<Asignatura> asistencias;

    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.asistencias = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Asignatura> getAsistencias() {
        return asistencias;
    }

    public void registrarAsistencia(Asignatura asignatura) {
        asistencias.add(asignatura);
    }
}
