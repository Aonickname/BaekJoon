x, y, w, h = map(int, input().split())

results = [(w - x), x, (h - y), y]

print(min(results))