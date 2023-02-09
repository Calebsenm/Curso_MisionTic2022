# ejercicico de lectura de ficheros 
#paso 1 abrir el fichero

fichero=open("Txt.txt","r")

#paso dos  leer los datos del fichero
for linea in fichero:
    print(linea)
#paso 3 cerrar ficheros 
fichero.close()
