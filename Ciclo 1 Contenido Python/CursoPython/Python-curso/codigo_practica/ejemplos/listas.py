#litas
"""
from os import system
system("cls")

mi_lista=[1,3,"hola",True,-1,[1,2,3]]#varios valores en una variables y datos de diferentes 
mi_lista.append (2)        #metodo de agregar al final un elemento 
print(mi_lista)

"""

"""
from os import system
system("cls")

mi_lista=[1,2,3,4]
otra_lista=mi_lista[:] #para que sea diferente
print(mi_lista)
print(otra_lista)
otra_lista.append(5)
print(otra_lista)
print(mi_lista)
"""

""""
mi_lista=[1,2,3,4]
mi_lista.append(5)
mi_lista=mi_lista+[6,7,8]
mi_lista=mi_lista[4:7]
print(mi_lista)

mi_lista=["pedro","juan","luis"]
mi_lista.append("migel")
mi_lista=mi_lista+["carlos"]
mi_lista=mi_lista[1:4]
print(mi_lista)
"""
"""
#para introducir uno y rodar poccion
mi_lista=["pedro","juan","luis"]  
mi_lista.append("migel") #un elemento
print(mi_lista)
mi_lista.insert(0,"carlos")
print(mi_lista)
mi_lista.extend(["maria","Aura"]) #extencion de lista
print(mi_lista)
mi_lista.sort()  #organiza la lista alfabeticamente
print(mi_lista)
mi_lista.sort(reverse=True) #a lo contrario de z a a igual en numeros de 9 a 1 
print(mi_lista)
"""

#encontrar donde se encuentra pedro
""""
mi_lista = ["Pedro", "Juan", "Luis", "Pedro"]
for i in range (len(mi_lista)):
    nombre = mi_lista[i]
    if nombre == "Pedro":
        print("indice= ",i)


# con un while
lista=["Pedro","Juan","Luis","Pedro","Pedro"]
while True:
    if lista.count("Pedro")==0:
        break
    else:
        print(f"Veces que esta la palabra Pedro: ",lista.count("Pedro"))
        break


"""



"""
mi_lista=["pedro","juan","luis","pedro"]

i1=mi_lista.index("pedro")
mi_lista[0]=" "
i2=mi_lista.index("pedro")

print(mi_lista)
print(i1,i2)
"""
#tieme in error
""""

contador=0
for nombre in mi_lista:
   if nombre=="pedro":
        print(contador)
    contador+=1

i1=mi_lista[i1+1:]
"""

#para numero de elementos
"""
mi_lista=["pedro","juan","luis","pedro","maria"]
print(len(mi_lista))
"""
#para imprimir el listado
"""
mi_lista=["pedro","juan","luis","pedro","maria"]
for i in range(len(mi_lista)):
    print(mi_lista[i])
"""
#como agragar elementos en una lista
#el mas recomendado

mi_lista=[0,1,2,3,4,]
mi_lista=mi_lista+[5]
mi_lista.append(6)
print(mi_lista)
#eliminar elementos

mi_lista=[0,1,2,3,4,]
#del mi_lista[0]
mi_lista.remove(0)
print(mi_lista)

#copia
mi_lista=[0,1,2,3,4,]
otra_lista=mi_lista[:]
otra_lista=mi_lista





