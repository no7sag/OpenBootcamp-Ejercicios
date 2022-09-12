# En este segundo ejercicio, tendréis que crear una interfaz sencilla
# la cual debe de contener una lista de elementos seleccionables,
# también debe de tener un label con el texto que queráis.

import tkinter as tk

def main():
    window = tk.Tk()
    window.columnconfigure(0, weight=1)
    window.columnconfigure(1, weight=1)
    
    # Opción 1
    opcion1 = tk.Checkbutton(text="Opción 1", variable="prueba1", onvalue="1",
                             padx=16, pady=8)
    opcion1.grid(column=0, row=0)
    
    # Opción 2
    opcion2 = tk.Checkbutton(text="Opción 2", variable="prueba2", onvalue="2",
                             padx=16, pady=8)
    opcion2.grid(column=0, row=1)
    
    # Opción 3
    opcion3 = tk.Checkbutton(text="Opción 3", variable="prueba3", onvalue="3",
                             padx=16, pady=8)
    opcion3.grid(column=0, row=2)
    
    # Opción 4
    opcion4 = tk.Checkbutton(text="Opción 4", variable="prueba4", onvalue="4",
                             padx=16, pady=8)
    opcion4.grid(column=1, row=0)
    
    # Opción 5
    opcion5 = tk.Checkbutton(text="Opción 5", variable="prueba5", onvalue="5",
                             padx=16, pady=8)
    opcion5.grid(column=1, row=1)
    
    # Opción 6
    opcion6 = tk.Checkbutton(text="Opción 6", variable="prueba6", onvalue="6",
                             padx=16, pady=8)
    opcion6.grid(column=1, row=2)
    
    # Etiqueta
    label = tk.Label(text="Open Bootcamp - Curso de Python")
    label.grid(column=0, row=3, columnspan=2)
    
    window.mainloop()
    
if __name__ == "__main__":
    main()