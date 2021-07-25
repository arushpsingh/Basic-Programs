import java.util.Scanner;

public class PrimeNumber {
  public static boolean isPrime(int n) {
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    if (isPrime(n)) {
      System.out.println("It is Prime");
    }else{
      System.out.println("It is not Prime");
    }
  } 
}
