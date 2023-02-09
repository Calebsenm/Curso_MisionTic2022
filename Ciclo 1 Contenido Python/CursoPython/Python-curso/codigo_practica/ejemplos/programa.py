#sentencia condicional   if 


"""""
mayor que >
menor que <

<= menor o igual
>= mayor o igaul

== igual 
!= diferente de
"""""

"""""
a=9
b=0
division= a/b
print(division)


"""
"""""

a=float(input("introduce el numero 1: "))
b=float(input("introduce el numero 2: "))

if b != 0:
    division= a/b
    print(division)

else:
    print("no se puede dividir por cero")

"""

#un programa numero ,  qdetermine si es par o impar dicho numero ingredado

"""""
numero=int(input("ingresa el numero "))

residuo= numero%2
if residuo==0:
    print("el numero es par")

else:
    print("el numero es impar")




a=int(input("ingresa el primer numero: "))
b=int(input("ingresa el segundo numero: "))
c=int(input("ingresa el primer numero: "))

if a>b:
     if a>c:
        mayor=a
   
else:
    if b>c:
        mayor=b
    else:
        mayor=c



print("el mayor es: ", mayor)


"""







try:

 dividiendo=float(input("ingresa el diviso: "))

 divisor=float(input("ingresa el divisor: "))
 division=dividiendo/divisor
 print("la division es: ", division)

except Exception:
    print("no se puede dividir entre sero ")
