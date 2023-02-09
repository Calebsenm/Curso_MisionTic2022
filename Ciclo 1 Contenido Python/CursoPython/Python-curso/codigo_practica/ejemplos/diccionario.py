#los diccionarios son estructuras de datos manejan relaci0pon 
# clave(llave) valor
"""
d={}   # se declaran con corcchtes 
d.keys
print(type(d))

d={} 
l=[] 
t=()
l.clear
print(type(d))

dd={"carlos": "3284332","juan":"232322",7:True}
print(dd)
print(dd[7])
#agregar valores a diccionario 
cc={}
cc["lds"]=[34343]
cc["carlos"]="34324342"
cc["lis"]="3434344"
cc["Ana"]="344"


del cc["carlos"]
cc.pop("Ana")

print(cc)
print("pedro" in cc)
print(cc.keys())        #para llaves 
print(cc.values())    #para valores


#reocorrerlo

for elemento in cc:             #recorrerlo
    print(elemento)              #devolver llaves
    print(cc[elemento])         #devolver elementos 

    print(elemento," -> ",cc[elemento])



a={}
a["lds"]=[34343]
a["carlos"]="34324342"
a["lis"]="3434344"
a["Ana"]="344"

del a["carlos"]
d.pop("Ana")
for i in a:
    print(a)


"""

#Diccionarios=Son una estructura de datos, manejan una relación Clave(llave)/Valor
#Sistema de informacón para la gestión de facturacíon, utilizando un dicionario  de la siguiente manera
#Diccionario en el cual la llave sea el codigo o numero de la factura 
#y los calores asociados a esa factura sea otro diccionario 
"""
from os import system
system("cls")
facturas={}
cancelado=0
pendiente=0

def menu():
    system("cls")
    opcion=" "
    while not (opcion>="a" and opcion<="c"):
        print(facturas)
        print("Cantidad Cancelada: ",cancelado," Cantidad Pendiente: ",pendiente)
        print("------Menú Facturación-------")
        print("a)Añadir Factura")
        print("b)Pagar factura")
        print("c)Salir")
        opcion=input("Escoge una opción: ").lower()
        if not (opcion>="a" and opcion<="c"):
            print("Solo puedes escoger 'a', 'b' ó 'c'. Intenta nuevamente!")
    return opcion

def valores_factura():
    while True:
        try:
            valor_factura=float(input("Ingrese el valor de la factura: "))
            valor_descuento=float(input("Ingrese el valor total de descuento: "))
        except ValueError:
            print("Tipo de dato no admitido")
            continue
        if valor_descuento>valor_factura:
            print("El valor del descuento no puede ser mayor al valor de la factura")
        else:
            break
    return valor_factura , valor_descuento

def validarPregunta(respuesta:str):
    return respuesta.lower() in ["n","no"]
     

def guardar_factura(n_factura,t_factura,t_descuento):
    facturas[n_factura]={"total factura":t_factura,
                         "total descuento":t_descuento,
                         "total pagar":t_factura-t_descuento}
    print("Se guardo con exito")



while True:
    op=menu()
    if op=="a":
        system("cls")  
        while True:
            try:      
                numero_factura=int(input("Ingrese el número de la factura: "))
                if numero_factura in facturas.keys():
                    pregunta=input("Número de factura ya existe. ¿Desea remplazar los datos? (S/N)")
                    validar=validarPregunta(pregunta)
                    if validar:
                        print("operación cancelada")
                        break

                if numero_factura>=0:
                    total_factura , total_descuento = valores_factura()
                    guardar_factura(numero_factura,total_factura,total_descuento)
                    pendiente+=facturas[numero_factura]["total pagar"]
                    break
                else:
                    system("cls")
                    print("Introduce un número entero positivo")
            except ValueError:
                system("cls")
                print("¡Introduce un número entero!")
        

    elif op=="b":
        print()
    elif op=="c":
        system("cls")
        print("Gracias por utilizarme")
        break

"""

#Dicionarios ejeplo mas detallado
dic={}
dic["carlos"]= {"telefono":"3232323234","direccion":"Calle 4 N38-98","VIP":True,"edad":32}
dic["Luis"]= {"telefono":"32323454234","direccion":"Calle 2 N78-98","VIP":False,"edad":22}
dic["Ana"]= {"telefono":["3232323234","324343545"],"direccion":"Calle 4 N38-98","VIP":True,"edad":32}

print(dic["Ana"]["telefono"][1])
