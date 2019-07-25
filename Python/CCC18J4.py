plants = int(input())
heights = []
for plant in range(plants):
  heights.append([int(d) for d in input().split()])
def check(list):
    Check = True
    for c in range(len(list)): #column
        for r in range(len(list)-1): # row
            if list[r][c] < list[r+1][c]:
                Check = True
            else:
                Check = False
                break
    for c in range(len(list)-1): #column
        for r in range(len(list)): # row
            if Check == False:
                break
            elif list[r][c] < list[r][c+1]:
                Check = True
            else:
                Check = False
                break
    return Check

def rotate(list):
    stage = []
    length = len(list)
    for bleh in range(length):
        stage.append([])
    print(stage)
    for otherrow in range(length):
        for row in range(length): # For the first row
            stage[otherrow].append(list[row][-(otherrow+1)])
            print(list[row][-(otherrow+1)])
    return stage

while not check(heights):
    heights = rotate(heights)

for i in range(len(heights)):
    print(' '. join(str(e) for e in heights[i]))