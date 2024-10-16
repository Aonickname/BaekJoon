arr = []

for _ in range(10):
    i = int(input())
    arr.append(i % 42)

uni_num = set(arr)

print(len(uni_num))