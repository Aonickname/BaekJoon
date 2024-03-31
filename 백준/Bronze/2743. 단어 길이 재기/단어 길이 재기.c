#include <stdio.h>
#define SIZE 100

int main(void){
    char arr[SIZE];
    int count = 0;

    scanf("%s",&arr);

    for (int i = 0; i < sizeof(arr); i++){
        if (arr[i] != NULL){
            count++;
        }else
            break;
    }
    
    printf("%d",count);

    return 0;
}