
from os import system
from math import asin, cos, sin,sqrt
from typing import DefaultDict 
coordenadas_predefinidas=[[6.124,-75.946,1035],[6.125,-75.966,109],[6.135,-75.976,31],[6.144,-75.836,151]]
lista_distancias=[]
def laculcula_distancia(lat,long):
    l_distancias=[]
    R=6372.79547798
    for i in range(4):
        delta=coordenadas_predefinidas[i][0]-lat
        dlong=coordenadas_predefinidas[i][1]-long
        Distancia=2*R*asin(sqrt(sin(delta/2)**2+ (cos(lat)*cos(coordenadas_predefinidas[i][0])*sin(dlong/2)**2)))   
        l_distancias.append(Distancia)
    return l_distancias  

system("cls")                                                       
print("Bienvenido al sistema de ubicación para zonas públicas WIFI")

usuario="52215"                                                 
contraseña="51225"
secreto="Tripulante2022"
opccion_secreta=2022
catcha1=215
catcha2=((5*2)-5)-(2+2)

#se solicita al usuario introducir su usuario
user=input("Ingrese su usuario: ")
if user==usuario:
    system("cls")                                                   #limpiar consola
    pasw=input("Ingrese su contraseña: ")
    if pasw==contraseña:
        validar=int(input(f" Resuelve: {catcha1} + {catcha2} = "))  # fromatos para unir distintos valores 
        if validar== catcha1+catcha2:
            print("Sesión iniciada")
        else:
            print("Error")
            exit()
    else:
        print("Error")
        exit()                                                       #salir del progama
elif user==secreto:
    print("Este fue mi primer programa y vamos por más")
    exit()
    
else:
    print("Error")
    exit()

#Reto N2:
menu=["Cambiar contraseña","Ingresar coordenadas actuales", "Ubicar zona wifi más cercana",
    "Guardar archivo con ubicación cercana","Actualizar registros de zonas wifi desde archivos",
    "Elegir opción de menú favorita","Cerrar sesión"]
