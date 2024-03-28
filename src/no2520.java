public class no2520 {
  public static int countDigits(int num) {
    String a = Integer.toString(num);
    String[] arr= a.split("");
    int c = 0;
    for (int i=0;i<arr.length;i++) {
      System.out.println("==" + Integer.parseInt(arr[i]));
      if (num%Integer.parseInt(arr[i])==0) c++;
    }
    return c;
  }

  public static void main(String[] args) {
    int n = 121;
    System.out.println(countDigits(n));
  }
}
