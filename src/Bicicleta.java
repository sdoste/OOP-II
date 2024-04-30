// - Debes crear una clase Bicicleta con características como: Marca, Modelo, Velocidad Máxima, Si
// tiene marchas o no … (estas características puedes cambiarlas según tu gusto)

import java.util.Scanner;

public class Bicicleta {
    private String marca;
    private String modelo;
    private boolean tieneMarchas;
    private int marchas;
    private boolean tieneTimbre;
    private double precio;
    
    private boolean enMovimiento;
    private String dirección;
    private int marchaPuesta = 0;

    //Constructor con nº de marchas
public Bicicleta(String marca, String modelo, int marchas, boolean tieneTimbre, double precio){
    this.marca = marca;
    this.modelo = modelo;
    this.marchas = marchas;
    this.precio = precio;
    if (marchas>0){
        this.tieneMarchas = true;
        this.marchaPuesta = 1;
    } else{
        this.tieneMarchas = false;
    }
}

    //Constructor con boolean para tieneMarchas.
public Bicicleta(String marca, String modelo, boolean tieneMarchas, boolean tieneTimbre, double precio){
    this.marca = marca;
    this.modelo = modelo;
    this.tieneMarchas = tieneMarchas;
    if (!tieneMarchas){this.marchas = 0;}
    this.precio = precio;
}



public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public boolean isTieneMarchas() {
    return tieneMarchas;
}

public void setTieneMarchas(boolean tieneMarchas) {
    this.tieneMarchas = tieneMarchas;
}

public int getMarchas() {
    return marchas;
}

public void setMarchas(int marchas) {
    this.marchas = marchas;
}

public boolean isTieneTimbre() {
    return tieneTimbre;
}

public void setTieneTimbre(boolean tieneTimbre) {
    this.tieneTimbre = tieneTimbre;
}

public double getPrecio() {
    return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

@Override
public String toString(){
    String marchas;
    String timbre;
    if (tieneMarchas){
        marchas = ", tiene " + this.marchas + " marchas";
    } else{
        marchas = ", no tiene marchas";
    }
    if (tieneTimbre){
        timbre = ", tiene timbre ";
    } else{
        timbre = ", no tiene timbre ";
    }
    return "La bicicleta de Marca " + this.marca + " y modelo " + this.modelo + marchas + timbre + "y su precio es de " + this.precio + " euros.";
}

//Métodos

public void tocarClaxon(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("¿Cuántas veces quieres tocar el timbre?");
    int veces = Integer.parseInt(teclado.nextLine());
    if (veces > 20){
        System.out.println("¡No tantas, carcamal!");
    } else if (veces > 0){
        for (int i = veces; i>0; i--){
            System.out.println("¡Ding!");
        }
    }
}

public void pedalear(){
    this.enMovimiento = true;
    System.out.println("Estás pedaleando.");
}

public void parar(){
    this.enMovimiento = false;
    System.out.println("Has dejado de pedalear.");
}

public void girar(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("¿Hacia dónde quieres girar? Derecha/Izquierda/Media vuelta");
    String giro = teclado.nextLine().toLowerCase();
    switch (giro) {
        case "derecha":
            System.out.println("Has girado a la derecha.");
            break;
        case "izquierda":
            System.out.println("Has girado a la izquierda.");
            break;
        case "mediavuelta":
        case "media vuelta":  
            System.out.println("Has dado media vuelta.");
            break;
        default:
            System.out.println("No sé qué dirección es esa.");
            break;
    }
}

public void cambiarMarchas(){
    if (tieneMarchas){
        String intro = "";
        while(!intro.equals("salir")){
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Quieres cambiar marchas? Escribe salir para salir.");
            intro = teclado.nextLine();
            if (intro.equals("sí")||intro.equals("si")||intro.equals("s")){
                if (this.marchaPuesta == this.marchas){
                    System.out.println("Estás en la marcha más alta " + this.marchaPuesta + ". La bici no tiene más marchas. ¿Quieres bajar una marcha?");
                    String respuestaBajar = teclado.nextLine().toLowerCase();
                    if (respuestaBajar.equals("sí")||respuestaBajar.equals("si")||respuestaBajar.equals("s")||respuestaBajar.equals("bajar")){
                        this.marchaPuesta--;
                        System.out.println("Has bajado a la marcha n " + this.marchaPuesta);
                    }
                } else if ((this.marchaPuesta == 1)){
                    System.out.println("Estás en la marcha más pequeña, la " + this.marchaPuesta + ". ¿Quieres subir una marcha?");
                    String respuestaSubir = teclado.nextLine().toLowerCase();
                    if (respuestaSubir.equals("sí")||respuestaSubir.equals("si")||respuestaSubir.equals("s")||respuestaSubir.equals("subir")){
                        this.marchaPuesta++;
                        System.out.println("Has subido a la marcha n " + this.marchaPuesta);
                    }
                } else{
                    System.out.println("Estás en la marcha " + this.marchaPuesta + ". ¿Quieres subir o bajar una marcha?");
                    String subirBajar = teclado.nextLine().toLowerCase();
                   switch (subirBajar) {
                    case "subir":
                        this.marchaPuesta++;
                        System.out.println("Has subido a la marcha n " + this.marchaPuesta);
                        break;
                    case "bajar":
                        this.marchaPuesta--;
                        System.out.println("Has bajado a la marcha n " + this.marchaPuesta);
                        break;
                    default:
                        System.out.println("No te he entendido. Introduce solo subir o bajar.");
                        break;
                   }
                }
            } else if(intro.equals("salir")){
                intro = "salir";
            } else{
                System.out.println("Respuesta inválida.");
            }
        }
    } else{
        System.out.println("Esta bicicleta no tiene marchas.");
    }

}

// - Puedes añadir métodos: tocar el claxon, pedalear, parar, girar, cambiar marchas, …





// - Probar métodos set desde el main()

// +EXTRA: crear o cambiar o leer desde el scanner de usuario (con o sin bucle)


       //constructor
 
   
    
}
