# En este segundo ejercicio, tenéis que crear una aplicación que obtendrá
# los elementos impares de una lista pasada por parámetro con filter y
# realizará una suma de todos estos elementos obtenidos mediante reduce.

from functools import reduce

def main():
    numeros = [2, 5, 7, 10, 11, 14]
    print(sumar_impares(numeros))
    
def sumar_impares(numeros):
    impares = filter(lambda n: n%2!=0, numeros)  # 5, 7, 11
    resultado = reduce(lambda a,b: a+b, impares)  # 5 + 7 + 11 = 23
    return resultado

if __name__ == "__main__":
    main()