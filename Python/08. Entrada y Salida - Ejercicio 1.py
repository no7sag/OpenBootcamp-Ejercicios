# En este ejercicio, tendréis que crear un archivo py donde
# creéis un archivo txt, lo abráis y escribáis dentro del archivo.
# Para ello, tendréis que acceder dos veces al archivo creado.

def main():
    lines = ["Curso de Python - Open Bootcamp",
             "Resolución del Ejercicio 1 del módulo 8 (Entrada y Salida)"]
    
    f = open("archivo.txt", "w")
    for l in lines:
        if not l.endswith("\n"):
            l += "\n"
        f.writelines(l)
    f.close

if __name__ == "__main__":
    main()