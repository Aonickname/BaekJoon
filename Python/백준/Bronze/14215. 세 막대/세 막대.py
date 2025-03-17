a, b, c = map(int, input().split())

nums = sorted([a, b ,c])

if nums[2] < nums[0] + nums[1]:
    print(sum(nums))
else:
    print(2 * (nums[0] + nums[1]) -1)
    