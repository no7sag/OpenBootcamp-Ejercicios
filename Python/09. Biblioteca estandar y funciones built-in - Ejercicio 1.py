# Crea un script que le pida al usuario una lista de países (separados
# por comas). Éstos se deben almacenar en una lista. No debería haber
# países repetidos (haz uso de set). Finalmente, muestra por consola
# la lista de países ordenados alfabéticamente y separados por comas.

def main():
    paises_input = input("Ingrese nombres de paises separados por comas: ")
    paises_lista = paises_input.split(",")
    
    # Eliminar espacios en blanco al comienzo/final
    for i, p in enumerate(paises_lista):
        if p.startswith(" ") or p.endswith(" "):
            paises_lista[i] = p.strip()
    
    paises = sorted(set(paises_lista))
    
    print(paises)

if __name__ == "__main__":
    main()