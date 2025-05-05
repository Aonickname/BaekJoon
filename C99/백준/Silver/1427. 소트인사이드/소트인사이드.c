#include <stdio.h>

int main(void){
    int N = 1234;
    int arr[100] = {0};
    int temp = 0;
    int k = 0;

    scanf("%d", &N);

    while(N != 0){
        arr[k] = N % 10;
        N = N / 10;
        k++;
    }

    for (int i = 0; i < k; i++){
        for (int j = i; j < k; j++){
            if(arr[i] < arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }            
        
        }
    }
    
    for (int i = 0; i < k; i++){
        printf("%d",arr[i]);
    }
    

    return 0;
}