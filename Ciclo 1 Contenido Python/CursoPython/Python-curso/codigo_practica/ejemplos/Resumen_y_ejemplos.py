#puntos  notas para aprender
# parea pasar de letra a numero (int)



numero1=int(input("introduce el numero"))
numero2=int(input("introduce el numero"))
suma=(numero1 + numero2)

nombre=input(" nombre es: ")
apellido=input("apellido es: ")
print(nombre,apellido)
print("su suma es: ",suma)


#pequeño introducidor y identifiador
"""""
cadena=input("cadena es ")
decimal=float(input("introduce flotante(decimal): "))
entero=int(input(" numero entero es: "))
print(cadena,decimal,entero)
"""

#importar modulos son 
"""""
from math import sin,cos,(sqrt=rais cuadrada)

print(cos(1))

from math import sin,cos,sqrt,   //pow=radio
print(sqrt(82))
print(pi)

cls = limpiar el cmd 

from sys import platform
print(platform)

from os import system
print("hola")
nombre = input("ingresa tu nombre")
system ("cls")
apellido= input("ingresa tu apellido")
print("adios",nombre,apellido)

"""
# metodos //lower cconvierte a cadena a minuscula 

"""""
cadena="un ejemplo de cadena BBBNM"
cadena=cadena.lower()
print(cadena)

lower minuscula //upper mayuscula 
"""
"""""
print ("OTRO EJEMPLO".lower() )
print ("otro metodo es".upper() )

"""

"""""
from math import sqrt,sin
from os import system

numero1 =int(input("ingresa un numero"))
system ("cls")
numero2=int(input("ingresa un numero"))

suma=sin (numero1)+(sqrt (numero2))
system("cls")
print("la suma del seno {0} on la rai uadrada de {1} es {2}".format (numero1,numero2,suma))

"""


#sentencia condicional   if 


"""""
mayor que >
menor que <

<= menor o igual
>= mayor o igaul

== igual 
!= diferente de
"""""

"""""
a=9
b=0
division= a/b
print(division)


"""
"""""

a=float(input("introduce el numero 1: "))
b=float(input("introduce el numero 2: "))

if b != 0:
    division= a/b
    print(division)

else:
    print("no se puede dividir por cero")

"""

#un programa numero ,  qdetermine si es par o impar dicho numero ingredado
""""

numero=int(input("ingresa el numero "))

residuo= numero%2
if residuo==0:
    print("el numero es par")

else:
    print("el numero es impar")




a=int(input("ingresa el primer numero: "))
b=int(input("ingresa el segundo numero: "))
c=int(input("ingresa el primer numero: "))

if a>b:
     if a>c:
        mayor=a
   
else:
    if b>c:
        mayor=b
    else:
        mayor=c



print("el mayor es: ", mayor)

"""


"""




try:

 dividiendo=float(input("ingresa el diviso: "))

 divisor=float(input("ingresa el divisor: "))
 division=dividiendo/divisor
 print("la division es: ", division)

except Exception:
    print("no se puede dividir entre sero ")

    """
"""
#reto n1

#Declaración de variables 
usuario1=52215
clave1=51225
catcha1=215
catcha2=int((3+1)+3/(3)-4)
catcha=catcha1+catcha2
#inicio de ingreso usuario contraseña y catcha
print("Bienvenido al sistema de ubicación para zonas públicas WIFI")
usuario=int(input("ingrese su usuario: "))
if usuario==usuario1:
    if int(input("ingrese su contraseña: ")) == clave1:
        verificacion=int(input(f"porfavor resuelvea la sisguiente operación {catcha1} + {catcha2}: "))
        if verificacion == catcha:

           print("Sesión iniciada")
           
        else:
            print("Error")
    else:
        print("Error")
else:
    print("Error")

# os = sistema operativo

"""
"""
# clase n5 semana 2 explicacion del reto 1

from os import system                                               #importar cosas del sistema ("cls") and exit()
system("cls")                                                       #limpiar consola
print("Bienvenido al sistema de ubicación para zonas públicas WIFI")


usuario=52215                                                       #usuario almacenado 
contraseña=51225                                                    #contraseña almacenada
catcha1=215
catcha2=((5*2)-5)-(2+2)

#se solicita al usuario introducir su usuario
user=int(input("Ingrese su usuario: "))
if user==usuario:
    system("cls")                                                   #limpiar consola
    pasw=int(input("Ingrese su contraseña: "))
    if pasw==contraseña:
        validar=int(input(f" Resuelve: {catcha1} + {catcha2} = "))  # fromatos para unir distintos valores 
        if validar== catcha1+catcha2:
            print("Sesión iniciada")
        else:
            print("Error")
    else:
        print("Error")
        exit()                                                       #salir del progama
else:
    print("Error")
    exit()

#ciclos 
#clase n6 semana (2 ciclos - estructuras iterativas)
"""
"""
print("1")
print("2")

# wile  indeterminados /mientras haya una una instruccion casi infinito
# for   determinados  (se pueden apagar y prender)
i=1
while i<5:   #mientras este operando esta encendida
    print(i) #deter el ciclo control c
    i=i+1 

print("terminado")
"""
"""
from os import system
j=1
system ("cls")
while True:      # para romper un true es con un break
    
    if j<5:
        print(j)
        j=j+1
    else:
        break
"""

"""
#Ejercicio sumar todos los primeros 100 numeros

n=int(input("hasta que numero desa hayar la sumatoria: "))
sumatoria=0
i=1
while i<=n:
    sumatoria=sumatoria+i
    print(f"en la iteracion {i}, el valor de la sumatoria es {sumatoria}")
    i=i+1
print("la sumatoria es: ",sumatoria)
"""
#calculadora de circulos
""

#While: usado para un menú iterativo
from math import pi
from os import system
system("cls")
radio=float(input("Dime el radio de un circulo: "))
opcion=" "
while True:
    print("Escoge una opción: ")
    print("a)Calcular el diametro")
    print("b)Calcular el perimetro")
    print("c)Calcular el área")
    print("d)Salir")
    opcion=input("Teclea a, b o c y pulsa para escoger: ")
    if opcion=="a":
        system("cls")
        diametro=2*radio
        print("El diametro es: ", diametro)
    elif opcion=="b":
        system("cls")
        perimetro=2*pi**2
        print("El perimetro es: ", perimetro)
    elif opcion=="c":
        system("cls")
        area=pi*radio**2
        print("El área es: ", area)
    elif opcion=="d":
        break
    else:
        system("cls")
        print("Solo hay tres opciones: a, b, c o d tú has tecleado: ", opcion)








