import java.util.Arrays;
import java.util.Objects;

public class no9 {
  public static boolean isPalindrome(int x) {
    String[] arr = Integer.toString(x).split("");
    for (int i = 0; i < arr.length; i++){
      System.out.println(Objects.equals(arr[i], arr[arr.length - 1]));
      if(!Objects.equals(arr[i], arr[arr.length - i - 1])){
        return false;
      }
    }
    return true;
  };

  public static void main(String[] args) {
    int numbers = 121;
    int nums = -121;
    int num = 1000021;
    System.out.println("result = " + isPalindrome(numbers));
  }
}
