
public class Main {
    public static void main(String[] args) {
        String hello = "Hello";
        char[] chars = hello.toCharArray();
        int countIndex = hello.length() - 1;

        for (char ch : chars) {
            System.out.println(hello.charAt(countIndex));
            countIndex -= 1;
        }
    }
}
