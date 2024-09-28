#include <stdio.h>

int main(void){
    int matrix = 0;
    int max = 0; 
    int max_i = 0, max_j  = 0;

    //최댓값 추출
    for (int i = 0; i < 9; i++){
        for (int j = 0; j < 9; j++){
            scanf("%d", &matrix);

            if (matrix > max){
                max = matrix;
                max_i = i;
                max_j = j;
            }

        }
    }

    printf("%d\n%d %d", max, max_i+1, max_j+1);

    return 0;
}