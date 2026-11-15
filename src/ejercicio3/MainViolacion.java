package ejercicio3;

public class MainViolacion {
    public static void main(String[] args) {
        // Versión incorrecta
        Transporte malo = new CocheElectricoInvalido();
        try {
            malo.mover();
        } catch (UnsupportedOperationException e) {
            System.out.println("Violación del LSP: " + e.getMessage());
        }

        // Versión corregida
        Transporte bueno = new CocheElectrico();
        bueno.mover();
        bueno.mover();
    }
}