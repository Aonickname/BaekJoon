#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int x;
    int y;
} Point;

void merge(Point* arr, Point* temp, int left, int mid, int right){
    int i = left, j = mid + 1, k = left;

    while(i <= mid && j <= right) {
        if (arr[i].x < arr[j].x || (arr[i].x == arr[j].x && arr[i].y <= arr[j].y))
            temp[k++] = arr[i++];
        else
            temp[k++] = arr[j++];
    }

    while(i <= mid) temp[k++] = arr[i++];
    while(j <= right) temp[k++] = arr[j++];

    for(int l = left; l <= right; l++)
        arr[l] = temp[l];
}


void merge_sort(Point* arr, Point* temp, int left, int right){
    if(left >= right)
        return;
    
    int mid = (left + right) / 2;
    merge_sort(arr, temp, left, mid);
    merge_sort(arr, temp, mid + 1, right);
    merge(arr, temp, left, mid, right);

}

int main(void){
    int N;
    scanf("%d", &N);

    Point* arr = malloc(sizeof(Point) * N);
    Point* temp = malloc(sizeof(Point) * N);

    for (int i = 0; i < N; i++){
        scanf("%d %d", &arr[i].x, &arr[i].y);
    }

    merge_sort(arr, temp, 0, N - 1);


    for (int i = 0; i < N; i++){
        printf("%d %d\n", arr[i].x, arr[i].y);
    }

    free(arr);
    free(temp);

    return 0;
}