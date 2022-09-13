# En este ejercicio tendréis que crear una tabla llamada Alumnos que constará
# de tres columnas: la columna id de tipo entero, la columna nombre que
# será de tipo texto y la columna apellido que también será de tipo texto.
#
# Una vez creada la tabla, tenéis que insertarle datos, como mínimo tenéis
# que insertar 8 alumnos a la tabla.
#
# Por último, tienes que realizar una búsqueda de un alumno por nombre y
# mostrar los datos por consola.

import sqlite3

def main():
    conn = sqlite3.connect("alumnos.db")
    cursor = conn.cursor()
    
    # Crear tabla
    cursor.execute('''
                   CREATE TABLE IF NOT EXISTS alumnos(
                       id INTEGER PRIMARY KEY,
                       nombre TEXT,
                       apellido TEXT)
                   ''')
    conn.commit()
                
    # Insertar datos
    cursor.execute('''
                   INSERT INTO alumnos(id, nombre, apellido)
                       VALUES
                       (1, "Daniel", "Sosa"),
                       (2, "Hugo", "Gómez"),
                       (3, "Paula", "Pérez"),
                       (4, "Lucas", "García"),
                       (5, "Manuel", "Saavedra"),
                       (6, "Carla", "Díaz"),
                       (7, "Martín", "Navarro"),
                       (8, "Mateo", "Ramos")
                   ''')
    conn.commit()
    
    # Seleccionar y mostrar datos del alumno
    cursor.execute('''
                   SELECT * FROM Alumnos WHERE nombre=="Lucas"
                   ''')
    conn.commit()
    
    datos_alumno = cursor.fetchone()
    mostrar_alumno(datos_alumno)
    
    cursor.close()
    conn.close()
    
def mostrar_alumno(datos_alumno):
    print("ID del alumno:", datos_alumno[0])
    print("Nombre y apellido:", datos_alumno[1], datos_alumno[2])
    
if __name__ == '__main__':
    main()
