public class StudentModel {
    private int id;
    private String nombre;
    private String apellido;
    private double promedio;

    public StudentModel() {
    }

    public StudentModel(int id, String nombre, String apellido, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}