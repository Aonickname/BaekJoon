while True:
    n = int(input())
    if n == -1:
        break

    divisors = []

    for i in range(1, int(n**0.5) + 1):
        if n % i == 0:
            divisors.append(i)
            if i != 1 and i != n // i:
                divisors.append(n // i)

    total = sum(divisors)

    if total == n:
        divisors.sort()
        print(f"{n} = {' + '.join(map(str, divisors))}")
    else:
        print(f"{n} is NOT perfect.")
