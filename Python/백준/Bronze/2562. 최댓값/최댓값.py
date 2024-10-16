arr = []

for _ in range(9):
    i = int(input())
    arr.append(i)

print(max(arr))
print(arr.index(max(arr))+1)