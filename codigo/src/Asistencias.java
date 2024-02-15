public class Asistencias {
    public void tomarAsistencia(Estudiante estudiante, Asignatura asignatura) {
        estudiante.registrarAsistencia(asignatura);
    }

    public void mostrarAsistencias(Estudiante estudiante) {
        System.out.println("Asistencias para el estudiante " + estudiante.getNombre() + ":");
        for (Asignatura asignatura : estudiante.getAsistencias()) {
            System.out.println("- " + asignatura.getNombre() + " impartida por " + asignatura.getProfesor());
        }
        System.out.println();
    }
}
