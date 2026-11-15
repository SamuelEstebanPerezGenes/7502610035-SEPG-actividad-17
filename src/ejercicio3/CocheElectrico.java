package ejercicio3;

public class CocheElectrico extends Transporte {
    private int bateria = 100;

    @Override
    public void mover() {
        if (bateria <= 0) {
            recargar(); // resuelve el caso internamente, sin romper el contrato
        }
        bateria -= 20;
        System.out.println("El coche eléctrico avanza en silencio. Batería: " + bateria + "%");
    }

    public void recargar() {
        bateria = 100;
        System.out.println("Batería recargada.");
    }
}