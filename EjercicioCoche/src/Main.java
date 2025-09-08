package run;

import models.Coche;

public class Main {
    public static void main(String[] args)
    {
        //Crear un objeto de la clase Coche
        Coche coche = new Coche();

        //Asignar valores a los atributos
        coche.marca = "Chevrolet";
        coche.modelo = "Groove";
        coche.anio = 2025;

        //Mostrar los datos del coche
        System.out.println(coche.mostrarDatos());
    }
}