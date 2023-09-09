import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 수
        int M = 0; // 최대 점수
        float T = 0; // 점수 합
        int[] score = new int[N]; // 점수 배열

        for (int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
            if (M < score[i])
                M = score[i];
        }

        for (int i = 0; i < N; i++) {
            T += (float) score[i] / M * 100;
        }

        System.out.printf("%f", T / N);
    }
}
