import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private List<StudentModel> listaEstudiantes;
    private StudentReport report;
    private StudentView view;

    public StudentController() {
        this.listaEstudiantes = new ArrayList<>();
        this.report = new StudentReport();
        this.view = new StudentView();
    }

    public void agregarEstudiante(StudentModel estudiante) {
        listaEstudiantes.add(estudiante);
        view.mostrarMensaje("Estudiante agregado correctamente.");
    }

    public void mostrarTodos() {
        if (listaEstudiantes.isEmpty()) {
            view.mostrarMensaje("No hay estudiantes registrados.");
            return;
        }
        for (StudentModel estudiante : listaEstudiantes) {
            view.mostrarEstudiante(estudiante);
        }
    }

    public void generarReporte(int id) {
        for (StudentModel estudiante : listaEstudiantes) {
            if (estudiante.getId() == id) {
                String reporte = report.generarReporte(estudiante);
                view.mostrarMensaje(reporte);
                return;
            }
        }
        view.mostrarMensaje("Estudiante no encontrado.");
    }

    public static void main(String[] args) {
        StudentController controller = new StudentController();

        controller.agregarEstudiante(new StudentModel(1, "Boris", "Tito", 16.5));
        controller.agregarEstudiante(new StudentModel(2, "Ana", "Perez", 12.0));

        controller.mostrarTodos();
        controller.generarReporte(1);
    }
    public void mostrarInfoCompleta(int id) {
        for (StudentModel estudiante : listaEstudiantes) {
            if (estudiante.getId() == id) {
                System.out.println(estudiante.toString());
                return;
            }
        }
        view.mostrarMensaje("Estudiante no encontrado.");
    }
}