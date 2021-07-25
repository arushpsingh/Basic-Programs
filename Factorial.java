import java.util.Scanner;

public class Factorial {
  public static int fact(int num) {
    int sum=0;
    for (int i = 1; i < num; i++) {
      sum += num * i;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(fact(n));
  }
}
