N = int(input())

i = 2

if N == 1:
    exit()

while True:

    if N % i == 0:
        N = N // i
        print(i)
    else:
        i += 1
    
    if N == 1:
        break