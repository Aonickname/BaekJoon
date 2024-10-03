a = input()
b = input()

a = int(a)
b = int(b)

print(a * int(b % 10))
print(a * int(b / 10 % 10))
print(a * int(b / 10 / 10))
print(a * b)