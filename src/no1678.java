import java.util.Arrays;

public class no1678 {
  public static String interpret(String command) {
    // declare answer string
    String ans = "";
    // declare prev and set to false
    boolean prev = false;
    // iterate over command string
    for (int i = 0; i < command.length(); i++) {
      // get current char
      char c = command.charAt(i);
      // check if char is open bracket, if true set prev as true
      if (c == '(') prev = true;
        // check that char is closing bracket and prev is true, if true add "o" to answer
      else if (c == ')' && prev) ans += "o";
        // check if char is letter:
      else if (c != ')' && c != '(') {
        // if true set prev to false
        prev = false;
        // add letter to answer
        ans += c;
      }
    }
    // return answer
    return ans;
  }

  public static void main(String[] args) {
    String s = "G()(al)";
    String sa = "(al)G(al)()()G";
    System.out.println(interpret(s));
  }
}
