#include <stdio.h>

int main(){
    int inputNum[6] = {0};
    int chessNum[6] = {1, 1, 2, 2, 2, 8};

    scanf("%d %d %d %d %d %d",&inputNum[0], &inputNum[1], &inputNum[2], &inputNum[3], &inputNum[4], &inputNum[5]);

    for (int i = 0; i < sizeof(inputNum)/4; i++){
        if (chessNum[i] >= inputNum[i]){
            int addNum = chessNum[i] - inputNum[i];
        
            printf("%d ", addNum);
        } 
        else if(chessNum[i] < inputNum[i]){
            int addNum = chessNum[i] - inputNum[i];

            printf("%d ", addNum);
        }
    }
    
    return 0;
}