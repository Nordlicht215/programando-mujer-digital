print("Ingrese la cantidad de números que posee su lista")
n=int(input())
lista=[]
print("Ingrese los números de la lista: ")
for i in range (n):
    lista.append(float(input()))
print("La lista invertida es: ")
for i in range (n):
    print(lista[n-1-i])
    print(" ")
