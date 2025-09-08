package Models;

public class cuentabanco {
    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor vacío
    public cuentabanco() {
    }

    // Constructor con parámetros
    public cuentabanco(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getters y Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos de negocio
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se depositaron $" + cantidad + ". Saldo actual: $" + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se retiraron $" + cantidad + ". Saldo actual: $" + saldo);
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente. Su saldo actual es $" + saldo);
        } else {
            System.out.println("La cantidad a retirar debe ser mayor a 0.");
        }
    }

    public String descripcion() {
        return "Titular: " + titular + "\nSaldo: $" + saldo;
    }

    public String toString() {
        return descripcion();
    }
}