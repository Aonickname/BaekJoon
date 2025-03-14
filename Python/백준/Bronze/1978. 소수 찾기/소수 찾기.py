N = int(input())
prime_nums = list(map(int, input().split()))

result = [] 

# for i in range(N):
#     cnt = 0

#     for j in range(1, int(prime_nums[i]) + 1):
#         if prime_nums[i] % j == 0:
#             cnt += 1
    
#     if cnt == 2:
#         result.append(prime_nums[i])

for i in range(N):
    num = prime_nums[i]
    if num < 2:
        continue

    is_prime = True
    for j in range(2, int(num**0.5) + 1):
        if num % j == 0:
            is_prime = False
            break
    
    if is_prime:
        result.append(num)

print(len(result))
