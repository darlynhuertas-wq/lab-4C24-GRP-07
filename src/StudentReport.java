public class StudentReport {

    public String generarReporte(StudentModel estudiante) {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte de Estudiante\n");
        reporte.append("----------------------\n");
        reporte.append("ID: ").append(estudiante.getId()).append("\n");
        reporte.append("Nombre: ").append(estudiante.getNombre()).append(" ").append(estudiante.getApellido()).append("\n");
        reporte.append("Promedio: ").append(estudiante.getPromedio()).append("\n");
        reporte.append("Estado: ").append(estudiante.getPromedio() >= 13 ? "Aprobado" : "Desaprobado");
        return reporte.toString();
    }
}