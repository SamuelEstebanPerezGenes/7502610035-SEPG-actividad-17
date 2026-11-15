package ejercicio2;

public class MainViolacion {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaAhorrosInvalida(1000);

        try {
            cuenta.retirar(200); // el cliente espera true o false, no una excepción
        } catch (UnsupportedOperationException e) {
            System.out.println("Violación del LSP: " + e.getMessage());
        }
    }
}