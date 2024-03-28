public class no1662 {
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    StringBuilder newW1 = new StringBuilder();
    for (String w1 : word1) {
      newW1.append(w1);
    }
    StringBuilder newW2 = new StringBuilder();
    for (String w2 : word2) {
      newW2.append(w2);
    }
    System.out.println(newW1.toString());
    System.out.println(newW2.toString());
    if (newW1.toString().contentEquals(newW2)) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {

  }
}
