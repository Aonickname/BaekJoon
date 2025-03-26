#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void sort_arr(int* arr, int N);
void input_arr(int* arr, int N);
void print_arr(int* arr, int N);

int main(void){
    int N;
    int *arr = NULL;

    scanf("%d", &N);

    arr = (int *)(malloc(sizeof(int) * N));

    srand(time(NULL));

    input_arr(arr, N);
    sort_arr(arr, N);
    print_arr(arr, N);


    free(arr);

    return 0;
}

void input_arr(int* arr, int N){

    for(int i = 0; i < N; i++){
        scanf("%d", arr + i);
    }
}

void sort_arr(int* arr, int N){
    int temp = 0;

    for (int i = 0; i < N-1; i++){
        for(int j = 0; j < N-1-i; j++){

            if (arr[j] > arr[j + 1]){
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            }
        }
    }
    
}

void print_arr(int* arr, int N){

    for (int i = 0; i < N; i++){
        printf("%d\n",*(arr+i));
    }
    
}