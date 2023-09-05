import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int a=scanner.nextInt();
    int b=scanner.nextInt();
    
    scanner.close();// scanner 닫기

    if (a>b) System.out.println(">");
    else if (a<b) System.out.println("<");
    else System.out.println("==");
}
