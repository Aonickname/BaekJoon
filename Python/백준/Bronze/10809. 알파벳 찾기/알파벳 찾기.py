S = input()
position = [-1] * 26
for i in range(len(S)):
    index = ord(S[i]) - 97
    if position[index] == -1:
        position[index] = i

for i in range(26):
    print(position[i], end=" ")
