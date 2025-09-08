package models;

public class Estudiante {
    // Atributos privados
    private String nombre;
    private String matricula;
    private double promedio;

    // Constructor vacío
    public Estudiante() {
    }

    // Constructor con parámetros
    public Estudiante(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean aprobo() {
        return promedio >= 70;
    }

    public String descripcion() {
        return "Nombre: " + nombre +
                "\nMatrícula: " + matricula +
                "\nPromedio: " + promedio +
                "\nEstado: " + (aprobo() ? "Aprobado " : "Reprobado ");
    }
    public String toString() {
        return descripcion();
    }
}