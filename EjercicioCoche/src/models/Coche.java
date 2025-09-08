package models;

public class Coche {
    //Atributos
    public String marca;
    public String modelo;
    public int anio;

    public String mostrarDatos(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAnio: " + anio;
    }
}