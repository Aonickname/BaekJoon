#include <stdio.h>

int main(void){
    int N, i = 0;
    int temp[100] = {0};
    int Ntemp, sum = 0;
    int realN = 0;

    scanf("%d", &realN);

    for (N = 0; N < realN; N++){
        Ntemp = N;
        i = 0;
        sum = 0;

        while (Ntemp != 0){
            temp[i] = Ntemp % 10;
            sum += temp[i];
            Ntemp /= 10;
            i++;
        }
        
        if (N + sum == realN){
            printf("%d\n", N);

            return 0;
        }

    }

    printf("0\n");    
        
    return 0;
}