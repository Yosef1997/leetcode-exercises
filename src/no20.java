public class no20 {
  public static boolean isValid(String s) {
    boolean r=false;
    for (int i=0;i<s.length();i++){
      if(s.charAt(i)=='('&&s.charAt(i+1)==')') return true;
      if(s.charAt(i)==')') return false;
      // if(c=='{'&&s.charAt(i+1)!='}') return false;
      // if(c=='['&&s.charAt(i+1)!=']') return false;
    }
    return r;
  }

  public static void main(String[] args) {
    String s = "()";
    System.out.println(isValid(s));
  }
}
