public class Main {
    public static void main(String[] args) {
        // Primera parte
        int resultado = sumar(2, 3, 5);

        System.out.println("Resultado de la suma: " + resultado);

        // Segunda parte
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();

        System.out.println("Cantidad de puertas: " + miCoche.puertas);
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 4;

    public void agregarPuerta() {
        this.puertas++;
    }
}