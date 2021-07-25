import java.util.Scanner;

class RemoveDuplicates {
  public static void main(String...args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size");
    int n = sc.nextInt();
    System.out.println("Enter elements");
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Array : ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.print("Array after removing duplicates : ");
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] == arr[i + 1]) {

      } else {
        System.out.print(arr[i]+" ");
      }
    }
    System.out.println(arr[arr.length - 1]);
  }
}