package ejercicio2;

public class Main {

    // Código cliente: solo conoce CuentaBancaria
    static void operar(CuentaBancaria cuenta) {
        cuenta.depositar(500);
        cuenta.retirar(200);
        boolean retiro = cuenta.retirar(5000);
        System.out.println(cuenta.getClass().getSimpleName()
                + " -> saldo: " + cuenta.getSaldo()
                + " | retiro de 5000 aceptado: " + retiro);
    }

    public static void main(String[] args) {
        CuentaBancaria base = new CuentaBancaria(1000);
        CuentaAhorros ahorros = new CuentaAhorros(1000, 2);

        operar(base);
        operar(ahorros); // sustituye a la base sin alterar el resultado

        ahorros.aplicarIntereses();
        System.out.println("Saldo de ahorros tras intereses: " + ahorros.getSaldo());
    }
}