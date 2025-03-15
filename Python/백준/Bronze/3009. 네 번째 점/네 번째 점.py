x = []
y = []
for i in range(0, 3):
    a, b = map(int, input().split())
    x.append(a)
    y.append(b)

for i in x:
    if x.count(i) == 1:
        x4 = i
        break

for i in y:
    if y.count(i) == 1:
        y4 = i
        break

print(f"{x4} {y4}")