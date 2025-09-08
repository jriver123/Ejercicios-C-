package run;

import Models.Libro;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto con el constructor vacío y usar setters
        Libro libro1 = new Libro();
        libro1.setTitulo("Diario de Greg");
        libro1.setAutor("Jeff Kenney");
        libro1.setNumPaginas(217);

        System.out.println(libro1.descripcion());

        // Crear otro objeto con el constructor con parámetros
        Libro libro2 = new Libro("Cronicas de una muerte anunciada", "Gabriel García Márquez", 542);

        System.out.println("\n" + libro2);
    }
}