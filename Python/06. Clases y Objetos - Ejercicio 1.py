# En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:
# - Color
# - Ruedas
# - Puertas
# Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:
# - Velocidad
# - Cilindrada
# Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.

class Vehiculo:
    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas
        
class Coche(Vehiculo):
    def __init__(self, color, ruedas, puertas, velocidad, cilindrada):
        super().__init__(color, ruedas, puertas)
        self.velocidad = velocidad
        self.cilindrada = cilindrada

if __name__ == "__main__":
    coche = Coche("Rojo", "4", "4", "90", "800")
    print("-- Datos del coche --")
    print(f"Color: {coche.color}")
    print(f"Ruedas: {coche.ruedas}")
    print(f"Puertas: {coche.puertas}")
    print(f"Velocidad: {coche.velocidad}")
    print(f"Cilindrada: {coche.cilindrada}")