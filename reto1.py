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