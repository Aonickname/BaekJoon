N = int(input())

line = 1
while N > line:
    N -= line
    line += 1

if line % 2 == 0:
    numerator = N
    denominator = line - N + 1
else:
    numerator = line - N + 1
    denominator = N

print(f"{numerator}/{denominator}")