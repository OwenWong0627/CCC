numberoflines = int(input())
encodedmessage= []
eachlineofmessage = ''
extraspace = 0
for i in range(numberoflines):
    eachlineofmessage = str(input())
    encodedmessage.append(eachlineofmessage)

for i in range(numberoflines):
    a=0
    while a < len(encodedmessage[i])-extraspace-1:
        if encodedmessage[i][a+extraspace] != encodedmessage[i][a+1+extraspace]:
            encodedmessage[i] = encodedmessage[i][0:a+1+extraspace] + ' ' + encodedmessage[i][a+1+extraspace:-1] + encodedmessage[i][-1]
            extraspace += 1
        a+=1
    extraspace = 0

if encodedmessage[-1].find('\r') != -1:
    encodedmessage[-1] = encodedmessage[-1][0:-2]

count = 0
decodedmessage = []
newencodedmessage = []
for i in range(numberoflines):
    newencodedmessage.append(encodedmessage[i].split(" "))

for i in range(numberoflines):
    for a in range(len(newencodedmessage[i])):
        decodedmessage.append(str(len(newencodedmessage[i][a])))
        decodedmessage.append(newencodedmessage[i][a][0])
    print(' '.join(decodedmessage))
    decodedmessage = []