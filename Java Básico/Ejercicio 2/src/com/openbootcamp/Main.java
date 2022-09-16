package com.openbootcamp;

/**
 * Para este ejercicio tendréis que crear una función que
 * reciba un precio y devuelva el precio con el IVA incluido.
 */
public class Main {
    public static void main(String[] args) {
        double precioFinal = precioConIVA(149.99);
        System.out.println(precioFinal);
    }

    static double precioConIVA(double precio) {
        return precio * 1.21;
    }
}
