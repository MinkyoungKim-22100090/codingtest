import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[] arr = new int[26]; 
    
    String word = scanner.next(); 
    
    for(int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (Character.isLowerCase(c)) {
        arr[c - 'a']++;
      }
    }
    
    for(int i = 0; i < 26; i++) {
      System.out.printf("%d ", arr[i]); 
    }
    
    scanner.close(); 
  }
}
