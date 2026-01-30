n = int(input())

arr = []

for i in range(n):
    arr.append(int(input()))
    
arr.sort()

for num in arr:
    print(num)