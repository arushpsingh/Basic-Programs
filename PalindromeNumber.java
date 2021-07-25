import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String...args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int n = 0, temp=num, r;
    while (temp > 0) {
      r = temp % 10;
      n = (n*10) + r;
      temp /= 10;
    }
    if (n == num)
      System.out.println("It is Palindrome");
    else
      System.out.println("It is not Palindrome");
  }
}
