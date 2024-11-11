n = int(input())
count = 0

for _ in range(n):
    word = input()
    seen = []
    is_group_word = True
    
    for i in range(len(word)):
        if word[i] not in seen:
            seen.append(word[i])
        else:
            if i > 0 and word[i] != word[i-1]:
                is_group_word = False
                break
    
    if is_group_word:
        count += 1

print(count)
