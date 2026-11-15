package ejercicio2;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres; // porcentaje

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    // Extiende el comportamiento sin cambiar depositar/retirar
    public void aplicarIntereses() {
        depositar(getSaldo() * tasaInteres / 100);
    }
}