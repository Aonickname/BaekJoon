#include <stdio.h>

int main(void){
    int arr[9];
    int max = 0;
    int seq = 0;

    for (int i = 0; i < 9; i++)
    {
        scanf("%d",&arr[i]);
    }

    for (int i = 0; i < 9; i++)
    {
        max = (arr[i] > max ? arr[i] : max);
    }

    for (int i = 0; i < 9; i++)
    {
        seq++;
        if(max == arr[i])
            break;
            
    }
    
    printf("%d\n",max);
    printf("%d",seq);

    return 0;
}
