package com.openbootcamp;

/**
 * En este ejercicio tenéis que crear un bucle que permita
 * concatenar textos e imprima el resultado final por consola.
 *
 * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
 *
 * String[] nombres = {"", "", "", ""}
 */
public class Main {
    public static void main(String[] args) {
        String[] palabras = {"Curso", "de", "Java", "Básico", "-", "Ejercicio", "3"};
        String resultado = "";

        for (String palabra : palabras) {
            resultado += palabra + " ";
        }

        System.out.println(resultado);
    }
}
