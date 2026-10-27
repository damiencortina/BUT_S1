def transposee(A):
    width = len(A[0])
    height = len(A)
    ATransposee = []
    for lineKey, lineValue in enumerate(A) :
        for columnKey, columnValue in enumerate(lineValue) :
            if(lineKey == 0):
                ATransposee.append([])
            ATransposee[columnKey].append(columnValue)
    return ATransposee

def produit(A,B):
    C = []
    for lineKey, lineValue in enumerate(A):
        for columnKey, columnValue in enumerate(A):
            