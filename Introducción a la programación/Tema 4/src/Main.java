public class Main {

    public static void main(String[] args) {

        // if
        int numeroIf = 7;
        if (numeroIf == 0) {
            System.out.println("Variable numeroIf es igual a 0\n");
        } else if (numeroIf > 0) {
            System.out.println("Variable numeroIf es un número positivo\n");
        } else {
            System.out.println("Variable numeroIf es un número negativo\n");
        }

        // while
        int numeroWhile = 1;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Variable numeroWhile: " + numeroWhile);
        }

        // do-while
        do {
            numeroWhile++;
            System.out.println("\nVariable numeroWhile (versión do-while): " + numeroWhile);
        } while (numeroWhile < 4);
        System.out.println();

        // for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Variable numeroFor: " + numeroFor);
        }

        // switch
        var estacion = "invierno";

        switch (estacion) {
            case "otoño":
                System.out.println("\nEstamos en otoño");
                break;
            case "invierno":
                System.out.println("\nEstamos en Invierno");
                break;
            case "primavera":
                System.out.println("\nEstamos en primavera");
                break;
            case "verano":
                System.out.println("\nEstamos en verano");
                break;
            default:
                System.out.println("\nEstación no reconocida");
        }

    }

}