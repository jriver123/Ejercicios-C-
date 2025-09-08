package run;

import models.Estudiante;


public class Main {

    public static void main(String[] args) {
        // Crear estudiante con constructor vacío y usar setters
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Jonathan Rivera");
        estudiante1.setMatricula("2025-001");
        estudiante1.setPromedio(98);

        System.out.println(estudiante1.descripcion());

        // Crear estudiante con constructor con parámetros
        Estudiante estudiante2 = new Estudiante("Josue Guido", "2025-002", 60);

        System.out.println("\n" + estudiante2);
    }
}
