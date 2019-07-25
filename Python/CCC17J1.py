xValue = int(input())
yValue = int(input())

if xValue > 0 and yValue > 0:
    print(1)
if xValue > 0 and yValue < 0:
    print(4)
if xValue < 0 and yValue > 0:
    print(2)
if xValue < 0 and yValue < 0:
    print(3)