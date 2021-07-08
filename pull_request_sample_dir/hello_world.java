public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println(test("one"));
  }

  /* PMD test: UseEqualsToCompareStrings */
  public static boolean test(String s) {
    if (s == "one") return true;
    if ("two".equals(s)) return true;
    return false; }
}

   