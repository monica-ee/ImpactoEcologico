import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear objetos clases Edificio, Auto y Bicicleta
        Edificio edificio = new Edificio();
        Auto auto = new Auto();
        Bicicleta bicicleta = new Bicicleta();

        // Crear ArrayList para almacenar los objetos ImpactoEcologico
        ArrayList<ImpactoEcologico> impactoEcologicoList = new ArrayList<>();

        // Agregar los objetos a la lista
        impactoEcologicoList.add(edificio);
        impactoEcologicoList.add(auto);
        impactoEcologicoList.add(bicicleta);

        // Iterar a través de la lista y llamar al método obtenerImpactoEcologico
        for (ImpactoEcologico impactoEcologico : impactoEcologicoList) {
            // Imprimir información de identificación del objeto
            if (impactoEcologico instanceof Edificio) {
                System.out.println("Objeto: Edificio");
            } else if (impactoEcologico instanceof Auto) {
                System.out.println("Objeto: Auto");
            } else if (impactoEcologico instanceof Bicicleta) {
                System.out.println("Objeto: Bicicleta");
            }

            // Llamar al método obtenerImpactoEcologico y mostrar el resultado
            double impactoCarbono = impactoEcologico.obtenerImpactoEcologico(0, 0, 0);
            System.out.println("Impacto de carbono: " + impactoCarbono);
            System.out.println("--------------------");
        }
    }
}