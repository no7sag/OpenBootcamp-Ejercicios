# En este segundo ejercicio, tendréis que crear un programa que tenga
# una clase llamada Alumno que tenga como atributos su nombre y su nota.
# Deberáis de definir los métodos para inicializar sus atributos, imprimirlos
# y mostrar un mensaje con el resultado de la nota y si ha aprobado o no.

class Alumno:
    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota
    def resultado(self):
        if self.nota >= 6:
            print(f"Nota de {self.nombre}: {self.nota} | Aprobado")
        else:
            print(f"Nota de {self.nombre}: {self.nota} | Desaprobado")
    
if __name__ == "__main__":
    alumno = Alumno("Brian", 8)
    alumno.resultado()