NumberOfParking = int(input())
FirstDay = str(input())
SecondDay = str(input())
TotalOccupied = 0

for i in range(NumberOfParking):
    if FirstDay[i-1] == SecondDay[i-1]:
        if FirstDay[i-1] == 'C':
            TotalOccupied += 1
print(TotalOccupied)