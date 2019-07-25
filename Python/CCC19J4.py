flips = str(input())
grid = [['1','2'],['3','4']]

def horizontalflip(list):
    store1 = 0
    store2 = 0
    store1 = list[0][0]
    store2 = list[0][1]
    list[0][0] = list[1][0]
    list[0][1] = list[1][1]
    list[1][0] = store1
    list[1][1] = store2
    return list

def verticalflip(list):
    store1 = 0
    store2 = 0
    store1 = list[0][0]
    store2 = list[1][0]
    list[0][0] = list[0][1]
    list[1][0] = list[1][1]
    list[0][1] = store1
    list[1][1] = store2
    return list

for i in flips:
    if i == 'H':
        horizontalflip(grid)
    if i == 'V':
        verticalflip(grid)
for i in grid:
    print(' '.join(i))