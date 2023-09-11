#include <stdio.h>

int main() {

  char name[51];
  char grade[3];
  double credit;

  double sumCredit = 0.0;
  double temp;
  double res = 0.0;
  for(int i = 0; i < 20; i++) {
    scanf("%s %lf %s", name, &credit, grade);
    if(grade[0] == 'P') continue;
    
    sumCredit += credit;
    if(grade[0] == 'F') continue;

    if (grade[1] == '+') {
      if (grade[0] == 'A') temp = 4.5;
      else if (grade[0] == 'B') temp = 3.5;
      else if (grade[0] == 'C') temp = 2.5;
      else if (grade[0] == 'D') temp = 1.5;
    }
    else if (grade[1] == '0') {
      if (grade[0] == 'A') temp = 4.0;
      else if (grade[0] == 'B') temp = 3.0;
      else if (grade[0] == 'C') temp = 2.0;
      else if (grade[0] == 'D') temp = 1.0;
      else if (grade[0] == 'F') temp = 0.0;
    }

    res += credit * temp;
  }

  printf("%lf", res / sumCredit);

  return 0;
}
