public class StudentView {

    public void mostrarEstudiante(StudentModel estudiante) {
        System.out.println("=== Datos del Estudiante ===");
        System.out.println("ID: " + estudiante.getId());
        System.out.println("Nombre completo: " + estudiante.getNombre() + " " + estudiante.getApellido());
        System.out.println("Promedio: " + estudiante.getPromedio());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}