#include <stdio.h>

int main(void){
    int a, b, c, d, e, f;
    int x, y;

    scanf("%d %d %d %d %d %d", &a, &b, &c, &d, &e, &f);

    x = (c * e - b * f) / (a * e - b * d);
    y = (a * f - c * d) / (a * e - b * d);

    printf("%d %d\n", x, y);
    

    return 0;
}