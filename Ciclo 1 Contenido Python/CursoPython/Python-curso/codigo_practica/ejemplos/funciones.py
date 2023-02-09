"""a
print(max(1,2,3,4,5,6))  # imprimir el valor mas alto
print(min(1,2,3,4,5,6))  # imprime el valor mas vajo


from math import sin 
print(sin(-1))
print(sin(9))
print(pow(2,3))

"""
"""
#crear funciones
def cuadrado(x):
    print(x**2)
cuadrado(2+3)

def cuadrado(x):
    respuesta=x**2
    return respuesta
a=9
print(cuadrado(2+3)+5)


def cuadrado(x):
    return x**2
a=9
print(cuadrado(a))


def cuadrado(x,a,b,c,d,r):
    return x**2

print(cuadrado(6,4,8,9,2,5))

#varios ejemplos
def cuadrado(x):            #cabecera
    return x**2             #cuerpo de la funcion

def saludar():              
    print("hola mundo")
a=9
print(cuadrado(a))          #llamado o invocasion


saludar()                   #llamado o invocacion


# otro ejemplo

def cuadrado(x):            #cabecera
    return x**2             #cuerpo de la funcion

def saludar():              
    print("hola: ")
a=9
print(cuadrado(a))          #llamado o invocasion


saludar()                   #llamado o invocacion

"""
"""

def operaciones (x,y):
    suma=x+y
    resta=x-y
    return suma , resta

adicion , diferencia = operaciones(5,2)

print("la suma es: ",adicion," y la diferencia es: ", diferencia)
"""


#definir raiz cubica devuelve el valor de la raiz cubica de un entero
"""
def cubica(x):
    raiz = x**(1/3)
    print(f"La raiz cubica de {x} es {raiz} ")
cubica(8)

# definir una cadena y debuelva cierto  si es minuscula y si no es minuscula
def valor_cadena(cadena):
    validar=cadena[0].lower()
    if cadena [0]==validar:
        return True
    else:
        return False
print(valor_cadena("Hola "))
"""

# otra  con un input
"""
def valida(s):
    letra = s[0]
    if letra.islower():
        print ("verdadero")
    else:
        print ("falso")    
cadena = input("Escriba una cadena: ")
valida(cadena)
"""

#diseñar una funcion que nos diga si un numero es perfecto o no 
"""
def esperfecto(n):
    suma=0
    for i in range(1,n):
        if n % i==0:
            suma+=i
    if suma==n:
        return True
    else:
        return False

print(esperfecto(496))


"""
"""

lista=[2,9,6,1,9,-1]

print("suma todos: ",sum(lista))   #funfion de suma 

def sumapositivo(nueva):
    suma=0
    for i in range(len(lista)):
        if i in nueva:
            if i>0:
                suma+1
            else:
                continue
        return suma


def sumanegativo(nueva):
    suma=0
    for i in range(len(lista)):
        if i in nueva:
            if i>0:
                suma+1
        
        return suma

print("suma negativo: ",sumanegativo(lista))
print("suma positivos: ",sumapositivo(lista))


#eliminar de la lisyta
milista=[1,2,3,4,6]
def eliminarprimero(unalista):
    unalista=unalista[1:]
    return unalista

listarecortada=eliminarprimero(milista)
print(milista)
print(listarecortada)


"""
"""
def lee_entero_positivo():
    while True:
        try:
            numero=int(input("introduce un numero entero positivo: "))
            if numero<0:
                continue
            else:
                break
        except ValueError:
            print("Error")
            continue
        return numero
a=lee_entero_positivo()
print(a)

"""
#opcion de un menu con una funcion

def menu():
    opcion=" "
    while not(opcion>="a" and opcion<="d"):
        print("Cajero automatico")
        print("a)Ingresar dinero")
        print("b)Sacar dinero")
        print("c)Consultar saldo")
        print("d)Salir")
        opcion=input("Escoja una opción: ").lower()
        if not(opcion>="a" and opcion<="d"):
            print("Solo se puede escoger a,b,c ó d")
    return opcion
while True:
    accion=menu()
    if accion=="a":
        print("opción a")
    elif accion=="b":
        print("opción b")
    elif accion=="d":
        break