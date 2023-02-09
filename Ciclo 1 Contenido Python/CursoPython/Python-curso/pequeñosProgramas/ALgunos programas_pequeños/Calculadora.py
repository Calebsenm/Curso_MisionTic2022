#pequeño programa "calculadora"
#declaracion de la variable del dibujo
a="""
 __________
| ________ |
||12345678||
|__________|
|[M|#|C][-]|
|[7|8|9][+]|
|[4|5|6][x]|
|[1|2|3][%]|
|[.|O|:][=]|
'----------'
"""
#donde se mmuestran los mensajes 
print("Bienvenido a la Mejor calculadora")  
print(a)
print("a. para sumar")
print("b. para restar")
print("c. para multiplicar")
print("d. para dividir")
print("e. para calcular la potencia cuadrada")
#imputs para la salida de los datos
valor=input("elija una opcion: ")
dato_uno=int(input("Digite un numero: "))
dato_dos=int(input("Digite un numero: "))
##condicionales que validan la accion 
if valor is "a":
    print(dato_uno+dato_dos)
elif valor is "b":
    print(dato_uno-dato_dos)
elif valor is "c":
    print(dato_uno*dato_dos)
elif valor is "d":
    print(dato_uno/dato_dos)
elif valor is  "e":
    print(dato_uno**dato_dos)
else:
    print("Error")
    

