hour, min = input().split()
add = int(input())

time = int(hour)*60 + int(min) + add

if time >= 1440:
    time = time - 1440
    hour = time / 60
    min = time % 60
    print(int(hour), min)
else:
    hour = time / 60
    min = time % 60
    print(int(hour), min)