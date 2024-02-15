
public class Main {
    public static void main(String[] args) {
        Asistencias manager = new Asistencias();

        Estudiante estudiante1 = new Estudiante(1, "Carlos");
        Estudiante estudiante2 = new Estudiante(2, "Daniela");

        Asignatura asignatura1 = new Asignatura(1, "Analisis Matematico", "Profesor A");
        Asignatura asignatura2 = new Asignatura(2, "Programacion Orientada a Objetos", "Profesor B");

        manager.tomarAsistencia(estudiante1, asignatura1);
        manager.tomarAsistencia(estudiante1, asignatura2);
        manager.tomarAsistencia(estudiante2, asignatura1);

        manager.mostrarAsistencias(estudiante1);
        manager.mostrarAsistencias(estudiante2);
        }
    }

