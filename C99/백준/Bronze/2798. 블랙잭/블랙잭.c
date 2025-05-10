#include <stdio.h>
#include <stdlib.h>

int main(void){
    int N, M, max = 0;
    int *arr = NULL;
    int sum = 0;

    scanf("%d %d", &N, &M);

    arr = malloc(sizeof(int) * N);

    for (int i = 0; i < N; i++){
        scanf("%d",&arr[i]);
    }
    
    for (int i = 0; i < N; i++){
        for (int j = i+1; j < N; j++){
            for (int k = j+1; k < N; k++){

                sum = arr[i] + arr[j] + arr[k];

                if(sum <= M && sum > max)
                    max = sum;

                sum = 0;

            }
        }
    }

    printf("%d", max);

    free(arr);
    return 0;
}