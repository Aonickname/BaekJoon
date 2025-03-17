a, b, c = map(int, input().split())

nums = [a, b ,c]
nums.sort()

max_num = max(a, b, c)
other_num_sum = nums[0] + nums[1]

while True:

    if max_num < other_num_sum:
        print(max_num + other_num_sum)
        break
    else:
        max_num -= 1