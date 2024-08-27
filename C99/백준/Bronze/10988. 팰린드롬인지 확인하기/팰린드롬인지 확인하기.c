#include <stdio.h>
#include <string.h>
#define arrSize 100

int main() {
    char sentence[arrSize];
    char resentence[arrSize];
    int length = 0;
    
    scanf("%s", sentence);

    length = strlen(sentence);
    
    for (int i = 0; i < length; i++) {
        resentence[i] = sentence[length - 1 - i];
    }
    
    resentence[length] = '\0';

    if (strcmp(sentence, resentence) == 0){
        printf("1\n");
    } else {
        printf("0\n");
    }
    
    return 0;
}
