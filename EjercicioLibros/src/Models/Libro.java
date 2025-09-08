package Models;

public class Libro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor vacío
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String descripcion() {
        return "Título: " + titulo +
                "\nAutor: " + autor +
                "\nNúmero de páginas: " + numPaginas;
    }

    public String toString() {
        return descripcion();
    }
}