public class ReverseString3 {
  public static String rev(String str) {
    String a = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      a += str.charAt(i);
    }
    return a;
  }
  public static void main(String[] args) {
    String s1 = "My name is Arush";
    String s2[] = s1.split(" ");
    String s3 = "";
    for (int i = 0; i < s2.length; i++) {
      s3 += rev(s2[i] + " ");
    }
    System.out.print(s3);
  }
}
