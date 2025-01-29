N = int(input())

if N == 1:
    print(1)
else:
    cnt = 1
    range_end = 1

    while N > range_end:
        range_end += 6 * cnt
        cnt += 1

    print(cnt)
