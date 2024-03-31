import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class no137 {
  public static int[] singleNumber(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    String r = "";
    for (int num : nums) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      }else {
        map.put(num, 1);
      }
    }
    for (Map.Entry<Integer, Integer> i : map.entrySet()) {
      if (i.getValue() == 1) {
        r+=i.getKey();
      }
    }
    int[] result = new int[r.length()];
    for (int i = 0; i < r.length(); i++) {
      result[i] = Character.getNumericValue(r.charAt(i));
    }
    return result;
  }

  public static void main(String[] args) {
    //   int[] nums = {2, 2, 3, 2, 4};
    //   int[] nums = {0,1,0,1,0,1,99};
    int[] nums = {1, 2, 1, 3, 2, 5};
    System.out.println(Arrays.toString(singleNumber(nums)));
  }
}
