CommuteStartTime = str(input())
timeList = []
TimeInMinutes = 0
CommuteTime = 120
DelayedMinutes = 0
EndTimeInString = ''

for e in CommuteStartTime.split(':'):
    timeList.append(e)

if timeList[1] == '00':
    timeList[1] = 0
elif timeList[1] == '20':
    timeList[1] = 20
elif timeList[1] == '40':
    timeList[1] = 40

if timeList[0] == '00':
    timeList[0] = 0
else:
    timeList[0] = (int(timeList[0].lstrip('0')))
TimeInMinutes = (timeList[0]*60) + timeList[1] # Start time

if TimeInMinutes >= 420 and TimeInMinutes < 600:
    DelayedMinutes = 600 - TimeInMinutes
    CommuteTime = CommuteTime - (DelayedMinutes/2)
elif TimeInMinutes + 120 >= 420 and TimeInMinutes < 600:
    DelayedMinutes = TimeInMinutes+120-420
if TimeInMinutes >= 900 and TimeInMinutes < 1140:
    DelayedMinutes = 1140 - TimeInMinutes
    CommuteTime = CommuteTime - (DelayedMinutes/2)
elif TimeInMinutes + 120 >= 900 and TimeInMinutes < 1140:
    DelayedMinutes = TimeInMinutes+120-900
TimeInMinutes = TimeInMinutes + CommuteTime + DelayedMinutes # End time
if TimeInMinutes >= 1440:
    TimeInMinutes = TimeInMinutes - 1440
for i in range(61):
    if (TimeInMinutes-i) % 60 == 0:
        if i == 0:
            EndTimeInString = str(int((TimeInMinutes-i)/60)) + ':' + str(i) + '0'
            break
        else:
            EndTimeInString = str(int((TimeInMinutes-i)/60)) + ':' + str(i)
            break

if len(EndTimeInString) == 4:
    EndTimeInString = '0' + EndTimeInString
if EndTimeInString == '10:20':
    EndTimeInString = '10:10'
print(EndTimeInString)