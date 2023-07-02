// Clase Edificio
public class Edificio implements ImpactoEcologico{
    private String ubicacion;
    private int numPisos;
    private String tipoConstruccion;

    public Edificio() {
        this.ubicacion = ubicacion;
        this.numPisos = numPisos;
        this.tipoConstruccion = tipoConstruccion;
    }

    public void obtenerInformacion() {
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Número de pisos: " + numPisos);
        System.out.println("Tipo de construcción: " + tipoConstruccion);
    }

    public double calcularAreaTotal() {
        // Implementa el cálculo del área total del edificio
        return 0.0;
    }

    @Override
    public double obtenerImpactoEcologico(double consumoEnergia, double emisionesCO2, int cantidadResiduos) {
        // Cálculo del impacto ecológico del carbono para un edificio
        double impactoCarbono = emisionesCO2 * 0.8; // Ejemplo de cálculo específico para un edificio
        return impactoCarbono;
    }
}