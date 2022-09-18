package com.openbootcamp;

/**
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
public class Main {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        smartphone.marca = "Samsung";
        smartphone.modelo = "Galaxy S22";
        smartphone.color = "negro";
        smartphone.peso = 168;
        smartphone.numCamaras = 4;
        smartphone.sensorHuellaDactilar = true;

        SmartWatch smartwatch = new SmartWatch();
        smartwatch.marca = "Apple";
        smartwatch.modelo = "Watch Series 3";
        smartwatch.color = "blanco";
        smartwatch.peso = 32;
        smartwatch.resistenciaAgua = true;
        smartwatch.cargaInalambrica = true;

        System.out.println(smartphone);
        System.out.println(smartwatch);
    }
}
