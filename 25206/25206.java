import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] name = new String[20];
        String[] grade = new String[20];
        double[] credit = new double[20];

        double sumCredit = 0.0;
        double temp;
        double res = 0.0;

        for (int i = 0; i < 20; i++) {
            name[i] = scanner.next();
            credit[i] = scanner.nextDouble();
            grade[i] = scanner.next();

            if (grade[i].charAt(0) == 'P') {
                continue;
            }

            sumCredit += credit[i];

            if (grade[i].charAt(0) == 'F') {
                continue;
            }

            if (grade[i].charAt(1) == '+') {
                if (grade[i].charAt(0) == 'A') {
                    temp = 4.5;
                } else if (grade[i].charAt(0) == 'B') {
                    temp = 3.5;
                } else if (grade[i].charAt(0) == 'C') {
                    temp = 2.5;
                } else if (grade[i].charAt(0) == 'D') {
                    temp = 1.5;
                } else {
                    temp = 0.0;
                }
            } else if (grade[i].charAt(1) == '0') {
                if (grade[i].charAt(0) == 'A') {
                    temp = 4.0;
                } else if (grade[i].charAt(0) == 'B') {
                    temp = 3.0;
                } else if (grade[i].charAt(0) == 'C') {
                    temp = 2.0;
                } else if (grade[i].charAt(0) == 'D') {
                    temp = 1.0;
                } else {
                    temp = 0.0;
                }
            } else {
                temp = 0.0;
            }

            res += credit[i] * temp;
        }

        System.out.printf("%f", res / sumCredit);
    }
}
