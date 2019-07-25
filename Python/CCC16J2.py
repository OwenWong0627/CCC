square = []
for i in range(4):
  square.append([int(d) for d in input().split()])
sumOfColumn = 0

def checkRow(list):
    sumOfRow = 0
    sum = []
    check = True
    for i in range(4):
        for a in range(4):
            sumOfRow = sumOfRow + square[i][a]
        sum.append(sumOfRow)
        sumOfRow = 0
    for i in range(3):
        if sum[i] == sum[i+1]:
            check = True
        else:
            check = False
            break
    return check

def checkColumn(list):
    sumOfColumn = 0
    sum = []
    check = True
    for i in range(4):
        for a in range(4):
            sumOfColumn = sumOfColumn + square[a][i]
        sum.append(sumOfColumn)
        sumOfColumn = 0
    for i in range(3):
        if sum[i] == sum[i+1]:
            check = True
        else:
            check = False
            break
    return check

if checkRow(square) == True and checkColumn(square) == True:
    print('magic')
else:
    print('not magic')