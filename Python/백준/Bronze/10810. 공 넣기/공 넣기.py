N, M = map(int, input().split())

basket = [0] * (N)

for a in range(M):
    i, j, k = map(int, input().split())
    for i in range(i-1, j):
        basket[i] = k

for a in range(N):
    print(basket[a], end=" ")