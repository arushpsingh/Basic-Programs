public class StringCap {
  public static void main(String[] args) {
    String s1 = "My name is aRush";
    s1 = s1.toLowerCase();
    s1 = " " + s1;
    String s2 = "";
    for (int i = 0; i < s1.length(); i++) {
      char ch = s1.charAt(i);
      if (ch == ' ') {
        s2 += ch;
        i++;
        ch = s1.charAt(i);
        s2 += Character.toUpperCase(ch);
      } else {
        s2 += ch;
      }
    }
    s2 = s2.trim();
    System.out.print(s2);
  }
}
