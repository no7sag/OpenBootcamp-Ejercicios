# En este ejercicio tendréis que crear un módulo que contenga las
# operaciones básicas de una calculadora: sumar, restar,
# multiplicar y dividir.
# Este módulo lo importaréis a un archivo python y llamaréis a
# las funciones creadas. Los resultados tenéis que mostrarlos por consola.

import calculadora

def main():
    num1 = 8
    num2 = 2
    print(calculadora.sumar(num1, num2))
    print(calculadora.restar(num1, num2))
    print(calculadora.multiplicar(num1, num2))
    print(calculadora.dividir(num1, num2))

if __name__ == "__main__":
    main()