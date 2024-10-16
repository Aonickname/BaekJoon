arr = [0] * 9

for i in range(9):
    arr[i] = int(input())

print(max(arr))

for i in range(9):
    if max(arr) == arr[i]:
        print(i+1)
        break