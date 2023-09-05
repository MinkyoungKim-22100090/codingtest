/*
A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.
-10,000 ≤ A, B ≤ 10,000
*/

#include <stdio.h>

int main(void) {
  int a, b;
	scanf("%d %d", &a, &b);

  if(a>b) printf(">");
  else if (a<b) printf("<");
  else printf("==");
  return 0;
}
