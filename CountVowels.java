public class CountVowels {
  public static void main(String[] args) {
    String s1 = "This is a String";
    s1 = s1.toLowerCase();
    char[] ch = s1.toCharArray();
    int c = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
          || s1.charAt(i) == 'u') {
        c++;
      }
    }
    System.out.println("No of vowels in this string are: " + c);
  }
}
