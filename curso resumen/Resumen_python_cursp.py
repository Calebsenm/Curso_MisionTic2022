"""
from os import system
from typing import Type
# para inprimir un mensaje 
system("cls")
print("=================/ Hello world /===================")

print("Tipos de datos")
# str 
print(type("hola"))      #inprimir el tipo de valor str 
#concadenar 
a="hola soy"
b="caleb"
print(a+b)
#numeros  "int"
a=16
print(f"tengo {a} años ")           #f "es {} para ingresar valores numericos en el texto 
print(type(2323))

#bolean 

True                #encendio
False               #apagado
print(type(False))

#lista
a=[1,2,3,4,]
b=['hola','soy','caleb ']           
c=[12,232,True,23.23]
d=[]
print(a,b,c,type(c))

#tuplas () Datos que no cambian     imutables
ds=(232,23,2323,23)
()

#Diccionarios 
vas={"Nombre":"ramiro peres",         #diccionarios 
    "sobrenombre":"mingo",             #agrupar datos con una clave 
    "apellido":"marin"}
print(type(vas))
print(vas)

#variables Nombre para un valor
numerrito=1212
voloe=121
nombre = "caleb" 
print(nombre , voloe ,numerrito)

#para dos variables en una sola linaa
print("el resultado de la variable en una")
x,libro = 112,"soy valor" 
print(x)
print(libro)

#lenguaje dinamico 
#reasignar tipos de valores en otros lenguajes no se puede 
librononbre="robit"
librononbre="2323232"

from os import system


system("cls")
print("###############################################################")
print("estrins en mas profundidad ")

base="Hello World"           #dir()  que podemos hacer con un dato 
#print(dir(base))              #propiedades y metodos

print(base.upper())               # metodo upper todas en mayusculas 
print(base.lower())                 # minusculas
print(base.swapcase())              # una misnuscula otra minuscula las que estaban en minusculas ahora en minusculas y alreves 
print(base.capitalize())            #mantiene la primera lestra en mayusculas 
print(base.replace("Hello","Bye"))            #remplaza el dato por ejemplo el Hello lo renplaza por  bye  
print(base.replace("Hello","Bye").upper())   #varios metodos 
print(base.count("l"))                        #contar cunatas veces esta l en la  variable
print(base.startswith("Hello"))               #para saber si empieza por hola 
print(base.endswith("world"))                  #el caso contrario de la anterior

asucar="Hola,siisi hola"
#se crea una lista 
print(asucar.split())                   #separa el texto basado en un espacio 
print(asucar.split(","))                # separa apartir de una cooma
print(asucar.split("o"))  
#para buscar en que posision o
print(asucar.find("o"))  

print(len(asucar))                #la longitud de la variable 
print(asucar.index(","))             # cual es el indice 
print(asucar.isnumeric())             #saber si es un valor numerico 
print(asucar.isalpha())                #lo contrario para ver si son letras 

print (asucar[3])                      #para inprimir el valor  que se encuntra en la posicion 3
print(asucar[-2])                       #metodo inverso
 
#tres fomar par concadenar por asi decirlo

mio="lolo"
print("soy"+ mio)
print(f"soy{mio}")
print("soy{0}".format(mio))

"""
######################################################################################
#mucho mas sobre los numeros
"""
print(type(2))
print(type(22.23))

print(12/2)
print(12//2)        #para quitar el valor decimal
print(23+232-23*23+2**23)
print((23+232)-(23*23)+(2**23))


a=input("inserte su edad: ")
new_age= int(a)+2
print(new_age)
"""
#############################################################

