N, M = map(int, input().split())

basket = [0] * N

for a in range(N):
    basket[a] = a+1

for a in range(M):
    i, j = map(int, input().split())
    basket[i-1], basket[j-1] = basket[j-1], basket[i-1]

for a in range(N):
    print(basket[a], end = " ")