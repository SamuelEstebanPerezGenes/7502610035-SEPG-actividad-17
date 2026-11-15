package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = { new Circulo(3), new Rectangulo(4, 5), new Cuadrado(4) };

        // El código cliente solo conoce Figura: cualquier derivada la sustituye
        for (Figura f : figuras) {
            f.mostrarArea();
        }
    }
}