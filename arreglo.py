#PUNTO 1
nombre = input("Ingresa un nombre: ")

nombre_invertido = []

for letra in nombre:

    nombre_invertido.insert(0, letra)
    
print("Nombre invertido:", ''.join(nombre_invertido))
