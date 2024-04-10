#include <stdio.h>
#include <string.h>

#define SIZE 1000

int main() {
    int T;
    char str[1000];

    scanf("%d", &T);

    while (T--) {
        scanf("%s", str);
        int len = strlen(str);
        printf("%c%c\n", str[0], str[len-1]);
    }

    return 0;
}
