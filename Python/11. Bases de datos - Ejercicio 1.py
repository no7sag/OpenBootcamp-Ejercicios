# En este ejercicio tendr�is que crear una tabla llamada Alumnos que constar�
# de tres columnas: la columna id de tipo entero, la columna nombre que
# ser� de tipo texto y la columna apellido que tambi�n ser� de tipo texto.
#
# Una vez creada la tabla, ten�is que insertarle datos, como m�nimo ten�is
# que insertar 8 alumnos a la tabla.
#
# Por �ltimo, tienes que realizar una b�squeda de un alumno por nombre y
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
                       (2, "Hugo", "G�mez"),
                       (3, "Paula", "P�rez"),
                       (4, "Lucas", "Garc�a"),
                       (5, "Manuel", "Saavedra"),
                       (6, "Carla", "D�az"),
                       (7, "Mart�n", "Navarro"),
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
