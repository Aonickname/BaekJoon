#include <stdio.h>
#include <stdlib.h>

int main(void){
    int N, k = 0;
    int *arr = NULL;
    int temp = 0;

    scanf("%d %d", &N, &k);
    arr = (int *)(malloc(sizeof(*arr) * (N + 1)));


    for (int i = 1; i <= N; i++){
        scanf("%d", &arr[i]);
    }
    
    for (int i = 1; i < N; i++){
        for (int j = i+1; j <= N; j++){
            if (arr[i] < arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        
    }

    printf("%d",arr[k]);

    free(arr);

    return 0;
}
