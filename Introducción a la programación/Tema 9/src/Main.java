public class Main {
    public static void main(String[] args) {

        Cliente clientePrueba = new Cliente();
        clientePrueba.nombre = "Patricia";
        clientePrueba.edad = 27;
        clientePrueba.telefono = 11223344;
        clientePrueba.credito = 10000;

        System.out.println("\n--- Cliente ---");
        System.out.println("Nombre: " + clientePrueba.nombre);
        System.out.println("Edad: " + clientePrueba.edad);
        System.out.println("Teléfono: " + clientePrueba.telefono);
        System.out.println("Crédito: " + clientePrueba.credito);


        Trabajador trabajadorPrueba = new Trabajador();
        trabajadorPrueba.nombre = "Samuel";
        trabajadorPrueba.edad = 31;
        trabajadorPrueba.telefono = 10203040;
        trabajadorPrueba.salario = 20000;

        System.out.println("\n--- Trabajador ---");
        System.out.println("Nombre: " + trabajadorPrueba.nombre);
        System.out.println("Edad: " + trabajadorPrueba.edad);
        System.out.println("Teléfono: " + trabajadorPrueba.telefono);
        System.out.println("Salario: " + trabajadorPrueba.salario);

    }
}

class Persona {
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}