public class Auto implements ImpactoEcologico{
    private String marca;
    private String modelo;
    private int anioFabricacion;

    public Auto() {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public void arrancar() {
        System.out.println("El auto ha arrancado.");
    }

    public void acelerar() {
        System.out.println("El auto está acelerando.");
    }

    public void frenar() {
        System.out.println("El auto está frenando.");
    }

    public void apagar() {
        System.out.println("El auto ha sido apagado.");
    }

    @Override
    public double obtenerImpactoEcologico(double consumoEnergia, double emisionesCO2, int cantidadResiduos) {
        // Cálculo del impacto ecológico del carbono para un auto
        double impactoCarbono = emisionesCO2 * 1.2; // Ejemplo de cálculo específico para un auto
        return impactoCarbono;
    }
}