#declaracion de las variables de las opcciones 
opc1="1"
opc2="2"
opc3="3"
opc4="4"
opc5="5"
opc6="6"
opc7="7"
contar_errores=0
c=1
Matriz=[]
while True:
    for elemento in menu:
        print(str(c)+"."+elemento)
        c+=1
    c=1
    op_menu_p=input("Elija una opción: ")
    if op_menu_p==opc1:
        system("cls")
        print(f"Usted ha elegido la opción {opc1}")
        while True:
            try:
                verificacion=input("Verifique su contraseña: ")
                if verificacion==pasw:
                    nuevapasw=int(input("Ingrese su nueva Contraseña: "))
                    if nuevapasw != pasw:

                        nuevapasw2=int(input("Verifique su nueva Contraseña: "))
                        if nuevapasw2==nuevapasw:
                            system("cls")
                            pasw=nuevapasw
                            print(f"Su contraseña se ha canbiado exitosamente, su nueva contraseña es {pasw} ")
                            break
                        else:
                            print("las contraeñas no coinciden")
                            break
                    else:
                        print("Error la contraseña no puede ser igual a la contraseña actual")
                        break
                else:
                    print("Error")
                    exit()
            except Exception:
                print("Solo está permitido un valor numerico")
    elif op_menu_p==opc2:
        print(f"Usted ha elegido la opción {opc2}")
        if len(Matriz)==0:
            for i in range(3):
                Matriz.append([])
                try:
                    Latitud=float(input("Ingresa la latitud: "))
                    if Latitud <=6.284 and Latitud >=6.077:
                        Matriz[i].append(Latitud)
                    else:
                        print("Error coordenada")
                        exit()
                    Longitud=float(input("Ingrese la longitud: "))
                    if Longitud <= -75.841 and Longitud >= -76.049:
                        Matriz[i].append(Longitud)
                    else:
                        print("Error coordenada")
                        exit()
                except Exception:
                    print("Error coordenada")
                    exit()
        else:
            Lista_latitudes=[]
            Lista_longitudes=[]
            for elemento in Matriz:
                Lista_latitudes.append(elemento[0])
                Mas_alsur=Lista_latitudes.index(min(Lista_latitudes))+1
            
            Lista_longitudes.append(elemento[1])
            Mas_alOriente=Lista_longitudes.index(max(Lista_longitudes))+1
            
            print("Coordenada [latitud, longitud] 1: ", Matriz[0])
            print("Coordenada [latitud, longitud] 2: ", Matriz[1])
            print("Coordenada [latitud, longitud] 3: ", Matriz[2])
            print("La coordenada {} es la que esta más al sur".format(Mas_alsur))
            print("La coordenada {} es la que esta más al oriente".format(Mas_alOriente))
            try:
                cambio=int(input("presiona 1,2 o 3 para actualizar la respectiva coordenada. Presiona 0 para regresar al menú: "))
            except Exception:
                print("Error coordenada")
                exit()
            if cambio==0:
                pass
            elif not (cambio <0 or cambio>3):
                cambio_latitid=float(input("Ingresa la nueva latitud: "))
                if cambio_latitid <=6.284 and cambio_latitid >=6.077:
                    Matriz[cambio-1][0]=cambio_latitid
                    cambio_longitud=float(input("Ingresa la nueva longitud: "))
                    if cambio_longitud <= -75.841 and cambio_longitud >= -76.049:
                        Matriz[cambio-1][1]=cambio_longitud
                    else:
                        print("Error coordenada")
                        exit()
                else:
                    print("Error coordenada")
                    exit()
            elif not cambio <0 or cambio>3:
                print("Error actualización")
                exit()
    elif op_menu_p==opc3:
        system("cls")
        print(f"Usted ha elegido la opción {opc3}")
        if len(Matriz)==0:
            print("Error sin registro de coordenadas")
            break
        else:
            print("Coordenada [latitud, longitud] 1: ", Matriz[0])
            print("Coordenada [latitud, longitud] 2: ", Matriz[1])
            print("Coordenada [latitud, longitud] 3: ", Matriz[2])
            mi_ubicacion=int(input("Por favor ingrese su ubicación actual (1,2 o 3) para calcular la distancia a los puntos de conexion: "))
            if mi_ubicacion==1 or mi_ubicacion ==2 or mi_ubicacion==3:
                #se calcula la distancia
                lat=Matriz[mi_ubicacion-1][0]
                long=Matriz[mi_ubicacion-1][1]
                lista_distancias=laculcula_distancia(lat,long)
                #comparar y escoger las distancias menores
                dis_ordenadas=lista_distancias[:]
                dis_ordenadas.sort() #ordenamos las distancias (el metodo sort)
                pos1=lista_distancias.index(dis_ordenadas[0])
                pos2=lista_distancias.index(dis_ordenadas[1])

                if coordenadas_predefinidas[pos1][2]> coordenadas_predefinidas[pos2][2]:
                    pos1,pos2=pos2,pos1
                print("Zona wifi con menos usuarios")
                print(f"la zona wifi 1: ubicada en [{coordenadas_predefinidas[pos1][0]},{coordenadas_predefinidas[pos1][1]}] a {round(lista_distancias[pos1])} metros, tiene en promedio {coordenadas_predefinidas[pos1][2]} usuarios")
                print(f"la zona wifi 2: ubicada en [{coordenadas_predefinidas[pos2][0]},{coordenadas_predefinidas[pos1][1]}] a {round(lista_distancias[pos2])} metros, tiene en promedio {coordenadas_predefinidas[pos2][2]} usuarios")
                opcx=int(input("elija 1 o 2 para recibir indicaciones de llegada"))
                if opcx==1 or opcx==2:
                    if opcx==1:
                        posx=pos1
                    elif opcx==2:
                        posx=pos2
                    if lat <coordenadas_predefinidas[posx][0]:
                        direccion1="norte"
                    else:
                        direccion1="sur"
                    if long<coordenadas_predefinidas[posx][1]:
                        direccion2="oriente"
                    else:
                        direccion2="occidente"

                    tiempo_moto=round(lista_distancias[posx]/19.44,1)
                    tiempo_apie=round(lista_distancias[posx]/0.483,1)
                    print(f"Para llegar a la zona wifi dirijase al {direccion2} y luego hacia el {direccion1}")
                    print(f"-Tiempo en moto: {tiempo_moto} ")
                    print(f"-Tiempo a pie {tiempo_apie}")
                    salir=input("presione 0 para salir: ")
                else:
                    print("Error zona wifi")
                    exit()
            else:
                print("Error ubicación")
                exit()

    elif op_menu_p==opc4:
        print(f"Usted ha elegido la opción {opc4}")
        if len(lista_distancias)==0:
            print("Error de alistamiento")
            exit()
        informacion={
                    "actual":[lat,long],
                    "zonawifi":coordenadas_predefinidas[pos1],
                    "recorrido":[round(lista_distancias[pos1]),"moto",round(tiempo_moto)]
                    }
        print(informacion)
        while True:
            opex=input("Esta de acuerdo con la iformacion a exportar? Presione 1 para confirmar 0 para cerrar")
            if opex=="1":
                fichero=open("informacion.txt","w")
                fichero.write(str(informacion))
                fichero.close()
                print("Exportando archivo")
                exit()
            elif opex=="0":
                break
        
    elif op_menu_p==opc5:
        fichero=open("actualizapredefinidas.txt","r")
        i=0
        for linea in fichero.readlines():
            coordenadas_predefinidas[i]=linea.strip().split(",")
            coordenadas_predefinidas[i][0]=float(coordenadas_predefinidas[i][0])
            coordenadas_predefinidas[i][1]=float(coordenadas_predefinidas[i][1])
            coordenadas_predefinidas[i][2]=int(coordenadas_predefinidas[i][2])
            i+=1
        fichero.close()
        print("Estas son las zonas wifi actualizadas")
        print(coordenadas_predefinidas)
        while True:
            opsub=input("Datos de coordenadas para zonas wifi actualizados, presione 0 para regresar al menú principal")
            if opsub=="0":
                break
    elif op_menu_p==opc6:
        op_fav=input("Selecione opción favorita: ")              
        if op_fav==opc1 or op_fav==opc2 or op_fav==opc3 or op_fav==opc4 or op_fav==opc5:
            
            adivinanza1=input("Si quieres contar, por mí tienes que empezar: ")
            if adivinanza1=="1":
                adivinanza2=input("¿Qué número tiene el mismo número de letras que el valor que expresa?: ")
                if adivinanza2=="5":
                    temporal=menu[0]
                    menu[0]=menu[int(op_fav)-1]
                    menu[int(op_fav)-1]=temporal    
                    system("cls") 
                    if op_fav==opc1:
                        opc1=op_fav
                        opc1="1" 
                                   
                    elif op_fav==opc2:
                        opc1=op_fav
                        opc2="1"
                        
                    elif op_fav==opc3:
                        opc1=op_fav
                        opc3="1"
                        
                    elif op_fav==opc4:
                        opc1=op_fav
                        opc4="1"
                        
                    elif op_fav==opc5:
                        
                        opc1=op_fav
                        opc5="1"
                    continue
                else:
                    system("cls")
                    print("Error")
                    continue
            else:
                print("Error")
                break
        else:
            print("Error")
            break
        opcion

    elif op_menu_p=="7":
        system("cls")
        print("Hasta Pronto")
        break
    if op_menu_p==2021 or op_menu_p=="2021":
        system("cls")
        try:
            latitud_secreta=float(input("Dame una latitud y te diré cual hemisferio es..."))
            if latitud_secreta >0 and latitud_secreta<= 90:
                print("Usted está en hemisferio norte")
                exit()
            elif latitud_secreta <0 and latitud_secreta >=-90:
                print("Usted está en hemisferio sur")
                exit()
            else:
                print("Esta latitud no existe")
                exit()
        except ValueError:
            print("Este valor no esta permitido")
            exit()

    elif not (op_menu_p==opc1 or op_menu_p==opc2 or op_menu_p==opc3 or op_menu_p==opc4 or op_menu_p==opc5 or op_menu_p==opc6 or op_menu_p==opc7):
        contar_errores+=1
        if contar_errores>=3:
            system("cls")
            print("Error")
            break
    

