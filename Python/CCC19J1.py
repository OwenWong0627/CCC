AThrees = int(input())
ATwos = int(input())
AOnes = int(input())
BThrees = int(input())
BTwos = int(input())
BOnes = int(input())

APoints = 0
BPoints = 0

APoints = (AThrees*3) + (ATwos*2) + AOnes
BPoints = (BThrees*3) + (BTwos*2) + BOnes

if APoints > BPoints:
    print('A')
elif APoints < BPoints:
    print('B')
else:
    print('T')