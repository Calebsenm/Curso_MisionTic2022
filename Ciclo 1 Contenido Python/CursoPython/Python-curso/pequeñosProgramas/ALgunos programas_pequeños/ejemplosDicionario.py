
#Diccionarios=Son una estructura de datos, manejan una relación Clave(llave)/Valor
#Sistema de informacón para la gestión de facturacíon, utilizando un dicionario  de la siguiente manera
#Diccionario en el cual la llave sea el codigo o numero de la factura 
#y los calores asociados a esa factura sea otro diccionario 

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
        #pregunta si hay elemnetos de una factura creada 
        while True:
            try:
                if len(facturas)>0:
                    n_factura=int(input("ingrese el numero de la factura a pagar"))
                    #revisar el mumero de la factura esta en el diccionario 
                    if n_factura in facturas.keys():
                        cancelado+=facturas[n_factura]["Total a pagar"]
                        pendiente-=facturas[n_factura]["Total a pagar"]
                        facturas.pop(n_factura)
                        print("la factura no {} ha sido cobrada y eliminada don exito ".format(n_factura))    
                        break
                    else:
                        system("cls")
                        print("El numero de factura no esta registrado")
                else:
                    system("cls")
                    print("No hay facturas registradas")
                    input("Enter para regresar al menu principal")
                    break
            except ValueError:
                    system("cls")
                    print("Numero de factura invalida")
                    break

    elif op=="c":
        system("cls")
        print("Gracias por utilizarme")
        break
       

