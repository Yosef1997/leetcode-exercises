public class no169 {
  public static int majorityElement(int[] nums) {
    int n = nums.length;
    int count = 1;
    int result = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
      if (count > n / 2) {
        result = nums[i];
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = {3,2,3};
    int[] numss = {2,2,1,1,1,2,2};
    System.out.println(majorityElement(numss));
  }
}
