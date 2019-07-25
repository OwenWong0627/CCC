Start = str(input())
End = str(input())
Battery = int(input())
StartCoordinate = [int(e) for e in Start.split()]
Endcoordinate = [int(e) for e in End.split()]

def determineNumberOfSteps(startlist,endlist):
    steps = 0
    steps = steps + abs(startlist[0]-endlist[0])
    steps = steps + abs(startlist[1]-endlist[1])
    return steps
if determineNumberOfSteps(StartCoordinate,Endcoordinate) == Battery:
    print('Y')
elif determineNumberOfSteps(StartCoordinate,Endcoordinate) <= Battery and abs(determineNumberOfSteps(StartCoordinate,Endcoordinate)-Battery)%2==0:
    print('Y')
else:
    print('N')