package ejercicio3;

// VIOLA el LSP: mover() lanza una excepción no prevista por Transporte
public class CocheElectricoInvalido extends Transporte {
    @Override
    public void mover() {
        throw new UnsupportedOperationException("Coche eléctrico necesita recarga.");
    }
}