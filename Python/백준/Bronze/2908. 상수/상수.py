A, B = map(int, input().split())

revA = []
revB = []

for i in range(3):
    revA.append(A%10)
    A //= 10
    revB.append(B%10)
    B //= 10
A = 0
B = 0

for i in range(3):
    A += revA[2-i] * 10**i
    B += revB[2-i] * 10**i

if A > B:
    print(A)
else:
    print(B)