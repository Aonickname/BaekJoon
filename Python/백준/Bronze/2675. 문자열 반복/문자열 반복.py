T = int(input())

for i in range(T):
    R, S = list((input().split()))
    R = int(R)

    for j in range(len(S)):
        print(S[j] * R, end='')
    print()