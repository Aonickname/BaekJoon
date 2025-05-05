#include <stdio.h>

int main(void){
    int N = 0;
    int arr[10] = {0};
    int k = 0;

    scanf("%d", &N);

    while(N != 0){
        arr[k] = N % 10;
        N = N / 10;
        k++;
    }

    for (int i = 0; i < k - 1; i++){
        for (int j = i + 1; j < k; j++){
            if(arr[i] < arr[j]){
                int temp = arr[i];
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