import java.util.*;

public class no169 {
  public static int majorityElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    float n = (float) nums.length / 2;
    int result = 0;
    for (int i : nums) {
      if (map.containsKey(i)) {
        map.put(i, map.get(i) + 1);
      } else {
        map.put(i, 1);
      }
    }
    System.out.println(n);
    for (Map.Entry<Integer, Integer> set : map.entrySet()) {
      if (set.getValue() > (n)) {
        result = set.getKey();
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = {3, 2, 3};
    int[] numss = {2, 2, 1, 1, 1, 2, 2};
    System.out.println(majorityElement(nums));
  }
}
