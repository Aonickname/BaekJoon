a = int(input())
b = int(input())
c = int(input())

if a + b + c != 180:
    print("Error")
else:
    if a == b == c:
        print("Equilateral")
    else:
        if a == b or a == c or b == c:
            print("Isosceles")
        else:
            print("Scalene")