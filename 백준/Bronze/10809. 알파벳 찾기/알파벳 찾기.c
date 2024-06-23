#include <stdio.h>
#include <string.h>

int main() {
    char word[101];
    int alphabet[26];
    
    // 알파벳 배열을 -1로 초기화
    for (int i = 0; i < 26; i++) {
        alphabet[i] = -1;
    }

    // 단어 입력 받기
    scanf("%s", word);
    
    // 각 알파벳의 첫 등장 위치를 기록
    for (int i = 0; i < strlen(word); i++) {
        if (alphabet[word[i] - 'a'] == -1) {  // 처음 등장하는 경우에만 기록
            alphabet[word[i] - 'a'] = i;
        }
    }
    
    // 결과 출력
    for (int i = 0; i < 26; i++) {
        printf("%d ", alphabet[i]);
    }
    
    return 0;
}
