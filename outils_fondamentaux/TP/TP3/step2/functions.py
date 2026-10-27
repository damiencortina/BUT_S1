def horner(P, x):
    total = 0
    for coeff in reversed(P):
         total = total * x + coeff
    return total