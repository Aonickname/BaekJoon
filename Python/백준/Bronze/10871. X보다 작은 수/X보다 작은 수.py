N, X = map(int, input().split())

arr = [0] * N
arr = list(map(int, input().split()))

for i in range(N):
    if X > arr[i]:
        print(arr[i], end=" ")