import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    // - Primero probar instanciar una o dos bicicletas sueltas
    Bicicleta mountainBike = new Bicicleta("Trek", "X-Caliber", 24, true, 599.99);
    Bicicleta cityBike = new Bicicleta("Giant", "Escape 3", false, true, 349.99);
    Bicicleta roadBike = new Bicicleta("Specialized", "Allez", 18, false, 899.99);
    Bicicleta foldingBike = new Bicicleta("Brompton", "M6L", 6, true, 1499.99);
    Bicicleta kidsBike = new Bicicleta("Carrera", "Saruna", false, true, 129.99);
    Bicicleta touringBike = new Bicicleta("Surly", "Long Haul Trucker", 27, true, 1599.99);
    Bicicleta electricBike = new Bicicleta("Rad Power Bikes", "RadRover", 7, true, 1499.99);

    mountainBike.cambiarMarchas();
    mountainBike.tocarClaxon();
    mountainBike.pedalear();
    mountainBike.parar();
    mountainBike.girar();

    // - Luego, probar a crear un arraylist  de bicicletas
    ArrayList<Bicicleta> bicicletas = new ArrayList<>();
    bicicletas.add(mountainBike);
    bicicletas.add(cityBike);
    bicicletas.add(roadBike);
    bicicletas.add(foldingBike);
    bicicletas.add(kidsBike);
    bicicletas.add(touringBike);
    bicicletas.add(electricBike);

    // - Y recorrer ese arraylist  para mostrarlo con bucle for y/o for-each
    for (Bicicleta bici : bicicletas){
        System.out.println(bici.toString());
    }
    // - También se puede mostrar una sola propiedad (o varias) de las bicicletas. Ej: mostrar solo marca y
    // velocidad máxima de todas las bicicletas.
    for (Bicicleta bici : bicicletas){
        System.out.println("Es de la marca " + bici.getMarca() + ", del modelo " + bici.getModelo() + " y cuesta " + bici.getPrecio() +  " euros.");
    }
    }
}
