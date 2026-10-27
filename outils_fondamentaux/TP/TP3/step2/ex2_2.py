from functions.horner import evaluer
import timeit

print(evaluer([2, 3, 0, 5], 2))
print(evaluer([2, 3, 0, 5], 0))

coeffs = range(10000)
