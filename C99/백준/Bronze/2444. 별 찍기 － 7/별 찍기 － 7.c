#include <stdio.h>

int main() {
    int num;

    scanf("%d", &num);

    // 상단 부분
    for (int i = 1; i <= num; i++) {
        for (int j = 1; j <= num - i; j++) {
            printf(" ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
            printf("*");
        }
        printf("\n");
    }

    // 하단 부분
    for (int i = num - 1; i >= 1; i--) {
        for (int j = 1; j <= num - i; j++) {
            printf(" ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
            printf("*");
        }
        printf("\n");
    }

    return 0;
}
