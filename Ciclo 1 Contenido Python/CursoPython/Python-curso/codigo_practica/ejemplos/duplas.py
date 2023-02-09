#las duplas no se pueden modificar o ingresar datos 
variable=tuple([1,2,3,4])                 #convertir en duplas
mi_cadena="123456"
mi_lista=[1,2,3,4,5,6]
dupla=(1,2,3,4,)                    #si solo colocas 1 debes colocale , parera aceptar
dupla2=(1,2,3,[4,5,6],"7",8,"9")
print(type(mi_cadena))
print(type(mi_lista))
print(type(dupla))

print(mi_cadena.index(str(5)))
print(mi_lista.index (5))             #index es para la posicion del numero
print(dupla.index(2))
print(dupla2.index(3))              
print(type(variable))

mi_lista[2]=22
print(mi_lista)
mi_lista[2]=6
mi_lista[5]=22

print(mi_lista)

print("la siguiente")
variable3=tuple([9,"hola"])
print(variable3[0]+1)
print(variable3)

micadena2="holamundo"
milista2=[34,34,23,13,54]
mitupla2=(5435,454,454,)

print("para len")
print("sobre mi cadena: ",len(micadena2))
print("sobre mi cadena: ",len(milista2))
print("sobre mi cadena: ",len(mitupla2))
print("para max and min")
print("sobre mi cadena: ",max(micadena2))
print("sobre mi cadena: ",max(milista2))
print("sobre mi cadena: ",max(mitupla2))

print("sobre mi cadena: ",min(micadena2))
print("sobre mi cadena: ",min(milista2))
print("sobre mi cadena: ",min(mitupla2))

print("para suma")

print("sobre mi cadena: ",sum(milista2))
print("sobre mi cadena: ",sum(mitupla2))

