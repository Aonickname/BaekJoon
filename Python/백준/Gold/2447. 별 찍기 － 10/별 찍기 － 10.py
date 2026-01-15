def check_blank(i, j):
    while i > 0 or j > 0:
        if i % 3 == 1 and j % 3 == 1:
            return True

        i = i // 3
        j = j // 3
            
    return False

n = int(input())

for i in range(n):
    for j in range(n):
        if(check_blank(i, j) == True):
            print(" ", end = "")
        else:
            print("*", end = "")
        
    print(end = "\n")