#listas
"""
listass=["23",22,22,22,1111,11]
colores=["amarillo","verde","azul"]
num_listas=list((1,2,34,4))          #lis() funcion define lista y colocamos la lista
print(num_listas)
re=list(range(1,10))                         #crear lista en rango 
print(re)
print(len(listass))                    #para la cantidad de valores en la lista
print(colores[1])                     #para inprimir el datoen la posicion 1
print("verde"in colores)                      #para saber si un dato esta en la lista

#para cambiar datos en listas 

print(colores)
colores[1]="naranjado"
print(colores)

#algunos metodos 
colores.append("violeta")                    #agregar elementos    .append
print(colores)
colores.extend(("moraddo","rosa","salmon"))     #para agregar varios de una debes colocarlos como si fueran una dupla
print(colores)

#para agregarlos en un aposiicon exacta 
colores.insert(1,'blanco')
print(colores)

#para agregar en una posicion ultima
colores.insert(len(colores),"negro")
print(colores)
#remover elementos en una lista//los ultimos los quita
colores.pop()
print(colores)
#eliminar un elemento exato
colores.remove("amarillo")
print(colores)
#eliminar con un indice 
colores.pop(1)
print(colores)
#eliminar todos
#colores.clear()
#print(colores)

#ordenar elementos alfaveticamente
colores.sort()
print(colores)
#invertir orden desde la z hasta la a
colores.sort(reverse=True)
print(colores)
# buscar los indises de los datos 
print(colores.index("violeta"))
#para contar las veces que se repiten
print(colores.count("violeta"))

"""
#################################################################################
#tuplas // no se puede modificar [son rapidas]
"""
cd=(1,2,3)
print(cd)
print(type(cd))

#tuple()     #para darles valores
y=tuple((1,2,3,4,5))
print(y)

#print(dir(tuple))        #saber que se puede hacer . metodos

x=(1,)            #parta consioderar si es una tupla de un solo elemento se le coloca una coma
print(x)


ddd=(1,2,3,4) 
print(ddd[0])                     #para inprimir el valor que tiene el indice 0 o possicion 0
# para eliminar 
del(ddd)

# utilizacion de duplas 
localizacion={
    (33.3434,34.3434):"tokio",
    (33.3434,34.3434):"new york",
}

"""
###################################################
#  Dato sets
"""
coloress={"rojo","verde","azul"}
print(coloress)
print("verde"in coloress)

coloress.add("violeta")                   #agrega el valor al inicion  en un sets
print(coloress)              

coloress.remove("rojo")                  # remover un valor
print(coloress)
# vaciar el sets
coloress.clear()                   
print(coloress)
# borrar todo el sets
del coloress
print(coloress)

"""

###############################################################
#  Diccionarios 
"""
valor={

"nombre":"libros",
"cantidad":2,
"precio":22.22

}

perosona={
"primer_nombre":"eduardo",
"apellido":"mne"
}


print(valor,perosona)
print(perosona.keys())                #imprimir las llaves
print(perosona.items())               #imprimir todo 

perosona.clear()
print(perosona)

"""

########################################################
#condicionales
"""
x=40                             
if x < 23:                                # compara si la variable es menor si lo es se ejecuta
    print("")                             
else:                                     #delo contraroio se ejecura el siguinete valor
    print("Error")



nombre=input("ingresa tu nombre: ")
apellido=input("ingresa tu apellido: ")

if nombre =="john":
    if apellido=="carter":
        print("tu eres John")
    else:
        print("tu no eres john carter")
else:
    print("no eres john")

"""
#############################################################

# for and while
"""
comidas=["mansanas","pan","queso","leche"]
print(comidas[0])                          #para la posicion
print(comidas[1])      
print(comidas[2])
print(comidas[3])
print("#####################################")

for comida in comidas:                       #ciclo for para inprimir en filas sin importar el tammaños
    if comida=="queso":
        break                                 # rompe el ciclo y para
    print(comida)

for n in range(1,4):
    print(n)
#########################

contador=4
while contador<=10:
    print(contador)
    contador+=1

"""
##########################################
#funciones  
"""

def hello():
    print("Hello world")

hello() 

# para saludar a alguin 


def hello(name):                       #qui resive el nombre 
    print("Hello "+name)

hello("caleb")                               #aqui invoca la funcion 


def sumas(numero,numero2):
    return numero+numero2
print(sumas(223,232))

#definir una funcion landad
sum = lambda numeroUno, numeroDOs: numeroUno+numeroDOs
print(sum(122,3343))
"""
###############################################################
#modulos 

# reutilizar diferentes modulos
#propios modulos
# usar de python modulos
# python modulos conpartidos 

# modulos utililes por ejeplo este modulo te muestra la hora actual 
import datetime                  
print(datetime.date.today())    
#para comvertir minutos a horas 
print(datetime.timedelta(minutes=70))  


#crear nuestros propios modulos  esto es un archivo diferente 
def abc(n1,n2):
    print(n1+n2)
def sustraccion(n1,n2):
    print(n1-n2)

#para importar nuestro propio modulo
# import mamma (el nombre del arcivo )
#mamma.abc(1,2)
