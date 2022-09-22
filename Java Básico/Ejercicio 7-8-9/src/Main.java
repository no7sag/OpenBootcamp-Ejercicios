/**
 * Dada la función:
 *   public static String reverse(String texto) { }
 * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
 * 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 * 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada
 *    elemento en ambas dimensiones.
 * 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento
 *    y muestra el resultado final.
 * 4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos
 *    1000 elementos para ser añadidos al mismo.
 * 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando
 *    únicamente el valor de cada elemento.
 * 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
 *    con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList
 *    final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 * 7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
 *    ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara
 *    la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier
 *    caso: "Demo de código".
 * 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
 *    La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero
 *    dado en "fileOut".
 * 9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones,
 * un HashMap y un ArrayList, LinkedList o array.
 */
import java.io.*;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String texto = "hola mundo";
        System.out.println(reverse(texto) + "\n");

        ////////
        // 1. //
        ////////
        String[] arrayUnidimensional = {"array", "unidimensional", "de", "strings"};
        for (String cadena : arrayUnidimensional)
            System.out.print(cadena + " ");
        System.out.println("\n");

        ////////
        // 2. //
        ////////
        int[][] arrayBidimensional = {
                {2, 4},
                {6, 8},
                {10, 12}
        };
        for (int i=0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++)
                System.out.println("Valor en " + i + "," + j + ": " + arrayBidimensional[i][j]);
        }
        System.out.print("\n");

        ////////
        // 3. //
        ////////
        Vector<Integer> vectorPrueba = new Vector<>(5);
        vectorPrueba.add(1);
        vectorPrueba.add(2);
        vectorPrueba.add(3);
        vectorPrueba.add(4);
        vectorPrueba.add(5);
        vectorPrueba.remove(1);
        vectorPrueba.remove(2);
        for (Integer elemento : vectorPrueba)
            System.out.println(elemento);

        ////////
        // 4. //
        ////////
        // El siguiente ejemplo crea un vector con parámetros por defecto (capacidad y
        // capacidad incremental = 10) y le añadimos 1000 elementos. Esto carece de optimización
        // ya que deberá incrementar su capacidad constantemente.
        // Lo ideal es generar la instancia del vector desde ya con una capacidad acorde
        // a la cantidad de elementos que tendrá.
        Vector<Integer> vectorNoEficiente = new Vector<>();
        for (int i=0; i <= 1000; i++)
            vectorNoEficiente.add(i);
        System.out.print("\n");

        ////////
        // 5. //
        ////////
        ArrayList<String> arrayListStrings = new ArrayList<>();
        arrayListStrings.add("perro");
        arrayListStrings.add("gato");
        arrayListStrings.add("vaca");
        arrayListStrings.add("caballo");

        LinkedList<String> linkedListStrings = new LinkedList<>(arrayListStrings);

        for (int i=0; i < arrayListStrings.size(); i++)
            System.out.println("Elemento en arrayListStrings: " + arrayListStrings.get(i));
        for (int i=0; i < linkedListStrings.size(); i++)
            System.out.println("Elemento en linkedListStrings: " + linkedListStrings.get(i));

        ////////
        // 6. //
        ////////
        ArrayList<Integer> arrayListEnteros = new ArrayList<>();

        for (int i=0; i <= 10; i++)
            arrayListEnteros.add(i);

        for (int i=0; i <= arrayListEnteros.size(); i++) {
            if (arrayListEnteros.get(i) % 2 == 0)
                arrayListEnteros.remove(i);
        }
        for (Integer elem : arrayListEnteros)
            System.out.println(elem);
        System.out.print("\n");

        ////////
        // 7. //
        ////////
        try {
            DividePorCero(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        ////////
        // 8. //
        ////////
        copiarArchivo("archivo_original.txt", "archivo_copia.txt");
    }

    static String reverse(String texto) {
        char letra;
        String resultado = "";

        for (int i=0; i < texto.length(); i++) {
            letra = texto.charAt(i);
            resultado = letra + resultado;
        }
        return resultado;
    }

    static int DividePorCero(int a, int b) throws ArithmeticException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }

    static void copiarArchivo(String fileIn, String fileOut) {
        try {
            InputStream archivoOriginal = new FileInputStream(fileIn);
            try {
                byte[] datos = archivoOriginal.readAllBytes();
                archivoOriginal.close();

                PrintStream archivoSalida = new PrintStream(fileOut);
                archivoSalida.write(datos);
                archivoSalida.close();

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
