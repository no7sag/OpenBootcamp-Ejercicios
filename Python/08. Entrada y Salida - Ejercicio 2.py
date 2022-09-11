# En este segundo ejercicio, tendréis que crear un archivo py
# y dentro crearéis una clase Vehículo, haréis un objeto
# de ella, lo guardaréis en un archivo y luego lo cargamos.

import pickle

def main():
    
    coche1 = Vehiculo("Coche", "Azul", "Nuevo")
    
    # Exportando
    datos = open("datos-coche.txt", "wb")
    pickle.dump(coche1, datos)
    datos.close()
    
    # Importando
    datos_cargados = open("datos-coche.txt", "rb")
    coche2 = pickle.load(datos_cargados)
    datos_cargados.close()
    
    print(coche2)
    
class Vehiculo:
    def __init__(self, tipo, color, estado):
        self.tipo = tipo
        self.color = color
        self.estado = estado
    def __str__(self):
        return f'Vehículo({self.tipo},{self.color},{self.estado})' 

if __name__ == "__main__":
    main()