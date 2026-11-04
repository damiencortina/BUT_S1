from math import *

# === factorielle(n) ===#
def factorielle(n):
    if(n<0):
        return
    if n <= 1:
        return n
    return n*factorielle(n-1)

assert factorielle(-7) == None, "Factorielle d'un nombre négatif devrait retourner none"
assert factorielle(1) == 1, "Factorielle de 1 devrait retourner 1"
assert factorielle(2) == 2, "Factorielle de 2 devrait retourner 2"
assert factorielle(3) == 6, "Factorielle de 3 devrait retourner 3"
assert factorielle(4) == 24, "Factorielle de 4 devrait retourner 4"
assert factorielle(5) == 120, "Factorielle de 5 devrait retourner 5"

# === absolue(n) ===#
def absolue(n):
    if n>=0:
        return n
    return -n

assert absolue(0) == 0, "absolue(0) devrait retourner 0"
assert absolue(-12) == 12, "absolue(12) devrait retourner 12"
assert absolue(35) == 35, "absolue(35) devrait retourner 35"

# === u1(n) === #
def u1(n):
    if(n<1):
        return
    if(n <= 1):
        return n
    return n+u1(n-1)

assert u1(-5) == None
assert u1(0) == None
assert u1(1) == 1
assert u1(2) == 3
assert u1(3) == 6
assert u1(4) == 10

# === u2(n) === #
def u2(n):
    if(n<1):
        return
    return (n*(n+1))//2

assert u2(-5) == None
assert u2(0) == None
assert u2(1) == 1
assert u2(2) == 3
assert u2(3) == 6
assert u2(4) == 10

# === v(n) === #
def v(n):
    if n == 0:
        return 1745
    return (0.9972*v(n-1)) + 2123

assert v(0) == 1745
assert v(1) == 0.9972*1745 + 2123
assert v(2) == 0.9972*(0.9972*1745 + 2123)+2123

# v semble strictement croissant


# === tricroissant(a,b,c) === #
def tricroissant(a,b,c):
    if(a<b and a<c):
        if(b<c):
            return a,b,c
        else:
            return a,c,b
    elif(b<a and b<c):
        if(a<c):
            return b,a,c
        else:
            return b,c,a
    else:
        if(a<b):
            return c,a,b
        else:
            return c,b,a

print(tricroissant(1,5,2))