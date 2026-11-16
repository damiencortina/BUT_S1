from math import *

# === Question 1 === #
def dernierChiffre(n):
    if(n<0):
        return abs(n)%10
    return n%10

#print(dernierChiffre(1))
#print(dernierChiffre(-4))
#print(dernierChiffre(-12))
#print(dernierChiffre(-128482819))
#print(dernierChiffre(1232421))

# === Question 2 === #
def deuxDerniersChiffres(n):
    mod = 100
    if(n<0):
        return abs(n)%mod
    return n%mod

#print(deuxDerniersChiffres(1))
#print(deuxDerniersChiffres(12))
#print(deuxDerniersChiffres(134223))
#print(deuxDerniersChiffres(-23231))
#print(deuxDerniersChiffres(-1))

# === Question 3 === #
def derniersChiffres(n, nbre):
    if(nbre<1):
        return
    mod = 10**nbre
    if(n<0):
        return abs(n)%mod
    return n%mod

#print(derniersChiffres(1,3))
#print(derniersChiffres(12,3))
#print(derniersChiffres(134223,3))
#print(derniersChiffres(-23231,3))
#print(derniersChiffres(-1,3))
#print(derniersChiffres(2**3542,1000))

# === Question 4 === #
def nombreChiffres(n):
    nbre = 0
    n=abs(n)
    if n == 0:
        return 1
    while(n>0):
        n//=10
        nbre+=1
    return nbre

#print(nombreChiffres(12))
#print(nombreChiffres(1263847284742))
#print(nombreChiffres(7**12423))

# === Question 5 === #
def premierChiffre(n):
    n = abs(n)
    while(n>=10):
        n//=10
    return n

#print(premierChiffre(4312342))
#print(premierChiffre(-4312342))
#print(premierChiffre(1))
#print(premierChiffre(-1))
#print(premierChiffre(0))

# === Question 6 === #
def premiersChiffres(n,nbre):
    if(nbre < 1):
        return
    n = abs(n)
    while(n>=10**nbre):
        n//=10
    return n

#print(premiersChiffres(4312342,3))
#print(premiersChiffres(-4312342,4))
#print(premiersChiffres(1,3))
#print(premiersChiffres(-1,1))
#print(premiersChiffres(0,2))


# === Question 7 === #
def chiffres(n,debut,fin):
    if(fin<debut):
        return
    if(fin>nombreChiffres(n)):
        fin = nombreChiffres(n)-1
        print(debut)
        print(fin)
    n = premiersChiffres(n, fin)
    n = derniersChiffres(n, fin-debut+1)
    return n

print(chiffres(4312342,2,4))
print(chiffres(4312342,2,12))
print(chiffres(456345234, 3, 6))
print(chiffres(456345234, 7, 28))
print(chiffres(456345234, 7, 9))