dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
a = input()
ret = 0

for j in range(len(a)):
    for i in dial:
        if a[j] in i:
            ret += dial.index(i)+3

print(ret)