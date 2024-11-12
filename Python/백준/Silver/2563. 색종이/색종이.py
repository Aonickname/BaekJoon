canvas = [[0] * 100 for _ in range(100)]

N = int(input())

for _ in range(N):
    x, y = map(int, input().split())

    for i in range(x, x + 10):
        for j in range(y, y + 10):
            canvas[i][j] = 1

area = sum(sum(row) for row in canvas)

print(area)