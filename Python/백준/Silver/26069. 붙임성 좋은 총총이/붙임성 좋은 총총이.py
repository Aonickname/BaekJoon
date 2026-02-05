n = int(input())

arr = set()
arr.add("ChongChong")

for i in range(n):
    name1, name2 = input().split(" ")    

    if name1 in arr or name2 in arr:
        arr.add(name1)
        arr.add(name2)
    
print(len(arr))