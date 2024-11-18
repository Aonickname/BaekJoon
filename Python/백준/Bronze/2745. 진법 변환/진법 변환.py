N, B = input().split()
B = int(B)

i = 0
total_sum = 0

for char in reversed(N):
    if '0' <= char <= '9':
        total_sum += (ord(char) - ord('0')) * (B ** i)
    else:
        total_sum += (ord(char) - ord('A') + 10) * (B ** i)
    i += 1

print(total_sum)
