// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    String test = "ab" + "cd";
    test = "11";

    // 123 will be treated as String
    test = "555" + 123;
    System.out.println(test);
  }
}
