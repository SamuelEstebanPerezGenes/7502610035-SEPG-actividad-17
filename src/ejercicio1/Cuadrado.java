package ejercicio1;

// Extiende Figura, NO Rectangulo: así no hereda un contrato que no puede cumplir
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}