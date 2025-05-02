#include <stdio.h>
#include <stdlib.h>
void input_arr(int arr[], int size, int *avg);
void print_arr(int arr[], int size, int avg);
void sort_arr(int arr[], int size);


int main(void){
    int *arr = NULL;
    int size = 6;   // arr[0]은 비워두고 arr[1]~arr[5] 사용
    int avg = 0;

    arr = (int *)(malloc(sizeof(*arr) * size));


    input_arr(arr, size, &avg);
    sort_arr(arr, size);

    print_arr(arr, size, avg);

    
    free(arr);

    return 0;
}

void input_arr(int arr[], int size, int *avg){

    for (int i = 1; i < size; i++){
        scanf("%d",&arr[i]);
        *avg += arr[i];
    }
    
}

void print_arr(int arr[], int size, int avg){

    printf("%d\n", avg / (size - 1));
    printf("%d", arr[(size -1) / 2 + 1]);
}

void sort_arr(int arr[], int size){
    int temp = 0;

    for (int i = 1; i < size - 1; i++){
        for (int j = i+1; j < size; j++){
            if (arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        

    }
    
}