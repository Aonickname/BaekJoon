#include <stdio.h>
#define length 1000

int main(void){
    int M = 0;  //최대 점수
    int N = 0;  //과목 수
    int score[length] = {0};
    double sum = 0;
    
    scanf("%d", &N);
    
    for (int i = 0; i < N; i++){
        scanf("%d", &score[i]);

        if (score[i] > M){
            M = score[i];
        }
    }
    
    for (int i = 0; i < N; i++){
        sum += ((double)score[i] / M) * 100;
        
    }

    printf("%f", (sum)/N);

    
    


    return 0;
}