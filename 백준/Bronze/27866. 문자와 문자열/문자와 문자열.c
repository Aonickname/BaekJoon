#include <stdio.h>
#define SIZE 1000

int main(void){
    char STR[SIZE];
    int num = 0;

    scanf("%s",&STR);
    scanf("%d", &num);

    printf("%c",STR[num-1]);

    return 0;
}