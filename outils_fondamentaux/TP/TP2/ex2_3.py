def est_premier_naif(n):
    """Teste la primalité en essayant tous les diviseurs jusqu'à n - 1."""
    if n < 2:
        return False
    for d in range(2, n):
        if n % d == 0:
            return False
    return True

print(est_premier_naif(97), est_premier_naif(91))

def est_premier(n):
    """Teste la primalité en s'arrêtant à la racine carrée de n."""
    if n < 2:
        return False
    if n % 2 == 0:
        return n == 2
    d = 3
    while d * d <= n:
        if n % d == 0:
            return False
        d = d + 2
    return True

print(est_premier(97), est_premier(91), est_premier(2), est_premier(1))