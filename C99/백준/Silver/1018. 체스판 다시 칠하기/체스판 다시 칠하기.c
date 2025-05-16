#include <stdio.h>

int min(int a, int b) {
    return a < b ? a : b;
}

int main(void) {
    int N, M;
    char board[50][50];
    int min_cnt = 64; // 최대 8x8 다 바꿔야 하는 경우

    scanf("%d %d", &N, &M);

    // 체스판 입력 받기
    for (int i = 0; i < N; i++) {
        scanf("%s", board[i]);
    }

    // 모든 8x8 영역을 탐색
    for (int i = 0; i <= N - 8; i++) {
        for (int j = 0; j <= M - 8; j++) {
            int cnt1 = 0; // 'W' 시작
            int cnt2 = 0; // 'B' 시작

            for (int x = 0; x < 8; x++) {
                for (int y = 0; y < 8; y++) {
                    // 현재 위치의 예상 색 계산
                    char expected1 = ((x + y) % 2 == 0) ? 'W' : 'B'; // 시작이 W
                    char expected2 = ((x + y) % 2 == 0) ? 'B' : 'W'; // 시작이 B

                    if (board[i + x][j + y] != expected1) cnt1++;
                    if (board[i + x][j + y] != expected2) cnt2++;
                }
            }

            int local_min = min(cnt1, cnt2);
            if (local_min < min_cnt)
                min_cnt = local_min;
        }
    }

    printf("%d\n", min_cnt);
    return 0;
}
