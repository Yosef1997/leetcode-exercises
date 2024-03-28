import java.util.Arrays;

public class no58 {
  public int lengthOfLastWord(String s) {
    String[] arr = s.split(" ");
    System.out.println(Arrays.toString(arr));
    int result = arr[arr.length - 1].length();
    return result;
  }
}
