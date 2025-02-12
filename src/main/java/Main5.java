import java.util.StringJoiner;

public class Main5 {
    public static void main(String[] args) {
        String firstName = "Vasya";
        String secondName = "Ignat";
        String thirdName = "Muslim";

        StringJoiner stringJoiner = new StringJoiner(", ");
        stringJoiner.add(firstName);
        stringJoiner.add(secondName);
        stringJoiner.add(thirdName);

        System.out.println(stringJoiner);
    }
}
