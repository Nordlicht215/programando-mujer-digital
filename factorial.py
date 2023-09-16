
def factorial(num):
    i=0
    fact=1
    while i<num:
        fact=num*factorial(num-1)
        i=i+1
    return fact
print("Ingrese un número: ")
num=int(input())
f=factorial(num)
print("El factorial del número es: ", f)
