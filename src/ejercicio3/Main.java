package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Transporte[] transportes = { new Bicicleta(), new Coche() };

        // Ambas derivadas sustituyen a Transporte sin alterar el programa
        for (Transporte t : transportes) {
            t.mover();
        }
    }
}