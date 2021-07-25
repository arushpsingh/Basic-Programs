import java.util.Scanner;

class FibonacciSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Which place number you want ?");
    int n = sc.nextInt();
    System.out.println(fib(n));
  }

  public static int fib(int num) {
    if(num == 1)
      return 0;
    if(num == 2 || num == 3)
      return 1;
    return (fib(num - 1) + fib(num - 2));
  }
}