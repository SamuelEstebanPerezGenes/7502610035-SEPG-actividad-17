package ejercicio1;

public abstract class Figura {
    // Contrato: devuelve el área (siempre un número >= 0)
    public abstract double area();

    public void mostrarArea() {
        System.out.println(getClass().getSimpleName() + " - Área: " + area());
    }
}