N = int(input())

x = []
y = []

for i in range(N):
    num_x, num_y = map(int, input().split())
    x.append(num_x)
    y.append(num_y)

print((max(x) - min(x)) * (max(y) - min(y)))
