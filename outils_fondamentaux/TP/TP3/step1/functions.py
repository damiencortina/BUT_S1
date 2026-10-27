def evaluer_naif(P, x):
    total = 0
    for i in range(len(P)):    
        total = total + P[i] * x ** i
    return total