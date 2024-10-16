student = [False] * 30

for _ in range(28):
    num = int(input())
    student[num-1] = True

for i in range(30):
    if not student[i]:
        print(i+1)