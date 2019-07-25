shiftyNumber = int(input())
shifts = int(input())
newshiftynumber = shiftyNumber

for i in range(shifts):
    newshiftynumber = newshiftynumber + (shiftyNumber* 10 ** (i+1))
print(newshiftynumber)