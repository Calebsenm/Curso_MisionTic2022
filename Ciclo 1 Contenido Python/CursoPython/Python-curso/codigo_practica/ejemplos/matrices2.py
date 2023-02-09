while True:
    print("Sistema Ciclistas")
    print("1.Registrar Ciclistas y tiempos")
    print("2.Mostrar ganador de la vuelta")
    print("3.Mostrar ganador por etapa")
    print("4.Gandadores por etapa")
    print("5.Salir")
    
    opcion=(input("Ingresa tu opción: "))
    if opcion =="1":
        lista_ciclistas=[]
        print('Ingrese los nombres de los ciclistas, "0" para terminar')
        while True:
            nombre=input("Ingresa el nombre y apellido del ciclista: ")
            if nombre != "0":
                lista_ciclistas.append(nombre)
            else:
                break
        #creamos la matriz tiempo nula:
        tiempos=[]
        for i in range(len(lista_ciclistas)):
            fila=[0]*5
            tiempos.append(fila)
        #Recorremos la matriz nula para ir asignando los valores uno a uno
        for i in range (len(lista_ciclistas)):
            for j in range(5):
                tiempos[i][j]=float(input(f"Dame el tiempo del ciclista {lista_ciclistas[i]} en la etapa [{j+1}]: "))
        print ("\nLos datos registrados son: ")
        print(lista_ciclistas)
        for i in range(len(lista_ciclistas)):
            print(tiempos[i])

    elif opcion=="2":
        #Determina el ganador de la vuelta:
        sumas_tiempos=[] #Guardaremos las suma de tiempo de todas las etapas por ciclista 
        for i in range(len(lista_ciclistas)):
            suma=0 
            for j in range(5):
                suma+=tiempos[i][j]
            sumas_tiempos.append(suma)   
        print ("El Ganodor de la vuelta es: ")
        print(lista_ciclistas[sumas_tiempos.index(min(sumas_tiempos))])           

    elif opcion=="3":
        #Hallamos el ganador de una etapa en particular
        etapa=int(input("Ingresa el número de la etapa: "))
        tiempo=tiempos[0][etapa-1]
        indice_menor=0
        for i in range(1,len(lista_ciclistas)):
            if tiempos[i][etapa-1]<tiempo:
                indice_menor=i
                tiempo=tiempos[i][etapa-1]
        print("El ganador de la etapa es: ", lista_ciclistas[indice_menor])

    elif opcion == "4":
        #Mostrar ganadores de cada una de las etapas:
        print("opción 4")
    elif opcion=="5":
        break
    else:
        print("Introduce una opción valida")
print("Fin")
   