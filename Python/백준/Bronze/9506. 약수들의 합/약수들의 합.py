while True:
    n = int(input())
    result = 0
    sum = 0

    if n == -1:
        break

    for i in range(1, n):
        if n % i == 0:
            result += i

    if result == n:
        print(f"{n} = ", end ="")

        for i in range(1, n):
            if n % i == 0:
                print(f"{i}", end = "")
                sum += i

                if sum == n:
                    break
                print(f" + ", end = "")

            
            
        
        print()

    else:
        print(f"{n} is NOT perfect.")