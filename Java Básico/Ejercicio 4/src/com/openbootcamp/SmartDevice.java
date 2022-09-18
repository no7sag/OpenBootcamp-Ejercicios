package com.openbootcamp;

public abstract class SmartDevice {
    String marca;
    String modelo;
    String color;
    int peso;  // en gramos

    SmartDevice(){}

    SmartDevice(String marca, String modelo, String color, int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.peso = peso;
    }
}

class SmartPhone extends SmartDevice {
    int numCamaras;
    boolean sensorHuellaDactilar;

    SmartPhone(){}

    SmartPhone(String marca, String modelo, String color, int peso, int numCamaras, boolean sensorHuellaDactilar) {
        super(marca, modelo, color, peso);
        this.numCamaras = numCamaras;
        this.sensorHuellaDactilar = sensorHuellaDactilar;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", numCamaras=" + numCamaras +
                ", sensorHuellaDactilar=" + sensorHuellaDactilar +
                '}';
    }
}

class SmartWatch extends SmartDevice {
    boolean resistenciaAgua;
    boolean cargaInalambrica;

    SmartWatch(){}

    SmartWatch(String marca, String modelo, String color, int peso, boolean resistenciaAgua, boolean cargaInalambrica) {
        super(marca, modelo, color, peso);
        this.resistenciaAgua = resistenciaAgua;
        this.cargaInalambrica = cargaInalambrica;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", resistenciaAgua=" + resistenciaAgua +
                ", cargaInalambrica=" + cargaInalambrica +
                '}';
    }
}
