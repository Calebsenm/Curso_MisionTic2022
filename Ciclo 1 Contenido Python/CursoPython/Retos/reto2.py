
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

#Reto N2:
menu=["Cambiar contraseña","Ingresar coordenadas actuales", "Ubicar zona wifi más cercana",
    "Guardar archivo con ubicación cercana","Actualizar registros de zonas wifi desde archivos",
    "Elegir opción de menú favorita","Cerrar sesión"]
contar_errores=0
c=1
while True:
    for elemento in menu:
        print(str(c)+"."+elemento)
        c+=1
    c=1
    op_menu_p=input("Elija una opción: ")
    if op_menu_p=="1":
        print("Usted ha elegido la opción 1")
        break
    elif op_menu_p=="2":
        print("Usted ha elegido la opción 2")
        break
    elif op_menu_p=="3":
        print("Usted ha elegido la opción 3")
        break
    elif op_menu_p=="4":
        print("Usted ha elegido la opción 4")
        break
    elif op_menu_p=="5":
        print("Usted ha elegido la opción 5")
        break
    elif op_menu_p=="6":
        op_fav=input("Selecione opción favorita: ")
        if op_fav=="1" or op_fav=="2"or op_fav=="3" or op_fav=="4" or op_fav=="5":
            adivinanza1=input("Si quieres contar, por mí tienes que empezar: ")
            if adivinanza1=="1":
                adivinanza2=input("¿Qué número tiene el mismo número de letras que el valor que expresa?")
                if adivinanza2=="5":
                    temporal=menu[0]
                    menu[0]=menu[int(op_fav)-1]
                    menu[int(op_fav)-1]=temporal
                    system("cls")
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
    elif op_menu_p=="7":
        system("cls")
        print("Hasta Pronto")
        break
    elif not (op_menu_p=="1" or op_menu_p=="2"or op_menu_p=="3" or op_menu_p=="4" or op_menu_p=="5" or op_menu_p=="6" or op_menu_p=="7"):
        contar_errores+=1
        if contar_errores>=3:
            system("cls")
            print("Error")
            break




