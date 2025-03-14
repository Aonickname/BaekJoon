import math

M = int(input())
N = int(input())

prime_nums = []

for i in range(max(2, M), N + 1):
    is_prime = True
    for j in range(2, int(math.sqrt(i)) + 1):
        if i % j == 0:
            is_prime = False
            break
    if is_prime:
        prime_nums.append(i)

if len(prime_nums) == 0:
    print(-1)
else:
    print(sum(prime_nums))
    print(min(prime_nums))
