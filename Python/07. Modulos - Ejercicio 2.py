# En este segundo ejercicio tendréis que crear un script que nos
# diga si es la hora de ir a casa. Tendréis que hacer uso del
# modulo time. Necesitaréis la fecha del sistema y poder comprobar la hora.
# En el caso de que sean más de las 7, se mostrará un mensaje y
# en caso contrario, haréis una operación para calcular el tiempo
# que queda de trabajo. 

import time

def main():
    hora_local = time.localtime()
    hora = hora_local[3]
    minuto = hora_local[4]
    
    print(f"Son las {hora}:{minuto}")
    
    if hora > 19:
        print("Hora de ir a casa.")
    else:
        horas_restantes = 19 - hora
        min_restantes = 60 - minuto
        print(f"Tiempo restante para retirarse: {horas_restantes}h {min_restantes}m")

if __name__ == "__main__":
    main()