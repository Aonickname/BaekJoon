#include <stdio.h>

int main(void){
    int realN, N, sum, Ntemp;

    scanf("%d", &realN);

    int start = realN - 9 * 7;
    if (start < 0) start = 0;
    

    for (N = start; N < realN; N++){
        sum = 0;
        Ntemp = N;

        while (Ntemp != 0){
            sum += Ntemp % 10;
            Ntemp /= 10;
        }
        
        if (N + sum == realN){
            printf("%d\n", N);

            return 0;
        }

    }

    printf("0\n");    
        
    return 0;
}