// You can experiment here, it won’t be checked

public class Task {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = new String("ABC");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str3));
    }
}
