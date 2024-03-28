import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class no1929 {
  public static int[] getConcatenation(int[] nums) {
    int[] newArr = new int[nums.length * 2];
    System.arraycopy(nums, 0, newArr, 0, nums.length);
    System.arraycopy(nums, 0, newArr, nums.length, nums.length);

    return newArr;
  }

  public static void main(String[] args) {
    int[] nums = {1,2,1};
    System.out.println(Arrays.toString(getConcatenation(nums)));
  }
}
