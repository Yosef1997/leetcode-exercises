import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class no2828 {
  public static boolean isAcronym(List<String> words, String s) {
    StringBuilder r=new StringBuilder();
    for (String str:words){
      r.append(str.charAt(0));
    }
    return r.toString().equals(s);
  }

  public static void main(String[] args) {
    List<String> s= new ArrayList<>(Arrays.asList("alice","cob","charlie"));
    System.out.println(isAcronym(s, "abc"));
  }
}
