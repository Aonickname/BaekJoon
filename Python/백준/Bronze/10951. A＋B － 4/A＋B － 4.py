import sys
input = sys.stdin.read

for line in input().splitlines():
    A, B = map(int, line.split())
    print(A + B)
