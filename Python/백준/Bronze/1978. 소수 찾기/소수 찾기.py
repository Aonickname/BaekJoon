N = int(input())
prime_nums = list(map(int, input().split()))

result = [] 

for i in range(N):
    cnt = 0

    for j in range(1, int(prime_nums[i]) + 1):
        if prime_nums[i] % j == 0:
            cnt += 1
    
    if cnt == 2:
        result.append(prime_nums[i])

print(len(result))
