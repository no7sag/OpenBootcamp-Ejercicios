public class Main {
    public static void main(String[] args) {
        Persona personaPrueba = new Persona();

        personaPrueba.setNombre("Alejandro");
        personaPrueba.setEdad(29);
        personaPrueba.setTelefono(13792468);

        System.out.println("Nombre: " + personaPrueba.getNombre());
        System.out.println("Edad: " + personaPrueba.getEdad());
        System.out.println("Teléfono: " + personaPrueba.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // getters
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getTelefono() {
        return this.telefono;
    }
}