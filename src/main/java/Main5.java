import java.util.StringJoiner;

public class Main5 {
    public static void main(String[] args) {
        String firstName = "Vasya";
        String secondName = "Ignat";
        String thirdName = "Muslim";

        StringJoiner stringJoinerAllNames = new StringJoiner(", ");
        stringJoinerAllNames.add(firstName);
        stringJoinerAllNames.add(secondName);
        stringJoinerAllNames.add(thirdName);

        String listAllNames = String.join("\n", firstName, secondName, thirdName);

        System.out.println(stringJoinerAllNames);
        System.out.println(listAllNames);
    }
}
