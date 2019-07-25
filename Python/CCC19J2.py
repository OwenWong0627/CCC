numberoflines = int(input())
encodedmessage= []
eachlineofmessage = ''
decodedmessage = ''

for i in range(numberoflines):
    eachlineofmessage = str(input())
    encodedmessage.append(eachlineofmessage.split())

for i in range(numberoflines):
    encodedmessage[i][0] = int(encodedmessage[i][0])

for i in range(numberoflines):
    for a in range(encodedmessage[i][0]):
        decodedmessage = decodedmessage + encodedmessage[i][1]
    print(decodedmessage)
    decodedmessage = ''