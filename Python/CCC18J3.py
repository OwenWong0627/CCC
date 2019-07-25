city = str(input())
cities = []
for i in city.split():
    cities.append(int(i))
citiesDistance = []
totalDistance = 0
for i in range(0, len(cities)+1):
    for a in range(0, len(cities)+1):
        if i == a:
            citiesDistance.append(0)
        if i < a:
            for b in range (i, a):
                totalDistance += cities[b]
            citiesDistance.append(totalDistance)
        if i > a:
            for b in range (a,i):
                totalDistance += cities[b]
            citiesDistance.append(totalDistance)
        totalDistance = 0
    print(' '.join(str(e) for e in citiesDistance))
    citiesDistance = []