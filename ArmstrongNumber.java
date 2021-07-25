import java.util.Scanner;

public class ArmstrongNumber {
  public static boolean isArmstrong(int n) {
    int temp = n, r, sum = 0;
    while (n > 0) {
      r = n % 10;
      sum += r * r * r;
      n /= 10;
    }
    if (sum == temp)
      return true;
    else
      return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(isArmstrong(n))
      System.out.println("It is Armstrong Number");
    else
      System.out.println("It is not Armstrong Number");
  }
}