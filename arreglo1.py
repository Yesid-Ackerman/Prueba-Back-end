#PUNTO 2

nombre = list(nombre)
contador_vocales = 0
vocales = "AEIOU aeiou"

for letra in nombre:

    if letra in vocales:

        contador_vocales += 1

print("El nombre",nombre,"Tiene ", contador_vocales, "vocales.")