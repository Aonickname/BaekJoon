count = 0
num = 0

N = int(input())

while True:
    num += 1
    if "666" in str(num):
        count += 1
    if count == N:
        break
print(num)
