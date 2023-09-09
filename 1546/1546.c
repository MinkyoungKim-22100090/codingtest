#include <stdio.h>

int main(void) {

  int N;       // 수
  int M = 0;   //최대 점수
  float T = 0; //점수 합

  scanf("%d", &N);
  int score[N]; //점수 배열

  for (int i = 0; i < N; i++) {
    scanf("%d", &score[i]);
    if (M < score[i])
      M = score[i];
  }

  for (int i = 0; i < N; i++) {
    T += (float)score[i] / M * 100;
  }

  printf("%f", T / N);
  return 0;
}
