T = int(input())

test = []

for i in range(T):
    test.append(int(input()))
    cool = test[i]
    print(int(cool / 25), end=" ")
    cool = cool % 25

    print(int(cool / 10), end=" ")
    cool = cool % 10

    print(int(cool / 5), end=" ")
    cool = cool % 5

    print(int(cool / 1))
    cool = cool % 1

#쿼터 0.25  다임 0.10   니켈 0.05   페니 0.01


