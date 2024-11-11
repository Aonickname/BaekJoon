croatian_alphabets = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

word = input()

for alphabet in croatian_alphabets:
    word = word.replace(alphabet, "*")

print(len(word))
