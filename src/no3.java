import java.util.HashSet;
import java.util.Set;

public class no3 {
  public static int lengthOfLongestSubstring(String s) {
    String[] sArr = s.split("");
    Set<String> uniqueArr = new HashSet<String>();

    for(String sElement: sArr){
      uniqueArr.add(sElement);
    }

    String uniqueString = String.join("",uniqueArr);
    String result = uniqueString.substring(uniqueString.length());

    System.out.println("result = " + result);
    return uniqueArr.size();
  }
  public static void main(String[] args) {
    String s = "abcabcbb";
    lengthOfLongestSubstring(s);
  }
}
