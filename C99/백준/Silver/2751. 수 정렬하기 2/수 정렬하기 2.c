#include <stdio.h>
#include <stdlib.h>

void merge_sort(int arr[], int temp[], int left, int right);
void merge(int arr[], int temp[], int left, int mid, int right);

int main(void){
    int N;
    scanf("%d", &N);

    int *arr = malloc(sizeof(int) * N);
    int *temp = malloc(sizeof(int) * N);

    for (int i = 0; i < N; i++){
        scanf("%d",&arr[i]);
    }

    merge_sort(arr, temp, 0, N-1);

    for (int i = 0; i < N; i++){
        printf("%d\n", arr[i]);
    }
    
    free(arr);
    free(temp);
    return 0;
}

void merge_sort(int arr[], int temp[], int left, int right){
    if(left >= right) return;

    int mid = (left + right) / 2;

    merge_sort(arr, temp, left, mid);
    merge_sort(arr, temp, mid + 1, right);

    merge(arr, temp, left, mid, right);
}

void merge(int arr[], int temp[], int left, int mid, int right){
    int i = left;
    int j = mid + 1;
    int k = left;

    while(i <= mid && j <= right){
        if(arr[i] <= arr[j])
            temp[k++] = arr[i++];
        else
            temp[k++] = arr[j++];
    }


    while (i <= mid) temp[k++] = arr[i++];
    while (j <= right) temp[k++] = arr[j++];

    for (int t = left; t <= right; t++) {
        arr[t] = temp[t];
    }
}