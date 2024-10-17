dial = []
time = 0

dial = input()

for i in range(len(dial)):
    if dial[i] >= 'A' and dial[i] <= 'C':
        time += 3
    if dial[i] >= 'D' and dial[i] <= 'F':
        time += 4
    if dial[i] >= 'G' and dial[i] <= 'I':
        time += 5
    if dial[i] >= 'J' and dial[i] <= 'L':
        time += 6
    if dial[i] >= 'M' and dial[i] <= 'O':
        time += 7
    if dial[i] >= 'P' and dial[i] <= 'S':
        time += 8
    if dial[i] >= 'T' and dial[i] <= 'V':
        time += 9
    if dial[i] >= 'W' and dial[i] <= 'Z':
        time += 10

print(time)