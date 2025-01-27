N, B = map(int, input().split())
nums = []

while N > 0:
    nums.append(N % B)
    N = N // B

nums.reverse()

for value in nums:
    if value < 10:
        print(value, end="")
    else:
        print(chr(value - 10 + ord('A')), end="")
