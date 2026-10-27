def diviseurs(a):
    divs = [];
    for i in range(1, a+1):
        if a % i == 0:
            divs.append(i)
    print(divs)

diviseurs(28)