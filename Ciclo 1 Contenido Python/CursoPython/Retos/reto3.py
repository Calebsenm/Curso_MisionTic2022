
from os import system                                               #importar cosas del sistema ("cls") and exit()
system("cls")                                                       #limpiar consola
print("Bienvenido al sistema de ubicación para zonas públicas WIFI")

usuario="52215"                                                       #usuario almacenado 
contraseña="51225"                                                   #contraseña almacenada
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
        print(f"Usted ha elegido la opción {opc3}")
        
    elif op_menu_p==opc4:
        print(f"Usted ha elegido la opción {opc4}")
        
    elif op_menu_p==opc5:
        print(f"Usted ha elegido la opción {opc5}")
        
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
    elif not (op_menu_p==opc1 or op_menu_p==opc2 or op_menu_p==opc3 or op_menu_p==opc4 or op_menu_p==opc5 or op_menu_p==opc6 or op_menu_p==opc7):
        contar_errores+=1
        if contar_errores>=3:
            system("cls")
            print("Error")
            break




