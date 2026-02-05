import sys
input = sys.stdin.readline

n, m = map(int, input().split())

arr = {}

for i in range(n):
    word = input().strip()

    if len(word) >= m:
        arr[word] = arr.get(word, 0) + 1    


sorted_arr = sorted(arr.items(), key = lambda x: ( -x[1], -len(x[0]), x[0] ))

for key, value in sorted_arr:
    print(key)