import java.util.Arrays;

public class no1 {
  public static int[] twoSum(int[] nums, int target) {
    int[] result = {};
    for (int i = 0; i <= nums.length-1; i++){
      if(nums[i] + nums[i+1] == target){

        result = new int[]{i, i+1};
        System.out.println(result);
        break;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = {3,2,3};
    int target = 6;
    System.out.println("result = " + Arrays.toString(twoSum(nums, target)));
  }
}
