#matrices :listas de listas
#columnbas deben ser iguales a filas

M=[[1,0,0],[0,1,0],[0,0,1]]

M[0][0]=0  # dordenar para que quede en diagonal
M[0][2]=1  
M[2][0]=1
M[2][2]=0


print(M[0])  #numero de posicion[0]
print(M[1])
print(M[2])

#M=[0,0,0]*3  
#print(M)


"""
#darle dimencion = 9ceros
#es practico llenar matrices y luego llenarlas
# darles dimenciones de una

M=[]                   # es basia (esta es nula  M=[0,0])
for i in range (4):     #para llenar la matris 
    a=[0]*4
    M.append (a)        # metodo para llenar matrices
    print(M[i])

"""
""""
M = []
for i in range (5):
    a = [0]*5
    a[i]= 0
    M.append (a)
    print (M[i])
"""
#completar
"""

M=[[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0],[0,0,0,0,0]]
for i in range(5):
    for j in range(5):
        if i==j:
"""
"""
#pedir mimenciones y llenarls por teclado
m=int(input("Dime el numero de filas: "))
n=int(input("Dime el numero de colummna: "))
"""
#crear matris nula
"""
M=[]
for i in range(m):
    M.append([0]*n)
    
#y leemos el contenido de teclado 
for i in range(m):
    for j in range(n):
        M[i][j]=float(input("dame el componente [{0}][{1}]: ".format(i,j)))
    print(M[i])

for i in range(m):
    print(M[i])
print("el numero de filas es: ",len(M))         # len numero de filas para una matris 
print("el numero de colummnaes: ",len(M[0]))
"""
"""
#suma de matrices: operaciones 
print("Suma de matrices")
m=int(input("Dime el numero de filas: "))
n=int(input("Dime de columnas: "))

# creamos dos matrices nulas
A=[]
for i in range(m):
    A.append([0*n])

B=[]
for j in range(m):
    B.append([0*n])
#leemos el contenido por teclado

print("lectura de la matris A: ")
for i in range(m):
    for j in range(n):
        A[i][j]=float(input(f"ingrese el componente A[{i}][{j}]: "))
print("lectura de la matris B: ")
for i in range(m):
    for j in range(n):
        B[i][j]=float(input(f"ingrese el componente B[{i}][{j}]: "))
print(B)
print(A)

print([A]+[B])
"""