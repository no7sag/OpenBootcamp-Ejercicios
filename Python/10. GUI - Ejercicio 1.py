# En este ejercicio tenéis que crear una lista de RadioButton que muestre
# la opción que se ha seleccionado y que contenga un botón de reinicio
# para que deje todo como al principio.
# Al principio no tiene que haber una opción seleccionada.

import tkinter as tk
from tkinter import ttk

def main():
    window = tk.Tk()
    window.columnconfigure(0, weight=1)

    opcion_selec = tk.StringVar()
    
    opcion1 = ttk.Radiobutton(text="Opción 1", value="1", variable=opcion_selec)
    opcion1.grid(column=0, row=0)
    
    opcion2 = ttk.Radiobutton(text="Opción 2", value="2", variable=opcion_selec)
    opcion2.grid(column=0, row=1)
    
    opcion3 = ttk.Radiobutton(text="Opción 3", value="3", variable=opcion_selec)
    opcion3.grid(column=0, row=2)
    
    def reiniciar_selec():
        opcion_selec.set(None)
    
    reiniciar = ttk.Button(text="Reiniciar", command=reiniciar_selec)
    reiniciar.grid(column=0, row=3)
    
    window.mainloop()

if __name__ == "__main__":
    main()