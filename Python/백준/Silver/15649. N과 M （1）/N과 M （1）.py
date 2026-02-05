from itertools import permutations

n, m = map(int, input().split())

items = []

for i in range(n):
    items.append(i+1)
    
result = list(permutations(items, m))


for num in result:
    print(" ".join(map(str, num)))    