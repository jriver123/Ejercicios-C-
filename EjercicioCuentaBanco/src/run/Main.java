package run;

import Models.cuentabanco;

public class Main {
    public static void main(String[] args) {
        // Crear cuenta con constructor con parámetros
        cuentabanco cuenta1 = new cuentabanco("Priscila", 500.0);

        System.out.println(cuenta1.descripcion());

        // Depositar dinero
        cuenta1.depositar(200);

        // Retirar dinero
        cuenta1.retirar(100);

        // Intentar retirar más de lo que hay
        cuenta1.retirar(700);
    }
}
