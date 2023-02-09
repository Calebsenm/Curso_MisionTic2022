compra=200
print("la compra cuesta 200 pesos")
dinero=int(input("introdusca el dinero para hacer la compra: "))
if dinero<0:
    print("el valor no esta permitido")
elif dinero>0 and dinero<200:
    print("su dinero no es suficiente")
else:
    if dinero==200:
        vuelto=dinero-compra
        print("su vuelto es de: ",vuelto,"pesos")
    else:
        print("su vuelto es",dinero-compra,"pesos")

