n, m = map(int, input().split())

basket = [i for i in range(1, n+1)]
temp = 0

for x in range(m):
    i,j = map(int, input().split())
    temp = basket[i-1:j]
    temp.reverse()
    basket[i-1:j] = temp

for x in range(n):
  print(basket[x],end=" ")