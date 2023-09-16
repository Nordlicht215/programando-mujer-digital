print("Ingrese la cantidad de números que posee su lista")
n=int(input())
lista=[]
print("Ingrese los números de la lista: ")
for i in range (n):
    lista.append(float(input()))
minim=lista[0]
maxim=lista[0]

for i in range (n):
    if lista[i]<minim:
        minim=lista[i]
    if lista[i]>maxim:
        maxim=lista[i]

print("El máximo valor en lista es: ", maxim)
print("El mínimo valor en lista es: ", minim)
