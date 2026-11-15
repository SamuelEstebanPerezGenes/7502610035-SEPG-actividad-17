package ejercicio2;

// VIOLA el LSP: lanza una excepción que el contrato de la base no prevé
public class CuentaAhorrosInvalida extends CuentaBancaria {

    public CuentaAhorrosInvalida(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public boolean retirar(double monto) {
        throw new UnsupportedOperationException("Esta cuenta no permite retiros.");
    }
}